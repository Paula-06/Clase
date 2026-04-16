-- EJERCICIOS JOINS
select * from client;
select * from merchan;
select * from factura;
select * from detalle_factura;

------ EJERCICIOS 11

-- 11.1
SELECT f.num_fact, f.fecha, c.cif, c."DIRECCIÓN"
FROM factura f
JOIN client c ON f.cif_cliente = c.cif;

-- 11.2
SELECT f.num_fact, f.fecha, df.producto, df.cantidad
FROM factura f
JOIN detalle_factura df ON f.num_fact = df.num_fact;

-- 11.3
SELECT f.num_fact, f.fecha, m.producto, m.descripcion, df.cantidad
FROM factura f
JOIN detalle_factura df ON f.num_fact = df.num_fact
JOIN merchan m ON df.producto = m.producto
ORDER BY f.num_fact;

-- 11.4
SELECT c.cif, f.num_fact
FROM client c
LEFT JOIN factura f ON c.cif = f.cif_cliente;

-- 11.5
SELECT DISTINCT m.material
FROM client c
JOIN factura f ON c.cif = f.cif_cliente
JOIN detalle_factura df ON f.num_fact = df.num_fact
JOIN merchan m ON df.producto = m.producto
WHERE c.empresa = 'BOT SA';

-- 11.6
SELECT m.producto, m.descripcion, m.material, df.num_fact
FROM merchan m
LEFT JOIN detalle_factura df ON m.producto = df.producto;

-- 11.7
SELECT SUM(df.cantidad * m.precio) AS total_factura
FROM detalle_factura df
JOIN merchan m ON df.producto = m.producto
WHERE df.num_fact = 1;



------ EJERCICIOS 12
select * from maletines;
select * from tubos_pintura;

-- 12.1
SELECT t.ref, m.material
FROM TUBOS_PINTURA t
JOIN MALETINES m ON t.cod_maletin = m.cod_maletin;

-- 12.2
SELECT COUNT(*) AS cantidad_tubos
FROM TUBOS_PINTURA
WHERE cod_maletin = 'M-3';

-- 12.3
SELECT t.ref, t.color, m.cod_maletin, m.material
FROM TUBOS_PINTURA t
LEFT JOIN MALETINES m ON t.cod_maletin = m.cod_maletin;











