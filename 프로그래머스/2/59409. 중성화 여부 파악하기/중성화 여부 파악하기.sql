-- 코드를 입력하세요
-- 중성화 여부 파악
-- Neutered or Spayed
-- 중성화가 되어있다면 'O', 아니라면 'X'
-- 아이디 순 정렬
SELECT          ANIMAL_ID
              , NAME
              , IF(
                  INSTR(SEX_UPON_INTAKE, 'Neutered') > 0
                  OR
                  INSTR(SEX_UPON_INTAKE, 'Spayed') > 0,
                  'O', 'X'
              )
FROM            ANIMAL_INS
ORDER BY        ANIMAL_ID
;