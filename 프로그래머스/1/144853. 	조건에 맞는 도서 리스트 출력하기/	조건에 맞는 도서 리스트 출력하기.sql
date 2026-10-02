-- 코드를 입력하세요
-- 2021년
-- 인문
-- 출판일 오름차순

SELECT      BOOK_ID
          , PUBLISHED_DATE
FROM        BOOK
WHERE       YEAR(PUBLISHED_DATE) = '2021'
            AND
            CATEGORY = '인문'
ORDER BY    PUBLISHED_DATE  ASC
;