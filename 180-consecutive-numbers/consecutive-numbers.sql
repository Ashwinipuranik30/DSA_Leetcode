# Write your MySQL query statement below
SELECT DISTINCT L.num as ConsecutiveNums 
FROM Logs L , Logs L1 , Logs L2
WHERE  L1.id-L.id=1 
AND  L2.id-L1.id=1 
AND L.num=L1.num AND L.num=L2.num;