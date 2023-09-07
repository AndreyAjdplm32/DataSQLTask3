CREATE TABLE ORDERS (
                        id INT AUTO_INCREMENT NOT NULL,
                        date DATE NOT NULL,
                        customer_id INT NOT NULL,
                        product_name VARCHAR(255) NOT NULL,
                        amount DECIMAL(10, 2) NOT NULL,
                        PRIMARY KEY (id),
                        FOREIGN KEY (customer_id) REFERENCES mysql.customers(id)
);

CREATE TABLE CUSTOMERS
(
    id           INT AUTO_INCREMENT NOT NULL,
    name         VARCHAR(255) NOT NULL,
    surname      VARCHAR(255),
    age          VARCHAR(150) NOT NULL,
    phone_number VARCHAR(50),
    PRIMARY KEY (id)
);

insert into CUSTOMERS (id, name, surname, age, phone_number) VALUES (1,'Andrey','Andri','10','25');
insert into ORDERS (date, customer_id, product_name, amount) VALUES ('2094-03-04 00:00:00', 1, 'Sevr', 5);