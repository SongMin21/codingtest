-- 코드를 입력하세요
-- '통풍시트' '열선시트' '가죽시트' 중 하나 이상의 옵션이 포함된 자동차
-- 종류 별로 몇 대
-- 자동차 종류 오름차순
SELECT          CAR_TYPE
              , COUNT(*)    AS  CARS
FROM            CAR_RENTAL_COMPANY_CAR
WHERE           FIND_IN_SET('통풍시트', OPTIONS) > 0
                OR
                FIND_IN_SET('열선시트', OPTIONS) > 0
                OR
                FIND_IN_SET('가죽시트', OPTIONS) > 0
GROUP BY        CAR_TYPE
ORDER BY        CAR_TYPE ASC
;