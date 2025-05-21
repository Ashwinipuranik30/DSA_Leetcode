# Write your MySQL query statement below
WITH Q1 AS
(SELECT person_name, turn,SUM(weight) OVER (ORDER BY turn) AS TOTAL FROM Queue)
SELECT person_name FROM Q1 WHERE TOTAL<=1000 ORDER BY TOTAL DESC LIMIT 1;


