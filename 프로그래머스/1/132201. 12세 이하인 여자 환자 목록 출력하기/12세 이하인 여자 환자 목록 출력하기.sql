-- 코드를 입력하세요
-- 12세 이하인 여자환자 조회
-- 전화번호가 없는 경우 NONE
-- 나이 내림차순 -> 환자이름 오름차순
SELECT      PT_NAME
          , PT_NO
          , GEND_CD
          , AGE
          , IFNULL(TLNO, 'NONE')    AS TLNO
FROM        PATIENT
WHERE       GEND_CD = 'W'
            AND
            AGE <=12
ORDER BY    AGE DESC, PT_NAME ASC
;