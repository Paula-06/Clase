select A.nombre from alumnos A;

select dnombre "Departamento", dept_no "Número de departamento" from depart;

SELECT    * FROM emple;

SELECT * FROM EMPLE WHERE oficio = 'ANALISTA';

SELECT EMP_NO, APELLIDO, OFICIO, DEPT_NO "DEPARTAMENTO" -- LE ASIGNAS A DEPT_NO EL NOMBRE DEPARTAMENTO
FROM EMPLE -- DE LA TABLA EMPLE
WHERE DEPT_NO = 20 -- DE DEPT_NO LOS QUE TENGAN EL NUMERO 20
ORDER BY APELLIDO; -- APPELLIDO APARECE ORDENADO 


SELECT *
FROM emple
WHERE dept_no = 20
  AND oficio = 'ANALISTA'
ORDER BY apellido DESC, emp_no DESC;

SELECT
    *
FROM ALUMNOS;

SELECT dni, nombre, apellidos, curso, nivel, clase
FROM alum22
ORDER BY nombre ASC, apellidos ASC;

select dni, nombre, apellidos, curso, nivel, clase from alum22 order by nombre, apellidos;

Alejandro Guillén Plazuelo
Alejandro Guillén Plazuelo dice:SELECT NOMBRE, APELLIDOS, FECHA_NAC FROM ALUM22 WHERE PROVINCIA='GUADALAJARA' ORDER BY fecha_nac ASC; 