# Write your MySQL query statement below
SELECT B.id FROM Weather A , Weather B 
WHERE A.temperature<B.temperature AND DATEDIFF(B.recordDATE,A.recordDate)=1;