-- 코드를 입력하세요
WITH WT AS 
     (SELECT host_id ,count(host_id) from places group by host_id Having count(host_id) > 1)
select a.ID, a.NAME, b.host_id
from places a
inner join WT b
on ( a.host_id = b.host_id)
order by a.id asc