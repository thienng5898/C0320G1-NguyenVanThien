DROP DATABASE IF EXISTS casestudy_database ;
CREATE DATABASE casestudy_database ;
CREATE TABLE casestudy_database.locations (
location_id INT AUTO_INCREMENT PRIMARY KEY  ,
location NVARCHAR(45)
);
CREATE TABLE casestudy_database.degrees (
degree_id INT AUTO_INCREMENT PRIMARY KEY ,
degree NVARCHAR(45)
);
CREATE TABLE casestudy_database.parts (
part_id INT AUTO_INCREMENT PRIMARY KEY ,
part NVARCHAR(45)
);
CREATE TABLE casestudy_database.typecustomers (
typecustomer_id INT AUTO_INCREMENT PRIMARY KEY ,
typecustomer NVARCHAR(45)
);
CREATE TABLE casestudy_database.typerents (
typerent_id INT AUTO_INCREMENT PRIMARY KEY ,
typerent NVARCHAR(45) ,
price INT 
) ;
CREATE TABLE casestudy_database.typeservices (
typeservice_id INT AUTO_INCREMENT PRIMARY KEY ,
typeservice NVARCHAR(45) 
);
CREATE TABLE casestudy_database.bonusservices (
bonusservice_id INT AUTO_INCREMENT PRIMARY KEY ,
bonusservice NVARCHAR(45),
price INT ,
unit INT ,
status_available NVARCHAR(45)
) ;
CREATE TABLE casestudy_database.employees (
employee_id INT AUTO_INCREMENT PRIMARY KEY ,
employee_name NVARCHAR(45),
location_id INT ,
degree_id INT ,
part_id INT ,
birthday DATE ,
id_card VARCHAR(45) ,
salary VARCHAR(45) ,
phone VARCHAR(45) ,
email VARCHAR(45) ,
address NVARCHAR(45) ,
FOREIGN KEY (location_id) REFERENCES locations(location_id) ,
FOREIGN KEY (degree_id) REFERENCES degrees(degree_id) ,
FOREIGN KEY (part_id) REFERENCES parts(part_id) 
);
CREATE TABLE casestudy_database.customers (
customer_id INT AUTO_INCREMENT PRIMARY KEY ,
typecustomer_id INT ,
customer_name NVARCHAR(45) ,
birthday DATE ,
id_card VARCHAR(45) ,
phone VARCHAR(45) ,
email VARCHAR(45) ,
address NVARCHAR(45) ,
FOREIGN KEY (typecustomer_id) REFERENCES typecustomers(typecustomer_id) 
);
CREATE TABLE casestudy_database.services (
service_id INT AUTO_INCREMENT PRIMARY KEY ,
service_name NVARCHAR(45) ,
area INT ,
number_floors INT ,
number_max_people VARCHAR(45) ,
rent_cost VARCHAR(45) ,
typerent_id INT ,
typeservice_id INT ,
status VARCHAR(45) ,
FOREIGN KEY (typerent_id) REFERENCES typerents(typerent_id) ,
FOREIGN KEY (typeservice_id) REFERENCES typeservices(typeservice_id) 
);
CREATE TABLE casestudy_database.contracts (
contract_id INT AUTO_INCREMENT PRIMARY KEY ,
employee_id INT ,
customer_id INT ,
service_id INT ,
contract_date DATE ,
finish_date DATE ,
deposit INT ,
money_total INT ,
FOREIGN KEY (employee_id) REFERENCES employees(employee_id) ,
FOREIGN KEY (customer_id) REFERENCES customers(customer_id) ,
FOREIGN KEY (service_id) REFERENCES services(service_id) 
);
CREATE TABLE casestudy_database.detailcontracts (
detailcontract_id INT AUTO_INCREMENT PRIMARY KEY ,
contract_id INT ,
bonusservice_id INT ,
amount INT NOT NULL ,
FOREIGN KEY (contract_id) REFERENCES contracts(contract_id) ,
FOREIGN KEY (bonusservice_id) REFERENCES bonusservices(bonusservice_id) 
) ;



