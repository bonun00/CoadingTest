select e.id as ID, 
case when e.persent<=0.25 then 'CRITICAL'
     when e.persent<=0.50 then 'HIGH' 
     when e.persent<=0.75 then 'MEDIUM'
     else'LOW' END 
     AS COLONY_NAME

from
(
    select ID,
    percent_rank() over (order by size_of_colony desc) as persent
    from ecoli_Data
) e
    
order by e.Id asc    

