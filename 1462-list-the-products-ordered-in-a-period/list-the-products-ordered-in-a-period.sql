# Write your MySQL query statement below
WITH Products_Sale AS 
(SELECT P.product_id , P.product_name , SUM(P2.unit) AS unit
FROM Products P 
INNER JOIN Orders P2
ON P.product_id=P2.product_id 
WHERE MONTH(P2.order_date)=2 AND YEAR(P2.order_date)=2020
GROUP BY P.product_id
HAVING SUM(P2.unit)>=100)
SELECT product_name , unit FROM Products_Sale;