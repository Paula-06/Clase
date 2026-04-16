select * from depart;
select * from emple;
-- a) obtén la suma de salarios, el salario máximo y el salario mínimo por cada departamento.
SELECT dept_no,
    SUM(salario) AS suma_salarios,
    MAX(salario) AS salario_maximo,
    MIN(salario) AS salario_minimo
FROM emple
GROUP BY dept_no;

-- b) Visualiza el número de empleados del departamento más pequeño (con menos empleados).
SELECT COUNT(*) AS emp_no
FROM emple
GROUP BY dept_no
HAVING COUNT(*) = (
    SELECT MIN(COUNT(*))
    FROM emple
    GROUP BY dept_no
    );
    

-----------------

-- a) Visualiza el mayor salario medio por departamento que haya en la empresa.
SELECT MAX(media_salario)
FROM (
    SELECT AVG(salario) AS media_salario
    FROM emple
    GROUP BY dept_no
); 