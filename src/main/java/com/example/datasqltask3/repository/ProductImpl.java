package com.example.datasqltask3.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;


import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


import java.util.HashMap;
import java.util.List;

import java.util.stream.Collectors;

@Repository
public class ProductImpl implements Product {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private final String mySql = ("JoinScript.sql");


    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream(); BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<String> getProductByName(String name) {
        return namedParameterJdbcTemplate.queryForList(read(mySql), new HashMap<>(), String.class).stream().toList();
    }


}
