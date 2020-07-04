#bai2
select * from casestudy_database.employees
where (employee_name like 'H%' or employee_name like 'T%' or employee_name like'K%') and length(employee_name) < 18 ;


#bai3
select * ,timestampdiff(year , birthday , curdate()) as age from casestudy_database.customers
having (age between 18 and 50 ) and (address ='Quảng trị' or address ='Đà nẵng') ;


#bai4
select customers.customer_name ,count(contracts.contract_id) as number_rental from casestudy_database.customers
inner join contracts on  customers.customer_id = contracts.customer_id
inner join typecustomers on customers.typecustomer_id = typecustomers.typecustomer_id
where typecustomers.typecustomer = 'Diamond' 
group by customers.customer_id order by number_rental asc ;

#bai5
select customers.customer_id,customers.customer_name,typecustomers.typecustomer,contracts.contract_id,services.service_name,contracts.contract_date,contracts.finish_date,
sum(services.rent_cost+detailcontracts.amount*bonusservices.price) as total_fee 
from customers 
left join typecustomers on customers.typecustomer_id = typecustomers.typecustomer_id
left join contracts on customers.customer_id = contracts.customer_id
left join services on contracts.service_id = services.service_id
left join detailcontracts on contracts.contract_id = detailcontracts.contract_id 
left join bonusservices on detailcontracts.bonusservice_id = bonusservices.bonusservice_id
group by customers.customer_name , contracts.contract_id ;

#bai6
select services.service_id,services.service_name , services.area , services.rent_cost ,typeservices.typeservice
from services
inner join typeservices on services.typeservice_id = typeservices.typeservice_id
where not exists
(select contracts.service_id from contracts
where ( contracts.contract_date between '2018-12-31' and '2019-04-01' )
and contracts.service_id = services.service_id );

#bai7
select services.service_id,services.service_name , services.area , services.rent_cost ,typeservices.typeservice , services.number_max_people
from services
inner join 	 typeservices on services.typeservice_id = typeservices.typeservice_id
where services.service_id  in
(select contracts.service_id from contracts
where year(contracts.contract_date) = '2018' )
and services.service_id not in
(select contracts.service_id from contracts
where year(contracts.contract_date) = '2019' );

#bai8
#cach1 
select distinct customers.customer_name from customers ;
#cach2
select customers.customer_name from customers group by customers.customer_name ;
#cach3
select customers.customer_name from customers
union
select customers.customer_name from customers ;

#bai9
select count(contracts.contract_id)  numer_contract , month(contracts.contract_date) thang ,year(contracts.contract_date)  nam , sum(contracts.money_total) doanhthu 
from contracts 
group by contract_date 
having nam ='2019' ;

#bai10
select contracts.contract_id,contracts.contract_date,contracts.finish_date,contracts.deposit,count(detailcontracts.detailcontract_id) soluong from contracts
left join detailcontracts on contracts.contract_id = detailcontracts.contract_id 
left join bonusservices on detailcontracts.bonusservice_id = bonusservices.bonusservice_id 
group by contract_id ;

#bai11
select bonusservices.bonusservice,bonusservices.price,customer_name , customers.address ,typecustomers.typecustomer from bonusservices 
join detailcontracts on bonusservices.bonusservice_id = detailcontracts.bonusservice_id 
join contracts on detailcontracts.contract_id = contracts.contract_id
join customers on contracts.customer_id= customers.customer_id 
join typecustomers on customers.typecustomer_id =typecustomers.typecustomer_id 
where (customers.address ='Vinh' or customers.address= 'Quãng Ngãi')
and typecustomers.typecustomer = 'Diamond';

#bai12
select contracts.contract_id,employees.employee_name,customers.customer_name,contracts.contract_date,customers.phone,services.service_name,count(detailcontracts.detailcontract_id) soluong , contracts.deposit 
from contracts 
join detailcontracts on contracts.contract_id = detailcontracts.detailcontract_id 
join employees on contracts.employee_id =employees.employee_id
join customers on contracts.customer_id =customers.customer_id
join services on contracts.service_id = services.service_id 
where exists (select contracts.contract_id  where contracts.contract_date between '2019-10-01' and '2019-12-31') and
not exists (select contracts.contract_id  where contracts.contract_date between '2019-01-01' and '2019-06-30') 
group by contracts.contract_id ;

#bai13
select bonusservices.bonusservice,count(detailcontracts.bonusservice_id) as so_lan_su_dung from bonusservices 
join detailcontracts on bonusservices.bonusservice_id = detailcontracts.bonusservice_id 
group by bonusservices.bonusservice_id
having so_lan_su_dung in (select max(times)
from (select count(*) as times
from detailcontracts
group by bonusservice_id) as sub);
#bai14
select contracts.contract_id,typeservices.typeservice,bonusservices.bonusservice,count(detailcontracts.bonusservice_id)as so_lan_su_dung from bonusservices 
join detailcontracts on bonusservices.bonusservice_id = detailcontracts.bonusservice_id 
join contracts on detailcontracts.contract_id = contracts.contract_id
join services on contracts.service_id =services.service_id
join typeservices on services.typeservice_id =typeservices.typeservice_id  
group by bonusservices.bonusservice_id 
having so_lan_su_dung = 1 ;

#bai15
select employees.employee_id,employees.employee_name,degrees.degree,parts.part,employees.phone,employees.address 
from employees 
join degrees on employees.degree_id = degrees.degree_id
join parts on employees.part_id = parts.part_id 
join contracts on employees.employee_id = contracts.employee_id
where exists (select contracts.employee_id where contracts.contract_date between '2018-01-01' and '2019-01-01')
group by employees.employee_id 
having count(contracts.employee_id) <=3 ;

#bai16 xoa nhan vien chua lam hop dong tu nam 2017-2019 dung on delete cascade
set sql_safe_updates = false ;
delete from employees
where not exists
( select contracts.employee_id from contracts
where ( contracts.contract_date between '2017-01-01' and '2019-12-31' )
and employees.employee_id = contracts.employee_id) ;


#bai17
update casestudy_database.customers 
set customers.typecustomer_id = 1
where  customers.typecustomer_id = 2 and customers.customer_id in(
select  contracts.customer_id from contracts 
where year(contracts.contract_date) ='2019' 
group by contracts.customer_id
having sum(contracts.money_total) >= 10000000);



#bai18
set sql_safe_updates = false ;
delete from customers
where exists
( select contracts.customer_id from contracts
where ( year(contracts.contract_date) <'2016' )
and customers.customer_id = contracts.customer_id) ;

#bai19
set sql_safe_updates = false ;
update casestudy_database.bonusservices
set bonusservices.price = bonusservices.price * 2
 where bonusservices.bonusservice_id in
 (select detailcontracts.bonusservice_id from detailcontracts 
 join contracts on detailcontracts.contract_id = contracts.contract_id
 where year(contracts.contract_date) ='2019' 
 group by bonusservice_id 
 having count(detailcontracts.bonusservice_id) >=3 );

#bai20
select customers.customer_id as ID ,
customers.customer_name as name ,
customers.email as email ,
customers.phone as phone ,
customers.birthday as birthday ,
customers.address as address 
from customers 
union
select employees.employee_id,
employees.employee_name,
employees.email,
employees.phone,
employees.birthday,
employees.address 
from employees ;













