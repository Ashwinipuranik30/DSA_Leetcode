# Write your MySQL query statement below
SELECT C.name AS Customers FROM Customers C Where C.id NOT IN (select customerId From Orders);