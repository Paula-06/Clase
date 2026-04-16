create table ejemplar_arbol(
especie varchar2(20),
poblacion varchar2(30),
provincia varchar2(20),
orden_reg number(4),
año_plant number(7),
pulgon varchar2(2) check (pulgon in ('SI','NO')),
cochinilla varchar2(2) check (cochinilla in ('SI','NO')),
altura_cm number(7),
estado varchar2(7) check (estado in ('SANO','ENFERMO')),
riego varchar2(10),
rec_periodicidad_poda varchar2(10),
ultima_poda varchar2(15),
constraint PK_EJEMPLAR_ARBOL primary key (especie,poblacion,provincia,orden_reg));

-----------------                   EJERCICIO 1                     -----------------
--1 
SELECT * FROM EJEMPLAR_ARBOL;

--2
SELECT DISTINCT especie, altura_cm
FROM EJEMPLAR_ARBOL
ORDER BY especie ASC, altura_cm DESC;
--3 
SELECT DISTINCT A.especie
FROM EJEMPLAR_ARBOL A;

--4 
SELECT *
FROM EJEMPLAR_ARBOL
WHERE poblacion = 'COSLADA'
ORDER BY año_plant DESC;

--5 
SELECT año_plant, altura_cm AS "ALTURA EN CENTÍMETROS"
FROM EJEMPLAR_ARBOL
WHERE especie = 'ENCINA'
ORDER BY altura_cm DESC;


--6 
select distinct especie , estado from ejemplar_arbol order by estado desc; 

--7
SELECT DISTINCT especie
FROM EJEMPLAR_ARBOL
WHERE estado = 'ENFERMO'
ORDER BY especie ASC;

--8
SELECT DISTINCT poblacion
FROM EJEMPLAR_ARBOL
WHERE estado = 'ENFERMO'
AND cochinilla = 'NO'
AND pulgon = 'NO'
ORDER BY poblacion ASC;

--9
SELECT DISTINCT especie
FROM EJEMPLAR_ARBOL
WHERE poblacion = 'RIVAS-VACIAMADRID'
AND cochinilla = 'SI';

--10 
SELECT especie, año_plant, altura_cm
FROM EJEMPLAR_ARBOL
WHERE provincia = 'GUADALAJARA'
ORDER BY año_plant ASC, altura_cm DESC;

-----------------                   EJERCICIO 2                     -----------------

-- 2.1 Árboles plantados entre 2010 y 2012
SELECT *
FROM ejemplar_arbol
WHERE año_plant BETWEEN 2010 AND 2012;

-- 2.2 Árboles de Madrid sin poda registrada y más de 300 cm
SELECT *
FROM ejemplar_arbol
WHERE provincia = 'MADRID'
AND ultima_poda IS NULL
AND altura_cm > 300;

-- 2.3 Alcornoques en Oviedo antes de 2007 y más de 500 cm, ordenados por altura
SELECT *
FROM ejemplar_arbol
WHERE especie = 'ALCORNOQUE'
AND poblacion = 'OVIEDO'
AND año_plant 500
ORDER BY altura_cm;

-- 2.4 Poblaciones y provincias con poda realizada pero sin recomendación de poda
SELECT DISTINCT provincia, poblacion
FROM ejemplar_arbol
WHERE ultima_poda != 'NO REGISTRADA'
AND rec_periodicidad_poda = 'NO PODA'
ORDER BY provincia, poblacion;

-- 2.5 Alturas de árboles con riego y plantados antes del 2000
SELECT DISTINCT altura_cm -- DISTINCT PARA Q ES
FROM ejemplar_arbol
WHERE riego IS NOT NULL
AND año_plant < 2000
ORDER BY altura_cm ASC;

-- 2.8 Poblaciones con más de una palabra y su provincia
SELECT poblacion, provincia
FROM ejemplar_arbol
WHERE poblacion LIKE '% %' AND poblacion LIKE '%-%'
ORDER BY poblacion;--NO FUNCIONA

-- 2.9 Árboles enfermos y sin riego
SELECT *
FROM ejemplar_arbol
WHERE estado = 'ENFERMO'
AND riego IS NULL;

-- 2.10 Árboles plantados en Madrid y Barcelona en 2000, 2010 y 2015
SELECT *
FROM ejemplar_arbol
WHERE poblacion IN ('MADRID', 'BARCELONA')
AND año_plant IN (2000, 2010, 2015)
ORDER BY poblacion, altura_cm;


