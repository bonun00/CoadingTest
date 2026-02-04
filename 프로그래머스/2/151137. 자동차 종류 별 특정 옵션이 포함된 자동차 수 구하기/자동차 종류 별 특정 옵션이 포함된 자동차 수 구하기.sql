-- 코드를 입력하세요
SELECT car_type, count(car_type) as cars 
from car_rental_company_car
WHERE OPTIONS LIKE '%통풍시트%'
or options like '%열선시트%'
or options like '%가죽시트%'
group by car_type ORDER BY CAR_TYPE