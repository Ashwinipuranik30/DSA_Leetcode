# Write your MySQL query statement below
SELECT ROUND(SUM(tiv_2016),2) as tiv_2016 FROM Insurance WHERE
tiv_2015 IN (
    SELECT DISTINCT I1.tiv_2015 FROM Insurance I1 JOIN Insurance I2 ON I1.tiv_2015=I2.tiv_2015 AND I1.pid<>I2.pid
    ) AND (lat,lon) NOT IN (
        SELECT I1.lat,I1.lon FROM Insurance I1 JOIN Insurance I2 ON I1.pid<>I2.pid AND I1.lat=I2.lat  AND I1.lon=I2.lon) 
