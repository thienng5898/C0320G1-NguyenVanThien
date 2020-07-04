insert into casestudy_database.locations (location_id, location) values 
(1, 'receptionist'),
(2, 'analyst'),
(3, 'supervisor'),
(4, 'serve'),
(5, 'manager'),
(6, 'president');

insert into casestudy_database.degrees (degree_id, degree) values 
(1, 'postgraduate'),
(2, 'University'),
(3, 'Intermediate'),
(4, 'College');

insert into casestudy_database.parts (part_id, part) values 
(1, 'Management'),
(2, 'Administration'),
(3, 'Sale_Marketing'),
(4, 'Service');

insert into casestudy_database.employees (employee_id, employee_name, location_id, degree_id, part_id , birthday, id_card, salary, phone, email, address) values 
(1, 'Hoàng Sư', 6, 2, 2, '1990-11-01', '9073333529', 17000000, '7317778664', 'eabbatt0@va.gov', 'Hà Nội'),
(2, 'Trang Vũ Minh', 3, 4, 2, '1992-01-16', '8162664553', 14000000, '1924323018', 'eaiton1@washingtonpost.com', 'Hồ Chí Minh'),
(3, 'Tô Ðông Hải', 3, 1, 3, '1999-12-30', '2757140683', 10000000, '7459688518', 'tcruden2@printfriendly.com', 'Đà Nẵng'),
(4, 'Ngô Thuận Phương', 4, 3, 4, '1992-04-26', '4698842699', 3000000, '1163136925', 'tpim3@usnews.com', 'Cà Mau'),
(5, 'Phạm Đức Cao', 2, 2, 1, '2000-05-11', '7512299538',5000000, '1437999045', 'aklimas4@wikia.com', 'Phú Yên'),
(6, 'Lý Bảo Thái', 1, 3, 4, '1995-09-28', '9623365611',4000000, '8553482001', 'iwyllis5@mit.edu', 'Quảng Trị'),
(7, 'Đoàn Thành Danh', 1, 2, 1, '1999-02-18', '9021108961', 5000000, '9142594448', 'araynham6@indiegogo.com', 'Hồ Chí Minh'),
(8, 'Tạ Nam Sơn', 5, 1, 3, '1993-05-02', '3346007881', 9000000, '6052045306', 'aleverett7@npr.org', 'Quảng Nam'),
(9, 'Dương Thanh Vũ', 4, 3, 4, '2000-01-23', '2275085640', 3000000, '3776360729', 'eprettejohns8@prlog.org', 'Cần Thơ'),
(10, 'Kiều Nguyệt', 2, 2, 1, '1993-11-10', '7495171471', 8000000, '7091820119', 'dhacksby9@apache.org', 'Đà Nẵng'),
(11, 'Châu Hoàng Oanh', 1, 4, 3, '1995-09-12', '4569050845', 4000000, '4797097744', 'gbletchera@g.co', 'Quảng Nam'),
(12, 'Nguyễn Như Thảo', 4, 2, 3, '1994-01-16', '3787317413', 7000000, '2473143566', 'elandeb@springer.com', 'Quảng Trị'),
(13, 'Đặng Tú Sương', 5, 2, 1, '1997-10-10', '6757234668', 9000000, '5477003824', 'lkleszinskic@blogs.com', 'Hà Nội'),
(14, 'Bành Kiều Giang', 4, 2, 4, '1992-03-05', '3115766078', 6000000, '8598036935', 'qstoeckled@unesco.org', 'Quảng Nam'),
(15, 'Hồng Bảo', 3, 4, 1, '1995-06-02', '3812613749', 6000000, '7438068402', 'gbellorde@epa.gov', 'Đà Nẵng');

insert into casestudy_database.typecustomers (typecustomer_id, typecustomer) values 
(1, 'Diamond'),
(2, 'Platinium'),
(3, 'Gold'),
(4, 'Silver'),
(5, 'Member');

