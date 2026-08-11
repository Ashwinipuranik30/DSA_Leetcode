# Write your MySQL query statement below
SELECT x , y , z , 
CASE 
WHEN x+y>z && z+y>x && x+z>y THEN "Yes" 
ELSE "No" 
END 
AS triangle FROM Triangle ;