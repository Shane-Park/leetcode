SELECT name, population, area
FROM World
where area >= 3000000
union
SELECT name, population, area
FROM World
where population >= 25000000;

