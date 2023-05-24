-- 코드를 입력하세요
SELECT animal_type
     , COUNT(*) AS cnt
  FROM animal_ins
  where ANIMAL_TYPE ='Cat' or ANIMAL_TYPE = 'Dog'
 GROUP BY animal_type HAVING COUNT(*) > 0
 order by animal_type asc