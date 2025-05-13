# Write your MySQL query statement below
#SELECT COUNT(DISTINCT player_id) FROM Activity;
#(SELECT COUNT(DISTINCT player_id) FROM Activity),2)

SELECT ROUND(COUNT(DISTINCT A1.player_id)/(SELECT COUNT(DISTINCT player_id) FROM Activity),2) AS fraction 
FROM Activity A1
INNER JOIN Activity A2 
ON A1.player_id=A2.player_id AND DATEDIFF(A2.event_date,A1.event_date)=1 
WHERE A1.event_date in (select MIN(event_date) FROM Activity WHERE player_id=A1.player_id
GROUP BY player_id)


