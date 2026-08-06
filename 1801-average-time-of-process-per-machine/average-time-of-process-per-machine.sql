SELECT DISTINCT machine_id, 
ROUND(SUM(CASE WHEN activity_type="start" then timestamp*-1 ELSE timestamp END)/COUNT( DISTINCT process_id),3)  As  processing_time FROM Activity GROUP BY machine_id;