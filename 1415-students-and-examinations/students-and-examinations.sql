# Write your MySQL query statement below
SELECT S.student_id, S.student_name, Su.subject_name, COUNT(E.student_id) as attended_exams FROM Students S Cross join Subjects Su left join Examinations E ON S.student_id=E.student_id AND E.subject_name=Su.subject_name
Group by S.student_id,Su.subject_name
Order by S.student_id;