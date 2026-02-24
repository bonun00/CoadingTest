-- 코드를 입력하세요
# SELECT i.rest_id, i.rest_name, i.food_type, i.favorites, i.address, round(avg(r.review_score),2) as score
# from rest_info i join rest_review r on i.rest_id=r.rest_id 
# where i.address like '%서울%'
# group by rest_id
# order by score desc, i.favorites

SELECT i.REST_ID, i.REST_NAME, i.FOOD_TYPE, i.FAVORITES, i.ADDRESS, ROUND(AVG(r.REVIEW_SCORE), 2) AS "SCORE"
FROM REST_INFO i
INNER JOIN REST_REVIEW r
ON i.REST_ID = r.REST_ID 
WHERE i.ADDRESS LIKE '서울%'
GROUP BY REST_ID
ORDER BY 6 DESC, 4 DESC;
