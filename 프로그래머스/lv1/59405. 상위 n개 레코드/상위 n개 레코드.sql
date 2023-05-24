-- 코드를 입력하세요

SELECT name FROM (SELECT name from animal_ins order by datetime asc) WHERE ROWNUM < 2;