-- 코드를 입력하세요
-- 2022년 1월의 카테고리 별 도서 판매량 합산
-- 카테고리명을 기준으로 오름차순
SELECT          B.CATEGORY
              , SUM(S.SALES)    AS TOTAL_SALES
FROM            BOOK B
INNER JOIN      BOOK_SALES S
        ON      B.BOOK_ID = S.BOOK_ID
WHERE           YEAR(S.SALES_DATE) = '2022'
                AND
                MONTH(S.SALES_DATE) = '01'
GROUP BY        B.CATEGORY
ORDER BY        B.CATEGORY ASC
;