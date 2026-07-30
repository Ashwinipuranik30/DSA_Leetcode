#SELECT name FROM Employee 
#WHERE id IN (SELECT managerId FROM Employee GROUP BY managerID Having Count(managerId)>=5);


SELECT E2.name FROM EMPLOYEE E 
JOIN Employee E2 ON E.managerId=E2.id GROUP BY E.managerId Having COUNT(E.managerId)>=5;