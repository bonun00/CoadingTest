-- 코드를 입력하세요
SELECT MONTH(START_DATE) AS MONTH, CAR_ID, COUNT(*) AS RECORD
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
WHERE START_DATE BETWEEN '2022-08-01' and '2022-10-31'
and car_id in (select car_id 
              from CAR_RENTAL_COMPANY_RENTAL_HISTORY
              WHERE START_DATE BETWEEN '2022-08-01' and '2022-10-31'
              group by car_id
               having count(*)>4
              )
GROUP BY MONTH,car_id
ORDER BY MONTH ASC, CAR_ID DESC
