-- 코드를 입력하세요
-- 몇 시에 입양이 가장 활발한가
-- 9 ~ 19시
-- 시간대 순으로 정렬
SELECT          HOUR(DATETIME)  AS HOUR
              , COUNT(*)        AS COUNT
FROM            ANIMAL_OUTS
WHERE           HOUR(DATETIME) BETWEEN '9' AND '19'
GROUP BY        HOUR
ORDER BY        HOUR
;