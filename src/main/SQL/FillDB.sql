SELECT * FROM clients;
INSERT INTO clients (username, passhash, email) VALUES('admin2', 'pass', 'email@gmail.com');
INSERT INTO clients (username, passhash, email) VALUES('Vasya', 'pass1', 'email1@gmail.com');
INSERT INTO clients (username, passhash, email) VALUES('Petya', 'pass2', 'email2@gmail.com');
INSERT INTO clients (username, passhash, email) VALUES('Vova', 'pass3', 'email3@gmail.com');
SELECT * FROM clients;

SELECT * FROM shops;
INSERT INTO shops (shop_name, address, rating_pos, rating_neg, url) 
	VALUES('silpo', 'Kiev, 12 Potapova ave', 100, 10, 'http://www.siplo.ua');
INSERT INTO shops (shop_name, address, rating_pos, rating_neg, url) 
	VALUES('silpo', 'Kiev, 45 Pirogova ave', 430, 330, 'http://www.siplo.ua');
INSERT INTO shops (shop_name, address, rating_pos, rating_neg, url) 
	VALUES('fora', 'Kiev, 12 Potapova ave', 232, 10, 'http://www.fora.ua');
INSERT INTO shops (shop_name, address, rating_pos, rating_neg, url) 
	VALUES('atb', 'Urugvay, 22 Ugaday ave', 1, 10, 'http://www.atb.ua');
SELECT * FROM shops;

SELECT * FROM categories;
INSERT INTO categories (level_num, category_name) VALUES(0, "books");
INSERT INTO categories (level_num, category_name, parent_category) VALUES(1, "kinder books", 1);
INSERT INTO categories (level_num, category_name) VALUES(0, "guns");
INSERT INTO categories (level_num, category_name, parent_category) VALUES(1, "automats", 3);
SELECT * FROM categories;

SELECT * FROM manufacturers;
INSERT INTO manufacturers (manufacturer_name) VALUES("HarMash");
INSERT INTO manufacturers (manufacturer_name) VALUES("KuZma");
INSERT INTO manufacturers (manufacturer_name) VALUES("Bukva");
SELECT * FROM manufacturers;

SELECT * FROM goods;
INSERT INTO goods (good_name, rating_pos, rating_neg, category_id, manufacturer_id) 
	VALUES("kalash", 100, 0, 4, 1);
INSERT INTO goods (good_name, rating_pos, rating_neg, category_id, manufacturer_id) 
	VALUES("azbuka", 192, 20, 2, 3);
INSERT INTO goods (good_name, rating_pos, rating_neg, category_id, manufacturer_id) 
	VALUES("Neznaika", 3, 0, 2, 3);
INSERT INTO goods (good_name, category_id, manufacturer_id) 
	VALUES("Zaznaika", 2, 3);
INSERT INTO goods (good_name, rating_pos, rating_neg, category_id, manufacturer_id) 
	VALUES("knife", 100, 0, 3, 2);
SELECT * FROM goods;

SELECT * FROM exist_goods;
INSERT INTO exist_goods (shop_id, good_id, qty, price) 
	VALUES(1, 1, 10, 10.45);
INSERT INTO exist_goods (shop_id, good_id, qty, price) 
	VALUES(2, 1, 13, 10.65);
INSERT INTO exist_goods (shop_id, good_id, qty, price) 
	VALUES(3, 1, 100, 13.35);
INSERT INTO exist_goods (shop_id, good_id, qty, price) 
	VALUES(4, 1, 120, 11.45);

INSERT INTO exist_goods (shop_id, good_id, qty, price) 
	VALUES(1, 2, 102, 103.45);
INSERT INTO exist_goods (shop_id, good_id, qty, price) 
	VALUES(2, 2, 123, 10.65);
INSERT INTO exist_goods (shop_id, good_id, qty, price) 
	VALUES(3, 2, 15400, 13.335);
INSERT INTO exist_goods (shop_id, good_id, qty, price) 
	VALUES(4, 2, 1230, 11.45);

INSERT INTO exist_goods (shop_id, good_id, qty, price) 
	VALUES(1, 3, 130, 102.45);
INSERT INTO exist_goods (shop_id, good_id, qty, price) 	
	VALUES(2, 3, 23, 1035);
INSERT INTO exist_goods (shop_id, good_id, qty, price)
	VALUES(3, 4, 120, 13.35);
INSERT INTO exist_goods (shop_id, good_id, qty, price) 
	VALUES(4, 5, 140, 15);

SELECT * FROM exist_goods;


SELECT * FROM subscriptions;

INSERT INTO subscriptions (shop_id, good_id, client_id) VALUES(1,1,1);
INSERT INTO subscriptions (shop_id, good_id, client_id) VALUES(2,1,1);
INSERT INTO subscriptions (shop_id, good_id, client_id) VALUES(3,1,1);
INSERT INTO subscriptions (shop_id, good_id, client_id) VALUES(4,1,1);

INSERT INTO subscriptions (shop_id, good_id, client_id) VALUES(1,2,1);
INSERT INTO subscriptions (shop_id, good_id, client_id) VALUES(2,2,1);

INSERT INTO subscriptions (shop_id, good_id, client_id) VALUES(3,1,2);
INSERT INTO subscriptions (shop_id, good_id, client_id) VALUES(2,1,2);
INSERT INTO subscriptions (shop_id, good_id, client_id) VALUES(1,1,2);
INSERT INTO subscriptions (shop_id, good_id, client_id) VALUES(2,3,3);
INSERT INTO subscriptions (shop_id, good_id, client_id) VALUES(1,3,3);
INSERT INTO subscriptions (shop_id, good_id, client_id) VALUES(3,3,3);
INSERT INTO subscriptions (shop_id, good_id, client_id) VALUES(2,2,4);
INSERT INTO subscriptions (shop_id, good_id, client_id) VALUES(4,1,4);

SELECT * FROM subscriptions;