insert into casestudy_database.typerents (typerent_id, typerent) values 
(1, 'hour'),
(2, 'day'),
(3, 'month'),
(4, 'year');

insert into casestudy_database.typeservices (typeservice_id, typeservice) values 
(1, 'Villa'),
(2, 'house'),
(3, 'room');

insert into casestudy_database.bonusservices (bonusservice_id, bonusservice, price, unit ,status_available) values 
(1, 'karaoke',1000000,5,'available'),
 (2, 'massage',500000,4,'available'),
 (3, 'drink',100000,2,'unavailable'),
 (4, 'food',200000,2,'available'),
(5, 'car_rental',400000,1,'unavailable');

insert into casestudy_database.services (service_id, service_name, area ,number_floors ,number_max_people, rent_cost, typerent_id, typeservice_id,status) values 
(1 ,'room1' ,100 ,1 ,2 ,200000 ,1,3,'available'),
(2 ,'room2' ,200 ,1 ,4 ,500000 ,2,3,'unavailable'),
 (3 ,'room3' ,300 ,1 ,5 ,1000000 ,2,3,'available'),
(4 ,'room4' ,120 ,1 ,2 ,300000 ,2,3,'available'),
(5 ,'room5' ,80 ,1 ,2 ,150000 ,1,3,'unavailable'),
(6 ,'room6' ,150 ,1 ,2 ,200000 ,1,3,'available'),
(7 ,'room7' ,200 ,1 ,2 ,350000 ,1,3,'available'),
(8 ,'room8' ,100 ,1 ,2 ,200000 ,1,3,'available'),
 (9 ,'house1' ,100 ,1 ,2 ,300000 ,3,2,'unavailable'),
 (10 ,'house2' ,200 ,2 ,4 ,600000 ,2,2,'available'),
 (11 ,'house3' ,300 ,1 ,4 ,500000 ,3,2,'available'),
 (12 ,'house4' ,250 ,2 ,5 ,400000 ,3,2,'available'),
 (13 ,'house5' ,400 ,2 ,3 ,900000 ,2,2,'available'),
(14 ,'house6' ,80 ,1 ,2 ,200000 ,2,2,'available'),
(15 ,'house7' ,450 ,2 ,6 ,1000000 ,3,2,'available'),
 (16 ,'house8' ,700 ,2 ,5 ,1200000 ,2,2,'available'),
(17 ,'villa1' ,500 ,2 ,7 ,2000000 ,2,1,'available'),
(18 ,'villa2' ,550 ,3 ,8 ,2500000 ,2,1,'unavailable'),
(19 ,'villa3' ,600 ,3 ,10 ,3500000 ,2,1,'available'),
(20 ,'villa4' ,750 ,5 ,15 ,5000000 ,2,1,'unavailable'),
(21 ,'villa5' ,400 ,4 ,12 ,4000000 ,2 ,1,'unavailable'),
(22 ,'villa6' ,300 ,2 ,4 ,2000000 ,2 ,1,'available'),
(23 ,'villa7' ,350 ,2 ,6 ,3000000 ,2 ,1,'available');

