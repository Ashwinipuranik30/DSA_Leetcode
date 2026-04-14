# Write your MySQL query statement below
SELECT player_id , MIN(event_date) AS first_login FROM Activity Group by player_id;