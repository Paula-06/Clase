select * from emple;


      --                           Actividad 
-- a)

SELECT APELLIDO
FROM EMPLE
WHERE OFICIO = (
    SELECT OFICIO
    FROM EMPLE
    WHERE EMP_NO = 7788
);

-- b)

SELECT *
FROM EMPLE
WHERE SALARIO IN (
    SELECT SALARIO
    FROM EMPLE
    WHERE DEPT_NO = 30
);

-- c)

SELECT *
FROM EMPLE
WHERE SALARIO > (
    SELECT AVG(SALARIO)
    FROM EMPLE
);

-- d)

SELECT *
FROM EMPLE
WHERE DEPT_NO IN (
    SELECT DEPT_NO
    FROM DEPART
    WHERE LOC IN ('MADRID', 'BARCELONA')
);

-- e)

SELECT *
FROM EMPLE
WHERE DEPT_NO IN (
    SELECT DEPT_NO
    FROM DEPART
    WHERE LOC IN ('MADRID', 'BARCELONA')
)
AND SALARIO > 2000;

-- Actividad 

SELECT *
FROM EMPLE e
WHERE fecha_alt = (
    SELECT MIN(fecha_alt)
    FROM EMPLE
    WHERE oficio = e.oficio
);

-----                        Tablas EMPLE y DEPART

-- a)








