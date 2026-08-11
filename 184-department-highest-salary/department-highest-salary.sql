# Write your MySQL query statement below
SELECT D.name AS Department , E.name AS Employee , E.salary AS Salary FROM Employee E JOIN Department D ON E.departmentId=D.id
WHERE (D.id, salary) IN (SELECT departmentId , Max(salary) FROM Employee GROUP BY departmentId);