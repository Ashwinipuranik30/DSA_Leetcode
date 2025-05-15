# Write your MySQL query statement below

SELECT  A1.employee_id , A1.name , COUNT(A2.reports_to) AS reports_count , ROUND(AVG(A2.age)) AS average_age FROM Employees A1 , Employees A2 WHERE A1.employee_id=A2.reports_to AND A2.reports_to IS NOT NULL
GROUP BY A2.reports_to
ORDER BY A1.employee_id;

 