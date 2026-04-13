
# Write your MySQL query statement below
Select T1.name As Employee FROM Employee T1, Employee T2 
Where T1.managerID=T2.id AND T1.salary>T2.salary;