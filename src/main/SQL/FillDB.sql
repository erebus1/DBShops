Select * From clients;
Insert into clients (username, passhash, email) values('admin2', 'pass', 'email@gmail.com');
Insert into clients (username, passhash, email) values('Vasya', 'pass1', 'email1@gmail.com');
Insert into clients (username, passhash, email) values('Petya', 'pass2', 'email2@gmail.com');
Insert into clients (username, passhash, email) values('Vova', 'pass3', 'email3@gmail.com');
Select * From clients;

Select * From shops;
Insert Into shops (shop_name, address, rating_pos, rating_neg, url) values('silpo', 'Kiev, 12 Potapova ave', 100, 10, 'http://www.siplo.ua');
Insert Into shops (shop_name, address, rating_pos, rating_neg, url) values('silpo', 'Kiev, 45 Pirogova ave', 430, 330, 'http://www.siplo.ua');
Insert Into shops (shop_name, address, rating_pos, rating_neg, url) values('fora', 'Kiev, 12 Potapova ave', 232, 10, 'http://www.fora.ua');
Insert Into shops (shop_name, address, rating_pos, rating_neg, url) values('atb', 'Urugvay, 22 Ugaday ave', 1, 10, 'http://www.atb.ua');
Select * From shops;

Select * from categories;
Insert into categories (level_num, category_name) values(0, "books");
Insert into categories (level_num, category_name, parent_category) values(1, "kinder books", 1);
Insert into categories (level_num, category_name) values(0, "guns");
Insert into categories (level_num, category_name, parent_category) values(1, "automats", 3);
Select * from categories;

Select * from manufacturers;
Insert into manufacturers (manufacturer_name) values("HarMash");
Insert into manufacturers (manufacturer_name) values("KuZma");
Insert into manufacturers (manufacturer_name) values("Bukva");
Select * from manufacturers;

Select * from goods;
Insert into goods (good_name, rating_pos, rating_neg, category_id, manufacturer_id) 
	values("kalash", 100, 0, 4, 1);
Insert into goods (good_name, rating_pos, rating_neg, category_id, manufacturer_id) 
	values("azbuka", 192, 20, 2, 3);
Insert into goods (good_name, rating_pos, rating_neg, category_id, manufacturer_id) 
	values("Neznaika", 3, 0, 2, 3);
Insert into goods (good_name, category_id, manufacturer_id) 
	values("Zaznaika", 2, 3);
Insert into goods (good_name, rating_pos, rating_neg, category_id, manufacturer_id) 
	values("knife", 100, 0, 3, 2);
Select * from goods;

Select * from exist_goods;
Insert into exist_goods (shop_id, good_id, qty, price) values(1, 1, 10, 10.45);
Insert into exist_goods (shop_id, good_id, qty, price) values(2, 1, 13, 10.65);
Insert into exist_goods (shop_id, good_id, qty, price) values(3, 1, 100, 13.35);
Insert into exist_goods (shop_id, good_id, qty, price) values(4, 1, 120, 11.45);

Insert into exist_goods (shop_id, good_id, qty, price) values(1, 2, 102, 103.45);
Insert into exist_goods (shop_id, good_id, qty, price) values(2, 2, 123, 10.65);
Insert into exist_goods (shop_id, good_id, qty, price) values(3, 2, 15400, 13.335);
Insert into exist_goods (shop_id, good_id, qty, price) values(4, 2, 1230, 11.45);

Insert into exist_goods (shop_id, good_id, qty, price) values(1, 3, 130, 102.45);
Insert into exist_goods (shop_id, good_id, qty, price) values(2, 3, 23, 1035);
Insert into exist_goods (shop_id, good_id, qty, price) values(3, 4, 120, 13.35);
Insert into exist_goods (shop_id, good_id, qty, price) values(4, 5, 140, 15);

Select * from exist_goods;


Select * from subscriptions;

Insert into subscriptions (shop_id, good_id, client_id) values(1,1,1);
Insert into subscriptions (shop_id, good_id, client_id) values(2,1,1);
Insert into subscriptions (shop_id, good_id, client_id) values(3,1,1);
Insert into subscriptions (shop_id, good_id, client_id) values(4,1,1);

Insert into subscriptions (shop_id, good_id, client_id) values(1,2,1);
Insert into subscriptions (shop_id, good_id, client_id) values(2,2,1);

Insert into subscriptions (shop_id, good_id, client_id) values(3,1,2);
Insert into subscriptions (shop_id, good_id, client_id) values(2,1,2);
Insert into subscriptions (shop_id, good_id, client_id) values(1,1,2);
Insert into subscriptions (shop_id, good_id, client_id) values(2,3,3);
Insert into subscriptions (shop_id, good_id, client_id) values(1,3,3);
Insert into subscriptions (shop_id, good_id, client_id) values(3,3,3);
Insert into subscriptions (shop_id, good_id, client_id) values(2,2,4);
Insert into subscriptions (shop_id, good_id, client_id) values(4,1,4);

Select * from subscriptions;
