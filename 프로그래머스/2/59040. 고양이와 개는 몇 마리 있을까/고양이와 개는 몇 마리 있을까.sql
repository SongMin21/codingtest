-- 코드를 입력하세요
-- 동물 보호소에 들어온 동물 중 고양이와 개가 몇 마리인가
SELECT      ANIMAL_TYPE
          , COUNT(*)        AS  count
FROM        ANIMAL_INS
WHERE       ANIMAL_TYPE = 'Cat'
            OR
            ANIMAL_TYPE = 'Dog'
GROUP BY    ANIMAL_TYPE
ORDER BY    ANIMAL_TYPE ASC
;