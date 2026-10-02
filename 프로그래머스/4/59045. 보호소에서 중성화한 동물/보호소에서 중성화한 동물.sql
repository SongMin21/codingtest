-- 코드를 입력하세요
-- 중성화 수술
-- 들어올 때 중성화 x
-- 나갈 때 중성화 o

SELECT              I.ANIMAL_ID
                  , I.ANIMAL_TYPE
                  , I.NAME
FROM                ANIMAL_INS I
INNER JOIN          ANIMAL_OUTS O
        ON          I.ANIMAL_ID = O.ANIMAL_ID
WHERE               INSTR(I.SEX_UPON_INTAKE, 'Intact') > 0
                    AND (
                        INSTR(O.SEX_UPON_OUTCOME, 'Spayed') > 0
                        OR
                        INSTR(O.SEX_UPON_OUTCOME, 'Neutered') > 0
                    )
;