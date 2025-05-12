# Write your MySQL query statement below
SELECT P.product_id , COALESCE(ROUND(SUM(COALESCE(U.units,0)*P.price )/SUM(U.units),2),0) 
AS average_price FROM Prices P
LEFT JOIN UnitsSold U
ON P.product_id=U.product_id 
WHERE U.purchase_date IS NULL OR U.purchase_date BETWEEN P.start_date AND P.end_date
GROUP BY P.product_id;