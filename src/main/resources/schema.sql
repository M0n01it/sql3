CREATE TABLE CUSTOMERS (
                           id INT AUTO_INCREMENT PRIMARY KEY,
                           name VARCHAR(255) NOT NULL,
                           surname VARCHAR(255) NOT NULL,
                           age INT,
                           phone_number VARCHAR(50)
);

CREATE TABLE ORDERS (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        date DATE NOT NULL,
                        customer_id INT NOT NULL,
                        product_name VARCHAR(255) NOT NULL,
                        amount INT,
                        CONSTRAINT fk_customer
                            FOREIGN KEY (customer_id)
                                REFERENCES CUSTOMERS(id)
);