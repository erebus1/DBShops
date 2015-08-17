CREATE DATABASE Shops;
USE Shops;
# drop tables
DROP TABLE subscriptions;
DROP TABLE exist_goods;
DROP TABLE goods;
DROP TABLE manufacturers;
DROP TABLE categories;
DROP TABLE shops;
DROP TABLE clients;

# CREATE TABLEs
CREATE TABLE clients(id MEDIUMINT NOT NULL AUTO_INCREMENT,
username CHAR(15) NOT NULL UNIQUE,
passhash CHAR(100) NOT NULL,
email CHAR(100) NOT NULL UNIQUE,
active bool NOT NULL DEFAULT FALSE,
PRIMARY KEY (id));



CREATE TABLE shops(id MEDIUMINT NOT NULL AUTO_INCREMENT,
shop_name CHAR(30) NOT NULL,
address CHAR(100) NOT NULL,
rating_pos int DEFAULT 0,
rating_neg int DEFAULT 0,
url CHAR(100),
PRIMARY KEY (id));


CREATE TABLE categories(
id mediumint NOT NULL auto_increment,
level_num int NOT NULL DEFAULT 0,
category_name CHAR(100) UNIQUE,
parent_category mediumint,
FOREIGN KEY(parent_category) REFERENCES categories(id),
PRIMARY KEY (id)
);


CREATE TABLE manufacturers(
id mediumint NOT NULL auto_increment,
manufacturer_name CHAR(100) NOT NULL UNIQUE,
PRIMARY KEY(id)
);


CREATE TABLE goods(
id mediumint NOT NULL auto_increment,
good_name CHAR(100) NOT NULL,
rating_pos int DEFAULT 0,
rating_neg int DEFAULT 0,
category_id mediumint,
manufacturer_id mediumint NOT NULL,
PRIMARY KEY(id),
FOREIGN KEY(category_id) REFERENCES categories(id),
FOREIGN KEY(manufacturer_id) REFERENCES manufacturers(id)
);


CREATE TABLE exist_goods(
shop_id mediumint NOT NULL,
good_id mediumint NOT NULL,
qty LONG,
price FLOAT,
FOREIGN KEY(shop_id) REFERENCES shops(id),
FOREIGN KEY(good_id) REFERENCES goods(id)
);


CREATE TABLE subscriptions(
shop_id mediumint,
good_id mediumint,
client_id mediumint,
FOREIGN KEY (shop_id) REFERENCES shops(id),
FOREIGN KEY (good_id) REFERENCES goods(id),
FOREIGN KEY (client_id) REFERENCES clients(id)
);





