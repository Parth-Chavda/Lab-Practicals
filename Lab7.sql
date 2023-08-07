create database Lab7
use Lab7

select * from Customer

select * from Orders

--1
create view AllCustomers
as
select * from Customer

--2
create view AllOrdersView
as
select O.OrderID, O.CustomerID, C.FirstName + ' ' + C.LastName as FullName, O.OrderDate, O.TotalAmount
from Orders O inner join Customer C
on O.CustomerID = C.CustomerID

--3
create view NoMail
as
select *
from Customer
where Email is null

--4
create view Total_Customers
as
select count(CustomerId) as TotalCustomers
from Customer

--5
create view Total_Amount
as
select sum(TotalAmount) as SumAmount
from Orders

--6
insert into Orders
values (1006, 6, '2023-08-01', 25.50)

select * from AllOrdersView

--8
create view TotalOrderAmount
as
select C.*, sum(O.TotalAmount) as TotalAmount
from Customer C inner join Orders O
on C.CustomerID = O.CustomerID
group by C.CustomerID, C.FirstName, C.LastName, C.Email, C.Phone

--9
select O.*, C.Email, C.Phone
from Orders O inner join Customer C
on O.CustomerID = C.CustomerID

--10
create view Latest_Order
as
select C.*, max(O.OrderDate) as LatestOrder
from Customer C inner join Orders O
on C.CustomerID = O.CustomerID
group by C.CustomerID, C.FirstName, C.LastName, C.Email, C.Phone

--11
create view NoOrders
as
select C.*
from Customer C left outer join Orders O
on C.CustomerID = O.CustomerID
where O.OrderID is null

--12
create view Total_Orders
as
select C.*, count(O.OrderID) as TotalOrders
from Customer C left outer join Orders O
on C.CustomerID = O.CustomerID
group by C.CustomerID, C.FirstName, C.LastName, C.Email, C.Phone

--13
create view HighValueOrders
as
select top 1 C.*, max(O.TotalAmount) as Amount
from Customer C left outer join Orders O
on C.CustomerID = O.CustomerID
group by C.CustomerID, C.FirstName, C.LastName, C.Email, C.Phone
order by Amount desc

--14
create view MoreThanOneOrders
as
select C.*
from Customer C left outer join Orders O
on C.CustomerID = O.CustomerID
group by C.CustomerID, C.FirstName, C.LastName, C.Email, C.Phone
having count(OrderID) > 1