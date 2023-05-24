-- 코드를 입력하세요
SELECT animal_id,name,
(CASE WHEN sex_upon_intake like '%Neutered%' THEN 'O'
WHEN sex_upon_intake like '%Spayed%' THEN 'O'
ELSE 'X' END) as 중성화
FROM ANIMAL_INS
ORDER BY ANIMAL_ID asc;