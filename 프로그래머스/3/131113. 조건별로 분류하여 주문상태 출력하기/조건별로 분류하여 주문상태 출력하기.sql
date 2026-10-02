-- 코드를 입력하세요
-- 2022년 5월 1일을 기준
-- 출고 여부 : 출고완료 출고대기 출고미정
SELECT          ORDER_ID
              , PRODUCT_ID
              , OUT_DATE
              , IF(OUT_DATE<='2022-05-01', '출고완료', IF(OUT_DATE IS NULL, '출고미정', '출고대기')) AS '출고여부'
FROM            FOOD_ORDER
ORDER BY        ORDER_ID    ASC
;