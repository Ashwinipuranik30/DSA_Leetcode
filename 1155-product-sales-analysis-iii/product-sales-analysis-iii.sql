# Write your MySQL query statement below
SELECT S1.product_id , S1.year AS first_year , S1.quantity , S1.price FROM Sales S1 JOIN (
    SELECT product_id , MIN(year) AS first_year FROM Sales GROUP BY product_id
) AS First_year 
ON First_year.product_id=S1.product_id AND S1.year=First_year.first_year ;
