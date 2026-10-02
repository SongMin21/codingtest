-- 코드를 입력하세요
-- 식품분류별
-- 가격이 제일 비싼 식품
-- 과자, 국, 김치, 식용유인 경우만 출력
-- 식품가격 내림차순

SELECT          CATEGORY
              , PRICE     AS MAX_PRICE
              , PRODUCT_NAME
FROM            FOOD_PRODUCT
WHERE           (CATEGORY, PRICE) IN (
                    SELECT      CATEGORY
                              , MAX(PRICE)
                    FROM        FOOD_PRODUCT
                    WHERE       CATEGORY IN ('과자', '국', '김치', '식용유')
                    GROUP BY    CATEGORY
)
ORDER BY        PRICE DESC
;