# Write your MySQL query statement below
#SELECT B.id FROM Weather A , Weather B 
#WHERE A.temperature<B.temperature AND DATEDIFF(B.recordDATE,A.recordDate)=1;

SELECT B.id FROM Weather A JOIN Weather B ON A.temperature<B.temperature AND 
DATEDIFF(B.recordDATE,A.recordDate)=1;