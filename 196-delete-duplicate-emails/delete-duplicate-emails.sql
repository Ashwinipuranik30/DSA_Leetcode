# Write your MySQL query statement below
DELETE P FROM Person P , Person P1 where P.email=P1.email AND P.id>P1.id;