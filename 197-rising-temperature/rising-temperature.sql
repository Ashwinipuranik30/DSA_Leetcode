# Write your MySQL query statement below
Select W2.id AS Id FROM Weather W1, Weather W2 
WHERE DATEDIFF(W2.recordDate,W1.recordDate)=1 AND W2.temperature>W1.temperature;
