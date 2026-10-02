-- 코드를 작성해주세요
-- 부서별 평균 연봉
-- 부서별로 조회
-- 평균 연봉 -> 소수점 첫째 자리에서 반올림
-- 부서별 평균 연봉 내림차순 정렬

SELECT              D.DEPT_ID
                  , D.DEPT_NAME_EN
                  , ROUND(AVG(E.SAL))       AS AVG_SAL
FROM                HR_DEPARTMENT D
INNER JOIN          HR_EMPLOYEES E
        ON          D.DEPT_ID = E.DEPT_ID
GROUP BY            D.DEPT_ID
ORDER BY            AVG_SAL DESC
;