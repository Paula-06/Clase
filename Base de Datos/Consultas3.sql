create table edificio(
pais varchar2(30),
cod_direccion varchar(10),
uso varchar2(10) check (uso in ('público','privado')),
inicio_obras date,
fin_obras date,
plantas number(4),
altura_planta_cm number(6),
aforo_planta number(5),
metros_planta number(5),
altura_total_cm number(7),
material varchar2(30),
extintores number(5),
cod_arquitec varchar2(5),
cod_constructora varchar2(5) not null,
precio number(9),
constraint PK_EDIFICIO primary key (pais,cod_direccion)
);

select * from edificio;

-----------------                   EJERCICIO 3                     -----------------
--1
SELECT pais,
       (fin_obras - inicio_obras) AS "duración obras (días)"
FROM edificio
WHERE cod_constructora = 'AAA0'
ORDER BY pais, (fin_obras - inicio_obras);

--2
SELECT pais,
       cod_direccion,
       material,
       metros_planta,
       plantas,
       (metros_planta * plantas) AS "superficie total (m2)"
FROM edificio
WHERE uso = 'público'
AND inicio_obras > TO_DATE('31-12-2000','DD-MM-YYYY')
ORDER BY material, pais;

--3
SELECT DISTINCT cod_constructora
FROM edificio
WHERE (extintores / plantas) < 5;

--4
SELECT cod_constructora,
       ROUND((precio / plantas) / 1000000, 2) AS "precio x planta (mill.)"
FROM edificio
WHERE pais = 'Brasil'
AND material = 'cemento'
AND (extintores / plantas) > 10
ORDER BY "precio x planta (mill.)" DESC;

--5
SELECT *
FROM edificio
WHERE pais = 'Japón'
AND material = 'madera'
AND (fin_obras - inicio_obras) > 365;
--6
SELECT *
FROM edificio
WHERE pais IN ('España','Italia')
AND (
      (precio / plantas) > 3000000
      OR (altura_total_cm > 5000 AND material <> 'madera')
    );
    