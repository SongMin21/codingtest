-- 코드를 작성해주세요
-- 각 세대별 자식이 없는 개체의 수
-- 세대 오름차순
-- 모든 세대에는 자식이 없는 개체가 적어도 1개체 존재

WITH    RECURSIVE   CTE_ECOLI_DATA AS(
    SELECT      ID
              , PARENT_ID
              , 1 AS GENERATION
    FROM        ECOLI_DATA
    WHERE       PARENT_ID IS NULL
    
    UNION ALL
    
    SELECT      C.ID
              , C.PARENT_ID
              , P.GENERATION + 1
    FROM        ECOLI_DATA C
    INNER JOIN  CTE_ECOLI_DATA P
            ON  C.PARENT_ID = P.ID
)

SELECT      COUNT(*)    AS  COUNT
          , GENERATION
FROM        CTE_ECOLI_DATA
WHERE       ID NOT IN (
            SELECT  PARENT_ID
            FROM    ECOLI_DATA
            WHERE   PARENT_ID IS NOT NULL
)
GROUP BY    GENERATION
ORDER BY    GENERATION  ASC
;