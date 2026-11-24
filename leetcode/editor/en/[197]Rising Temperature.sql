select id
from Weather as today
join Weather as yesterday
    on today.recordDate = date.add(yesterday.(rerecordDate), 1)
WHERE today.temperature > yesterday.temperature