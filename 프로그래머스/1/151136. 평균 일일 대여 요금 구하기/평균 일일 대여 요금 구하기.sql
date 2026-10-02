-- 코드를 입력하세요
SELECT  ROUND(average)
FROM    (
            SELECT AVG(DAILY_FEE) AS average
            FROM    CAR_RENTAL_COMPANY_CAR
            WHERE   CAR_TYPE = 'SUV'
) AS avg_table
;