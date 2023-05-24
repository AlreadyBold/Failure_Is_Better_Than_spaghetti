-- 코드를 입력하세요
SELECT ANIMAL_ID , NAME FROM ANIMAL_INS WHERE animal_type = 'Dog' and Lower(NAME) LIKE '%el%' order by name asc;