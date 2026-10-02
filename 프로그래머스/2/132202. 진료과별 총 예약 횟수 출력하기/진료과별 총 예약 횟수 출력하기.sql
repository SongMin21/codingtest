-- 코드를 입력하세요
-- 2022년 5월 예약한 환자 수 -> 진료과코드 별 조회
-- 환자 수를 기준으로 오름차순 정렬 -> 진료과 코드 오름차순
SELECT          MCDP_CD     AS  진료과코드
              , COUNT(*)    AS  5월예약건수
FROM            APPOINTMENT
WHERE           YEAR(APNT_YMD) = '2022'
                AND
                MONTH(APNT_YMD) = '05'
GROUP BY        MCDP_CD
ORDER BY        5월예약건수 ASC, 진료과코드 ASC
;