-- 코드를 입력하세요
-- 2021년 가입 회원
-- 나이 >= 20 AND 나이 <= 29
-- 몇 명?
SELECT      COUNT(*)    AS USERS
FROM        USER_INFO
WHERE       YEAR(JOINED) = '2021'
            AND
            AGE BETWEEN 20 AND 29
;