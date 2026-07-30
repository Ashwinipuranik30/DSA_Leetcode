SELECT W2.id FROM Weather W1 
INNER JOIN Weather W2 ON
W1.id<>W2.id AND DATEDIFF(W2.recordDate,W1.recordDate)=1 WHERE W2.temperature>W1.temperature;