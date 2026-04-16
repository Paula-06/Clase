-------------------              Ejercicio 5          ------------------

select * from ejemplar_arbol;
DESCRIBE ejemplar_arbol;

--5.1 Cuántos ejemplares de Pino Carrasco hay en total
SELECT COUNT(*) AS total_pinos_carrasco
FROM EJEMPLAR_ARBOL
WHERE especie = 'PINO CARRASCO';

--5.2 Cuántos ejemplares hay de Pino Carrasco en Asturias
SELECT COUNT(*) AS pinos_carrasco_asturias
FROM EJEMPLAR_ARBOL
WHERE especie = 'PINO CARRASCO'
AND provincia = 'ASTURIAS';

--5.3 En cuántas provincias hay Pino Carrasco.
SELECT COUNT(*) AS pinos_carrasco_asturias
FROM EJEMPLAR_ARBOL
WHERE especie = 'PINO CARRASCO'
AND provincia = 'ASTURIAS';

--5.4 Listar las provincias en las que hay algún ejemplar de Pino Carrasco
SELECT DISTINCT provincia
FROM EJEMPLAR_ARBOL
WHERE especie = 'PINO CARRASCO';

--5.5 Listar para cada árbol los campos de su clave primaria y el tipo de riego
SELECT ESPECIE,
       POBLACION,
       COALESCE(RIEGO, 'SIN RIEGO') AS riego
FROM EJEMPLAR_ARBOL
ORDER BY COALESCE(RIEGO, 'SIN RIEGO');