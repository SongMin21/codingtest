-- 코드를 입력하세요
-- 이름 순 조회
-- 이름이 같은 동물 중 나중에 시작한 동물 먼저
SELECT      ANIMAL_ID
          , NAME
          , DATETIME
FROM        ANIMAL_INS
ORDER BY    NAME , DATETIME DESC
;