CREATE DATABASE Shops;
USE Shops;
# drop tables
Drop table subscriptions;
Drop table exist_goods;
Drop table goods;
Drop table manufacturers;
Drop table categories;
Drop table shops;
drop table clients;

# create tables
create TABLE clients(id MEDIUMINT NOT NULL AUTO_INCREMENT,
username char(15) not null unique,
passhash char(100) not null,
email char(100) not null unique,
active bool not null default false,
PRIMARY KEY (id));



CREATE TABLE shops(id MEDIUMINT NOT NULL AUTO_INCREMENT,
shop_name char(30) not null,
address char(100) not null,
rating_pos int default 0,
rating_neg int default 0,
url char(100),
PRIMARY KEY (id));


create table categories(
id mediumint not null auto_increment,
level_num int not null default 0,
category_name char(100) unique,
parent_category mediumint,
Foreign key(parent_category) references categories(id),
primary key (id)
);


create table manufacturers(
id mediumint not null auto_increment,
manufacturer_name char(100) not null unique,
Primary key(id)
);


CREATE TABLE goods(
id mediumint not null auto_increment,
good_name char(100) not null,
rating_pos int default 0,
rating_neg int Default 0,
category_id mediumint,
manufacturer_id mediumint not null,
primary key(id),
Foreign Key(category_id) References categories(id),
Foreign Key(manufacturer_id) References manufacturers(id)
);


create table exist_goods(
shop_id mediumint not null,
good_id mediumint not null,
qty long,
price float,
foreign key(shop_id) references shops(id),
foreign key(good_id) references goods(id)
);


CREATE TABLE subscriptions(
shop_id mediumint,
good_id mediumint,
client_id mediumint,
FOREIGN KEY (shop_id) REFERENCES shops(id),
FOREIGN KEY (good_id) REFERENCES goods(id),
FOREIGN KEY (client_id) REFERENCES clients(id)
);





