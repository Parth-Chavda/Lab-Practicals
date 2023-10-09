CREATE DATABASE Lab12
USE Lab12

CREATE TABLE Employee(
EID int Primary Key,
EName varchar(100),
Gender varchar(100),
JoiningDate date,
Salary decimal(8,2),
City varchar(100))

-- Inserting Data

INSERT INTO Employee (EID, EName, Gender, JoiningDate, Salary, City)
VALUES
	 (1, 'Nick', 'Male', '01-JAN-13', 4000, 'London'),
	 (2, 'Julian', 'Female', '01-OCT-14', 3000, 'New York'),
	 (3, 'Roy', 'Male', '01-JUN-16', 3500, 'London'),
	 (4, 'Tom', 'Male', NULL, 4500,'London'),
	 (5, 'Jerry', 'Male', '01-FEB-13', 2800, 'Sydney'),
	 (6, 'Philip', 'Male', '01-JAN-15', 7000, 'New York'),
	 (7, 'Sara', 'Female', '01-AUG-17', 4800, 'Sydney'),
	 (8, 'Emily', 'Female', '01-JAN-15', 5500, 'New York'),
	 (9, 'Michael', 'Male', NULL, 6500, 'London'),
	 (10, 'John', 'Malev', '01-JAN-15', 8800, 'London');

SELECT * FROM Employee

--Part – A
--1. Create a function which displays total number of employees.
ALTER FUNCTION EmployeeTotal()
RETURNS INT
AS BEGIN
	DECLARE @C INT;

	SET @C = (SELECT COUNT(EID) FROM Employee);

	RETURN @C;
END

SELECT dbo.EmployeeTotal();

--2. Create a function which returns highest salary from Employee table.
CREATE FUNCTION HighestSalary()
RETURNS INT
AS BEGIN
	DECLARE @MaxSalary INT;
	
	SET @MaxSalary = (SELECT MAX(Salary) FROM Employee);

	RETURN @MaxSalary; 
END

SELECT DBO.HighestSalary();
--3. Create a function to get the age of the employee based on their joining date.
alter function EmployeeTenure(@joinDate datetime)
returns int
as begin
	declare @tenure int;

	set @tenure = (select DATEDIFF(year, @joinDate, getDate()));

	return @tenure;
end

select dbo.EmployeeTenure(JoiningDate) from Employee;
--Part – B
--4. Create a function to calculate the net sales based on the quantity, price, and discount value.
create function NetSales(@quantity int, @price decimal(8,2))
returns decimal(8, 2)
as begin
	declare @discount int = 5,
			@totalPrice decimal(8,2),
			@netAmount decimal(8,2);

	set @totalPrice = @quantity * @price;
	set	@netAmount = @totalPrice - ((@totalPrice * @discount) / 100);

	return @netAmount;
end

select dbo.NetSales(5, 200)
--5. Create a function that calculates the factorial of a given number.
alter function Factorial(@num int)
returns int
as begin
	if(@num = 1 or @num = 0) begin
		return 1;
	end

	return @num * dbo.Factorial(@num - 1);
end

select dbo.Factorial(0);
--Part – C
--6. Create a function which returns minimum salary of female employee.
create function MinimumFemaleSalary()
returns int
as begin
	declare @minFemaleSalary int;

	set @minFemaleSalary = (
		select min(Salary)
		from Employee
		where Gender = 'Female'
		group by Gender
	);

	return @minFemaleSalary;
end

select dbo.MinimumFemaleSalary();
--7. Create a function which count unique city from employee table.
create function UniqueCities()
returns int
as begin
	declare @cities int;

	set @cities = (select count(distinct city) from Employee);

	return @cities;
end

select dbo.UniqueCities();
--8. Create a Scalar-valued function that returns the name combined with salary of an employee based on
--their employee id and displayed output like ‘Roy having 3500 salary’.
alter function EmployeeSalaryInfo(@empID int)
returns varchar(50)
as begin
	declare @employeeStatus varchar(50);

	set @employeeStatus = (
		select EName + ' having ' + CAST(Salary as varchar(50)) + ' salary.'
		from Employee
		where EID = @empID
	);

	return @employeeStatus;
end

select dbo.EmployeeSalaryInfo(1);

--Table Valued Functions
--Part – A
--1. Create a function which retrieve the data of Employee table.
alter function viewEmployeeTable()
returns table
as
	return (select * from Employee);

select * from dbo.viewEmployeeTable();
--2. Create a function which returns an Employee table with city wise total salary.
alter function TotalCitySalary() 
returns table
as
	return (
		select City, SUM(Salary) as TotalSalary
		from Employee
		group by City
	);

select * from dbo.TotalCitySalary();

--3. Create a function which returns an Employee table with gender wise maximum, minimum, total and
--average salaries.
create function GenderWiseSalaries()
returns table
as
	return (
		select Gender, MAX(Salary) as MaxSalary, Min(Salary) as MinSalary, SUM(Salary) as TotalSalary, AVG(Salary) as AvgSalary
		from Employee
		group by Gender
	);

select * from dbo.GenderWiseSalaries();

--Part – B
--4. Create a function which return an Employee table with details of employee whose name starts with J.


--5. Create a function to get all the male employees.
--Part – C
--6. Create a function to get employees from a given city.
--7. Create a function that displays employees with a salary greater than a specified amount.
--8. Create a function to get employees who joined after a given specified date.