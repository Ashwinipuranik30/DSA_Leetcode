# Write your MySQL query statement below

SELECT D_name AS Department , E_name AS Employee , Salary FROM
(SELECT D.name AS D_name , E.name AS E_name, E.salary AS salary , 
DENSE_RANK() OVER (PARTITION BY E.departmentId ORDER BY E.salary DESC) AS salary_rank FROM Employee E JOIN Department D ON E.departmentId=D.id) AS salary_table WHERE salary_rank<=3;
