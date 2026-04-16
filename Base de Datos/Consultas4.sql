-------------------              Ejercicio 4          ------------------
create table peliculas(
titulo varchar(40),
año number(4),
duracion number(3),
presupuesto number(12,2),
recaudacion number(12,2) default 0,
oscar number(2),
primary key (titulo,año)
);

insert into peliculas values ('Ben Hur',1959,212,15175000,146900000,11);
insert into peliculas (titulo,año,duracion,presupuesto,recaudacion) values ('Ben Hur',2016,124,100000000,94061311.65);
insert into peliculas values ('Forrest Gump',1994,142,55000000,677387716.78,6);
insert into peliculas values ('El Padrino',1972,175,6000000,245066411.24,3);
insert into peliculas values ('La La Land',2016,128,30000000,445636919.02,6);
insert into peliculas values ('Million Dollar Baby',2004,132,30000000,216763646,4);

commit;

--4.1 Número de películas
SELECT COUNT(*) 
FROM peliculas;

--4.2 Número que han ganado algún Óscar
SELECT COUNT(*)
FROM peliculas
WHERE oscar > 0;

--4.3 Duración media de las películas
SELECT ROUND(AVG(duracion),0)
FROM peliculas;

--4.4 Mayor recaudación redondeada al millar
SELECT ROUND(MAX(recaudacion),-3)
FROM peliculas;

--4.5 Mayor presupuesto invertido
select MAX(presupuesto) 
FROM peliculas;

--4.6 Películas con presupuesto mayor a 30.000.000
SELECT COUNT(*)
FROM peliculas
WHERE presupuesto > 30000000;

--4.7 Recaudación total de todas las películas
SELECT ROUND(SUM(recaudacion),0)
FROM peliculas;

--4.8 Duración de la película más larga
SELECT MAX(duracion)
FROM peliculas;

--4.9 Recaudación total de películas después del 2000
SELECT SUM(recaudacion)
FROM peliculas
WHERE año > 2000;

--4.10 Menor recaudación sin decimales
SELECT ROUND(MIN(recaudacion),0)
FROM peliculas;

--4.11 Año más antiguo, más moderno y diferencia
SELECT 
MIN(año),
MAX(año),
MAX(año) - MIN(año) AS DIFERENCIA
FROM peliculas;

--4.12 Beneficio de cada película
SELECT titulo, año, (recaudacion - presupuesto) AS beneficio
FROM peliculas
ORDER BY beneficio DESC;

--4.13 Duración media con un decimal
SELECT ROUND(AVG(duracion),1)
FROM peliculas;

--4.14 Películas entre 2h y 2h30
SELECT COUNT(*)
FROM peliculas
WHERE duracion BETWEEN 120 AND 150;

--4.15 Duración total en horas
SELECT SUM(duracion)/60
FROM peliculas;

--4.16 Número de títulos distintos
SELECT COUNT(DISTINCT titulo)
FROM peliculas;