-- 코드를 입력하세요
SELECT COUNT(name)
 FROM (SELECT DISTINCT name 
        FROM ANIMAL_INS);