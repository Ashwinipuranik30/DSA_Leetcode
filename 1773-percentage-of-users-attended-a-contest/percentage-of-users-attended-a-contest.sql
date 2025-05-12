# Write your MySQL query statement below
SELECT R.contest_id , ROUND(((COUNT(R.contest_id)/(SELECT COUNT(user_id) FROM Users)))*100,2) AS percentage
FROM Users U INNER JOIN Register R 
ON U.user_id=R.user_id
GROUP BY R.contest_id 
ORDER BY percentage DESC,contest_id ASC;


