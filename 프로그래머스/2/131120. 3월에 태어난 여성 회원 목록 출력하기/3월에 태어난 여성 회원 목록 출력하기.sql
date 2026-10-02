-- 코드를 입력하세요
-- 생일이 3월 여성
-- 전화번호 NULL : 출력 대상 제외
-- 회원 ID 오름차순
SELECT      MEMBER_ID
          , MEMBER_NAME
          , GENDER
          , DATE_OF_BIRTH
FROM        MEMBER_PROFILE
WHERE       TLNO IS NOT NULL
            AND
            MONTH(DATE_OF_BIRTH) = '3'
            AND
            GENDER = 'W'
ORDER BY    MEMBER_ID ASC
;