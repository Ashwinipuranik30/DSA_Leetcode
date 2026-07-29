# Write your MySQL query statement below
SELECT E.name as Employee FROM
Employee E JOIN
Employee E2 ON
E.managerID=E2.ID 
WHERE E.salary>E2.salary;