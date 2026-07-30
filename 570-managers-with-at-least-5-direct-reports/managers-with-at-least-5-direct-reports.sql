SELECT name FROM Employee 
WHERE id IN (SELECT managerId FROM Employee GROUP BY managerID Having Count(managerId)>=5);