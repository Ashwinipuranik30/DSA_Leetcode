# Write your MySQL query statement below
Select P.firstName , P.LastName, A.city, A.state From Person P Left join Address A 
ON P.personId=A.personId;