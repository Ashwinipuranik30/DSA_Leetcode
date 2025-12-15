# Write your MySQL query statement below
SELECT P.product_name , S.year, S.price FROM Sales S Join Product P ON S.product_id=P.product_id;