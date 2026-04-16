-- Ejercicios subconsultas y combinación

-- Tabla Emple y Depart
select * from emple;
select * from depart;

----------------------------- Ejercicio 6

-- a)
SELECT depart.loc
FROM emple, depart
WHERE emple.oficio = 'ANALISTA';

-- b)
SELECT e.*
FROM EMPLE e
JOIN EMPLE d ON e.DIR = d.emp_no
WHERE d.APELLIDO = 'CEREZO';

-- c)
SELECT *
FROM emple
WHERE dept_no = (
  SELECT dept_no
  FROM depart
  WHERE depart.dnombre = 'VENTAS'
);

-- d)
SELECT *
FROM DEPART d
WHERE NOT EXISTS (
  SELECT 1
  FROM EMPLE e
  WHERE e.dept_no = d.dept_no
);

-- e) 
SELECT *
FROM DEPART d
WHERE EXISTS (
  SELECT 1
  FROM EMPLE e
  WHERE e.dept_no = d.dept_no
);

-- f)
SELECT apellido, salario
FROM EMPLE
WHERE salario > ALL (
  SELECT salario
  FROM EMPLE
  WHERE dept_no = 20
);

-- g)
SELECT e.emp_no, e.apellido, d.apellido AS director
FROM EMPLE e
LEFT JOIN EMPLE d ON e.dir = d.emp_no;

--------------------------------------- Ejercicio 7

select * from libreria;

-- a)
SELECT tema, estante, ejemplares
FROM LIBRERIA
WHERE ejemplares BETWEEN 8 AND 15;

-- b) 
SELECT tema, estante, ejemplares
FROM LIBRERIA
WHERE estante NOT BETWEEN 'B' AND 'D';

-- c)
SELECT tema
FROM LIBRERIA
WHERE ejemplares < (
  SELECT MIN(ejemplares)
  FROM LIBRERIA
  WHERE tema = 'MEDICINA'
);

-- d)
SELECT tema
FROM LIBRERIA
WHERE ejemplares NOT BETWEEN 15 AND 20;


-- e)
SELECT tema
FROM LIBRERIA
WHERE ejemplares = (
  SELECT MAX(ejemplares)
  FROM LIBRERIA
);

----------------------------- Ejercicio 8

select * from alumnos;
select * from asignaturas;
select * from notas;

-- a)
SELECT DISTINCT a.nombre
FROM ASIGNATURAS a
JOIN ALUMNOS al ON a.cod = a.cod
WHERE a.nombre LIKE '___'
AND al.pobla = 'Madrid';

-- b)
SELECT DISTINCT al.nombre
FROM ALUMNOS al
JOIN NOTAS n ON al.cod = n.cod_alum
WHERE al.ciudad = 'Madrid'
AND n.nota < 5;

-- c)
SELECT DISTINCT al.nombre
FROM ALUMNOS al
JOIN NOTAS n ON al.cod = n.cod_alum
WHERE n.nota IN (
  SELECT nota
  FROM NOTAS
  WHERE cod_alum = (
    SELECT cod
    FROM ALUMNOS
    WHERE nombre = 'Díaz Fernández, María'
  )
  AND cod_asig = (
    SELECT cod
    FROM ASIGNATURAS
    WHERE nombre = 'FOL'
  )
);

-- d)
SELECT *
FROM ASIGNATURAS a
WHERE NOT EXISTS (
  SELECT 1
  FROM NOTAS n
  WHERE n.cod_asig = a.cod
);

-- e)
SELECT al.nombre, al.apellido
FROM ALUMNOS al
JOIN NOTAS n ON al.cod = n.cod_alum
WHERE n.cod_asig = 1
AND n.nota >= 5;

-- f)
SELECT al.nombre, al.apellido
FROM ALUMNOS al
WHERE NOT EXISTS (
  SELECT 1
  FROM NOTAS n
  WHERE n.cod_alum = al.cod
  AND n.cod_asig = 1
);

-- g)
SELECT al.apellido, al.nombre, a.nombre AS asignatura, n.nota
FROM ALUMNOS al
JOIN NOTAS n ON al.cod = n.cod_alum
JOIN ASIGNATURAS a ON a.cod = n.cod_asig
ORDER BY al.apellido, a.nombre;



