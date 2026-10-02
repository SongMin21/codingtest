-- 코드를 입력하세요
-- 리뷰를 가장 많이 작성한 회원의 리뷰 조회
-- 작성일 기준 오름차순, 리뷰 텍스트 오름차순

SELECT  P.MEMBER_NAME,
        R.REVIEW_TEXT,
        R.REVIEW_DATE
FROM    MEMBER_PROFILE P
INNER JOIN REST_REVIEW R
        ON P.MEMBER_ID = R.MEMBER_ID
WHERE   P.MEMBER_ID  = (
            SELECT  MEMBER_ID
            FROM    REST_REVIEW
            GROUP BY MEMBER_ID
            ORDER BY COUNT(*) DESC
            LIMIT 1
    )
ORDER BY    REVIEW_DATE ASC, REVIEW_TEXT ASC;