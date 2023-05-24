-- 코드를 입력하세요
SELECT DR_NAME, DR_ID, MCDP_CD, TO_CHAR(hire_ymd,'YYYY-MM-DD') as HIRE_YMD from doctor where MCDP_CD = 'CS'or MCDP_CD = 'GS' ORDER BY HIRE_YMD desc , DR_NAME ASC