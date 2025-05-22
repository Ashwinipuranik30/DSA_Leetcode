# Write your MySQL query statement below
SELECT MAX(salary) AS SecondHighestSalary FROM Employee WHERE salary<(select MAX(salary) FROM Employee);