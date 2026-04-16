-- ===================  Ejercicios JOINS
select * from client;
SELECT * FROM merchan;
SELECT * FROM factura;
SELECT * FROM detalle_factura;

-- 11.1)
SELECT F.NUM_FACT, F.FECHA, C.CIF, C."DIRECCIÓN"
FROM FACTURA F
JOIN CLIENT C
ON f.cif_cliente = C.CIF;

-- 11.2)
SELECT F.NUM_FACT, F.FECHA, D.PRODUCTO, D.CANTIDAD
FROM FACTURA F
JOIN DETALLE_FACTURA D
ON F.NUM_FACT = D.NUM_FACT;

-- 11.3)
SELECT F.NUM_FACT, F.FECHA, M.PRODUCTO, M.DESCRIPCION, D.CANTIDAD
FROM FACTURA F
JOIN DETALLE_FACTURA D
ON F.NUM_FACT = D.NUM_FACT
JOIN MERCHAN M
ON D.PRODUCTO = M.PRODUCTO
ORDER BY F.NUM_FACT;

-- 11.4)
SELECT C.CIF, F.NUM_FACT
FROM CLIENT C
LEFT JOIN FACTURA F
ON C.CIF = f.cif_cliente;

-- 11.5)
SELECT DISTINCT M.MATERIAL
FROM CLIENT C
JOIN FACTURA F
ON C.CIF = f.cif_cliente
JOIN DETALLE_FACTURA D
ON F.NUM_FACT = D.NUM_FACT
JOIN MERCHAN M
ON D.PRODUCTO = M.PRODUCTO
WHERE c.empresa = 'BOT SA';

-- 11.6)
SELECT M.PRODUCTO, M.DESCRIPCION, M.MATERIAL, D.NUM_FACT
FROM MERCHAN M
LEFT JOIN DETALLE_FACTURA D
ON M.PRODUCTO = D.PRODUCTO;

-- 11.7)
SELECT SUM(M.PRECIO * D.CANTIDAD) AS TOTAL_FACTURA
FROM DETALLE_FACTURA D
JOIN MERCHAN M
ON D.PRODUCTO = M.PRODUCTO
WHERE D.NUM_FACT = 1;


-- =================== EJERCICIO 12
select * from maletines;
select * from tubos_pintura;

-- 12.1)
SELECT T.REF, M.MATERIAL
FROM TUBOS_PINTURA T
JOIN MALETINES M
ON t.cod_maletin = m.cod_maletin;

-- 12.2)
SELECT COUNT(*) AS CANTIDAD_TUBOS
FROM TUBOS_PINTURA
WHERE cod_maletin = 'M-3';

-- 12.3)
SELECT T.REF, T.COLOR, M.COD_MALETIN, M.MATERIAL
FROM TUBOS_PINTURA T
LEFT JOIN MALETINES M
ON t.cod_maletin = M.COD_MALETIN;


-- =================== Ejercicio 13
select * from maletines;
select * from tubos_pintura;

-- 13.1 Mostrar la lista de marcas de pintura ordenadas alfabéticamente
SELECT DISTINCT marca
FROM tubos_pintura
ORDER BY marca ASC;

-- 13.2 Para cada marca, cuántos tubos de pintura tiene
SELECT marca, COUNT(*) AS total_tubos
FROM tubos_pintura
GROUP BY marca;

-- 13.3 Marcas que tienen más de 2 tubos de pintura
SELECT marca, COUNT(*) AS total_tubos
FROM tubos_pintura
GROUP BY marca
HAVING COUNT(*) > 2;

-- HAVING se usa para filtrar resultados después del GROUP BY.

-- 13.4 Para cada marca, cuántos colores distintos tiene
SELECT marca, COUNT(DISTINCT color) AS colores_distintos
FROM tubos_pintura
GROUP BY marca;

-- 13.5 Para cada color, cuántas marcas lo tienen disponible
SELECT color, COUNT(DISTINCT marca) AS total_marcas
FROM tubos_pintura
GROUP BY color;

-- 13.6 Para cada marca y color, cuántos tubos hay (ordenado por marca)
SELECT marca, color, COUNT(*) AS total_tubos
FROM tubos_pintura
GROUP BY marca, color
ORDER BY marca;

-- 13.7 Igual que el anterior pero solo colores tipo “siena”
SELECT marca, color, COUNT(*) AS total_tubos
FROM tubos_pintura
WHERE color LIKE '%siena%'
GROUP BY marca, color
ORDER BY marca;

--13.8 Cuántos tubos tiene cada maletín (incluyendo vacíos)
SELECT m.id_maletin, COUNT(mt.id_tubo) AS total_tubos
FROM maletines m
LEFT JOIN maletines mt
ON m.id_maletin = mt.id_maletin
GROUP BY m.id_maletin;



-- =================== Ejercicio 14
select * from client;
select * from merchan;
select * from factura;
select * from detalle_factura;





---------------- Combinación de operadores de conjunto

select * from alum; --actuales
select * from nuevos; -- reservado
select * from antiguos; --finalizar

-- a) todos los nombres sin repetir
SELECT nombre FROM alum
UNION
SELECT nombre FROM nuevos;

-- b) todos los nombres incluso repetidos
SELECT nombre FROM alum
UNION ALL
SELECT nombre FROM nuevos;

-- c) alumnos antiguos que están estudiando actualmente en el centro. Con operador conjunto
SELECT nombre FROM antiguos
INTERSECT
SELECT nombre FROM alum;

-- c) sin operador
select nombre from alum 
where edad >= 20;

-- d) alumnos actuales (nombre, edad y localidad) que nunca estudiaron antes en el centro Se 
-- considera que es un mismo alumno si coincide su nombre, edad y localidad. lta:
SELECT a.nombre
FROM antiguos a
JOIN alum c
    ON a.nombre = c.nombre;

-- d) Sin operador
SELECT except.nombre, except.edad, localidad
FROM alum
EXCEPT;
SELECT nombre, edad, localidad
FROM antiguos;

-- e)
SELECT DISTINCT C.nombre
FROM alum C
JOIN antiguos A
    ON C.nombre = A.nombre
JOIN nuevos R
    ON C.nombre = R.nombre;
