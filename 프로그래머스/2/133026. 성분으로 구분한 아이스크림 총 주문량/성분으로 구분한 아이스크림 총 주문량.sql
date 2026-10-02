-- 코드를 입력하세요
-- 상반기 동안 각 아이스크림 성분 타입
-- 아이스크림의 총주문량
-- 작은 순서대로 조회
SELECT          I.INGREDIENT_TYPE
              , SUM(F.TOTAL_ORDER)  AS  TOTAL_ORDER
FROM            ICECREAM_INFO   I
INNER JOIN      FIRST_HALF  F
        ON      I.FLAVOR = F.FLAVOR
GROUP BY        I.INGREDIENT_TYPE
ORDER BY        TOTAL_ORDER
;