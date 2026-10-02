-- 코드를 작성해주세요
-- 월별 잡은 물고기의 수와 월을 출력
-- 잡은 물고기가 없는 월은 출력 X

SELECT      COUNT(*)    AS  FISH_COUNT
          , MONTH(TIME) AS  MONTH
FROM        FISH_INFO
GROUP BY    MONTH
HAVING      FISH_COUNT != 0
ORDER BY    MONTH   ASC
;