-- 코드를 입력하세요
-- 입양을 간 동물
-- 보호 기간이 가장 길었던 동물 두 마리
-- 보호 기간이 긴 순으로 조회

SELECT          I.ANIMAL_ID
              , I.NAME
FROM            ANIMAL_INS I
INNER JOIN      ANIMAL_OUTS O
        ON      I.ANIMAL_ID = O.ANIMAL_ID
ORDER BY        DATEDIFF(O.DATETIME, I.DATETIME) DESC
LIMIT           2
;