-- 코드를 입력하세요
-- 세단
-- 10월 대여 시작 기록
-- 중복 x
-- 자동차 ID 내림차순

SELECT          DISTINCT C.CAR_ID
FROM            CAR_RENTAL_COMPANY_CAR C
INNER JOIN      CAR_RENTAL_COMPANY_RENTAL_HISTORY   H
        ON      C.CAR_ID = H.CAR_ID
WHERE           C.CAR_TYPE = '세단'
                AND
                MONTH(START_DATE) = '10'
ORDER BY        C.CAR_ID    DESC
;