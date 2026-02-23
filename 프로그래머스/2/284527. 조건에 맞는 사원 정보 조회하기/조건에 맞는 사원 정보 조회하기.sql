-- 코드를 작성해주세요
SELECT sum(score) as score, e.emp_no, e.emp_name, e.position, e.email
from hr_employees e join hr_grade g on e.emp_no=g.emp_no
group by year, emp_no
having g.year='2022'
order by 1 desc
limit 1;
# SELECT SUM(SCORE) AS SCORE, G.EMP_NO, E.EMP_NAME, E.POSITION, E.EMAIL
# FROM HR_EMPLOYEES E
#     INNER JOIN HR_GRADE G ON E.EMP_NO = G.EMP_NO
# GROUP BY YEAR, EMP_NO
# HAVING G.YEAR = '2022'
# ORDER BY 1 DESC
# LIMIT 1;