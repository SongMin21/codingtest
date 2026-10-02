-- 코드를 입력하세요
-- 완료된 중고 거래의 총금액이 70만원 이상인 경우
-- 총거래금액 기준 오름차순
SELECT          U.USER_ID
              , U.NICKNAME
              , SUM(B.PRICE)    AS  TOTAL_SALES
FROM            USED_GOODS_USER U
INNER JOIN      USED_GOODS_BOARD B
        ON      U.USER_ID = B.WRITER_ID
WHERE           STATUS = 'DONE'
GROUP BY        U.USER_ID
HAVING          TOTAL_SALES >= 700000
ORDER BY        TOTAL_SALES ASC
;