insert into casestudy_database.customers(customer_id, typecustomer_id ,customer_name ,birthday ,id_card ,phone,email ,address) values 
(1,1,'Nguyễn Quang Hải','1992-05-08','142566398','842536033','haiocho@gmail.com','Quảng Nam') ,
(2,2,'Lê Phương Thủy','1990-04-15','486259310','841520333','thuyngunguc@gmail.com','Quảng Ngãi') ,
(3,1,'Quang Hữu Vĩnh','1982-08-18','487552378','841569320','vinhoc@gmail.com','Quảng Ngãi') ,
(4,2,'Quyền Việt Sơn','1988-12-20','148742338','841593572','sonqq@gmail.com','Nghệ An') ,
(5,1,'Đặng Trọng Hùng','1975-02-08','125564028','840254133','hungngu@gmail.com','Vinh') ,
(6,4,'Nguyễn Hoàn Vi','1995-01-15','526488874','840142563','hvikhung@gmail.com','Hồ Chí Minh') ,
(7,5,'Nguyễn Khánh Trang','1985-10-23','254780236','842586314','tranglulu@gmail.com','Bình Định') ,
(8,2,'Nguyễn Diệu Ái','1950-05-02','256987741','840256314','ainhinhanh@gmail.com','Đà Nẵng') ,
(9,1,'Vũ Hương Ly','1979-07-02','63541200','844781203','lysitinh@gmail.com','Đà Nẵng') ,
(10,1,'Nguyễn Ðức Kiên','1992-06-08','324566398','842036987','khangbb@gmail.com','Quảng Ngãi') ,
(11,2,'Nguyễn Khánh Trang','1998-07-21','122366398','847482364','tannu@gmail.com','Hà Nội') ,
(12,3,'Nguyễn Ðức Kiên','1992-11-23','123466398','849875632','kienhay@gmail.com','Lạng Sơn') ,
(13,4,'Phạm Nguyên Ðan','1992-08-24','156766398','848475632','danchi@gmail.com','Ninh Bình') ,
(14,4,'Hồ Hồng Mai','1945-06-15','142678398','849852140','hongmai@gmail.com','Huế') ,
(15,1,'Lý Hồng Oanh','1982-04-14','1412236398','840214587','oanhaa@gmail.com','Quảng Ngãi') ,
(16,2,'Lý anh','1975-10-20','1685236398','840214587','oanhaa@gmail.com','Quảng Ngãi') ,
(17,2,'Đỗ Nam Trung','1987-12-27','1023536398','840122227','oaaa@gmail.com','Vinh') ,
(18,2,'Nguyễn Hồng','2001-04-14','1666636398','844545587','oa@gmail.com','Đà Nẵng') ,
(19,2,'Lý Hồng Oanh','1992-04-14','1785536398','847455687','haa@gmail.com','Vinh') ,
(20,4,'Trần Phát','1982-04-14','1688/36398','8445686587','oa@gmail.com','Đà Nẵng') ;

insert into casestudy_database.contracts (contract_id , employee_id,customer_id,service_id,contract_date,finish_date,deposit,money_total) values 
(1,2,9,17,'2019-05-15','2019-05-20',1000000,400000) ,
(2,8,15,20,'2019-02-15','2019-02-18',1000000,1000000) ,
(3,1,3,13,'2018-10-20','2018-08-22',500000,3000000) ,
(4,8,5,23,'2019-05-15','2019-05-22',1000000,8000000) ,
(5,13,1,19,'2019-07-20','2019-05-25',2000000,1000000) ,
(6,1,9,16,'2018-11-15','2018-05-20',400000,2000000) ,
(7,8,8,15,'2019-10-15','2019-06-20',500000,3000000) ,
(8,13,4,12,'2019-05-15','2019-05-20',1000000,1500000) ,
(9,8,1,10,'2019-12-15','2019-03-20',1000000,1500000) ,
(10,8,1,10,'2014-12-15','2014-03-20',1000000,1500000) ,
(11,3,1,20,'2018-05-15','2018-05-20',1000000,8000000) ,
(12,4,17,17,'2019-04-15','2019-04-20',1000000,15000000),
(13,6,18,20,'2018-05-15','2018-05-20',1000000,1000000),
(14,6,19,20,'2013-05-15','2013-05-20',1000000,8000000),
(15,12,20,20,'2014-05-15','2014-05-20',1000000,8000000);

insert into casestudy_database.detailcontracts(detailcontract_id,contract_id,bonusservice_id,amount) values
(1,1,2,2),
(2,3,3,1),
(3,4,2,1),
(4,2,2,1),
(5,5,5,3),
(6,6,4,1),
(7,8,4,2),
(8,9,2,3),
(9,10,4,2),
(10,10,1,3),
(11,7,1,1),
(12,13,1,1),
(13,8,1,1),
(14,6,1,1),
(15,7,1,1),
(16,14,2,1),
(17,15,2,1),
(18,3,3,1);

