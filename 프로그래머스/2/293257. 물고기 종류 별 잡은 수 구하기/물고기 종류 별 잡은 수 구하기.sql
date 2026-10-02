-- 코드를 작성해주세요
-- 물고기의 종류 별 물고기의 이름, 잡은 수
-- 잡은 수(FISH_COUNT) 내림차순 정렬

SELECT          COUNT(*)        AS FISH_COUNT
              , N.FISH_NAME
FROM            FISH_INFO I
INNER JOIN      FISH_NAME_INFO N
        ON      I.FISH_TYPE = N.FISH_TYPE
GROUP BY        N.FISH_TYPE
ORDER BY        FISH_COUNT DESC
;