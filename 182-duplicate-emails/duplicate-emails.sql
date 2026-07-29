SELECT DISTINCT E.email FROM
Person E JOIN 
Person E1 ON
E.id<>E1.id AND E.email=E1.email;