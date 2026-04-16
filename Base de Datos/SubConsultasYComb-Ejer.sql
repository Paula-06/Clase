select * from emple;
select * from depart;

------- Tablas EMPLE y DEPART
--a) 
SELECT emple.emp_no, emple.apellido, emple.oficio, depart.dnombre, depart.loc
FROM emple, depart
WHERE emple.dept_no = depart.dept_no;

--b)
SELECT emple.emp_no, emple.apellido, emple.oficio, depart.dnombre, depart.loc
FROM emple, depart
WHERE emple.dept_no = depart.dept_no
  AND emple.oficio = 'ANALISTA';
  
  
  
  -- Tablas ALUMNOS, ASIGNATURAS y NOTAS
  
SELECT * FROM alumnos;
SELECT * FROM asignaturas;  
SELECT * FROM notas;

-- c)
SELECT alumnos.apenom
FROM alumnos, asignaturas, notas
WHERE alumnos.dni = notas.dni
  AND notas.cod = asignaturas.cod
  AND asignaturas.nombre = 'FOL'
  AND notas.nota BETWEEN 7 AND 8;

--d)
SELECT DISTINCT asignaturas.nombre
FROM asignaturas
WHERE asignaturas.cod NOT IN (
    SELECT cod
    FROM notas
    WHERE nota < 5
);

--a) Inner Join
select emp_no, apellido, dnombre
from emple, depart
where emple.dept_no = depart.dept_no;

-- Tablas: DATOSPERSONALES y DP_TEL
select * from dp_tel;
--b) 
select emp_no, apellido, dnombre
from emple, depart
where emple.dept_no = depart.dept_no(+);

SELECT 
    dp.login,
    dp.idioma, 
    t.telefono
FROM 
    DATOSPERSONALES dp
LEFT JOIN 
    DP_TEL t
ON 
    dp.login = t.login;

-- c) 
select e.emp_no, e.apellido, d.localidad
from emple e
left join depart d on e.dept_no = d.dept_no;

-- Tabla EMPLE
select * from emple;

-- a)  salario medio de la empresa
SELECT AVG(salario) AS salario_medio
FROM EMPLE;

-- b) salario medio del departamento 10.
SELECT AVG(salario) AS salario_medio_dept10
FROM EMPLE
WHERE dept_no = 10;

-- c) salario medio de cada departamento.
SELECT dept_no, AVG(salario) AS salario_medio
FROM EMPLE
GROUP BY dept_no;

-- Tabla EJEMPLAR_ARBOL
select *from ejemplar_arbol;

-- d) cada provincia, cuántos ejemplares de árbol hay de cada especie
SELECT provincia, especie, COUNT(*) AS num_ejemplares
FROM EJEMPLAR_ARBOL
GROUP BY provincia, especie
ORDER BY provincia, especie;

-- e) cada provincia, cuándo se plantó el último árbol de cada especie
SELECT provincia, especie, MAX("AÑO_PLANT") AS ultima_plantacion
FROM EJEMPLAR_ARBOL
GROUP BY provincia, especie
ORDER BY provincia, especie;




