-- 코드를 작성해주세요
select count(*) as FISH_COUNT
FROM  FISH_INFO f JOIN FISH_NAME_INFO fi on f.FISH_TYPE= fi.FISH_TYPE
where fi.fish_name='BASS' OR FI.FISH_NAME='SNAPPER'
