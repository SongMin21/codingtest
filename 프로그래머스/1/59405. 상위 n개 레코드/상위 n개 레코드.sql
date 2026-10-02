-- 코드를 입력하세요
-- 동물 보호소에 가장 먼저 들어온 동물의 이름 조회
SELECT          NAME
FROM            ANIMAL_INS
WHERE           DATETIME = (
                    SELECT  MIN(DATETIME)
                    FROM    ANIMAL_INS
)
;