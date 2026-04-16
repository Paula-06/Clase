CREATE TABLE vagon (
    codigo_tren VARCHAR2(10),
    orden number(2),
    modelo VARCHAR2(10),
    año_fab NUMBER(4),
    constraint PK_vagon primary key (codigo_tren, orden),
    constraint orden check (orden >= 1 and orden<=20),
    constraint año_fabricación check ( año_fab >= 2015)
    
);

create table extintor (
    num_ref VARCHAR2(4),
    codigo_tren VARCHAR2(10),
    orden number(2),
    constraint PK_num_ref PRIMARY KEY (num_ref),
    constraint FK_extintor Foreign key (codigo_tren, orden) references vagon(codigo_tren, orden)
);


SELECT constraint_name, column_name
FROM user_cons_columns
WHERE table_name = 'VAGON';

SELECT * FROM user_constraints WHERE table_name='vagon'; 
SELECT * FROM user_constraints WHERE table_name='extintor'; 
SELECT * FROM user_cons_columns WHERE table_name='vagon'; 
SELECT * FROM user_cons_columns WHERE table_name='extintor'; 




INSERT INTO vagon VALUES ('120A', 1, 'D-2866 LUE', 2018);
INSERT INTO vagon VALUES ('120A', 2, 'H-333 DUE', 2020);
INSERT INTO vagon VALUES ('120A', 3, 'D-2866 LUE', 2020;
INSERT INTO vagon VALUES ('120A', 4, 'H-333 DUE', 2020);
INSERT INTO vagon VALUES ('033B', 1, 'H-333 DUE', 2018);
INSERT INTO vagon VALUES ('033B', 2, 'H-333 DUE', 2020);
INSERT INTO vagon VALUES ('033B', 3, 'H-333 DUE', 2020);
INSERT INTO vagon VALUES ('033B', 4, 'H-333 DUE', 2020);

----------------
-- Tren 120A
INSERT INTO extintor  VALUES ('1000', '120A', 1);
INSERT INTO extintor  VALUES ('6700', '120A', 2);
INSERT INTO extintor  VALUES ('1902', '120A', 3);
INSERT INTO extintor  VALUES ('4560', '120A', 4);

-- Tren 033B
INSERT INTO extintor VALUES ('0034', '033B', 1);
INSERT INTO extintor  VALUES ('0034', '033B', 1);
INSERT INTO extintor  VALUES ('3321', '033B', 2);
INSERT INTO extintor  VALUES ('771', '033B', 4);
INSERT INTO extintor  VALUES ('1802', '033B', 4);

------------------

INSERT INTO vagon (codigo_tren, orden, modelo, año_fab) VALUES ('120A', 4, 'D-2866 LUE', 2015);
INSERT INTO vagon (codigo_tren, orden, modelo, año_fab) VALUES ('120A', 3, 'D-2866 LUE', 2020);
INSERT INTO vagon (codigo_tren, orden, modelo, año_fab) VALUES ('120A', 21, 'D-2866 LUE', 2020);
INSERT INTO extintor (num_ref, orden, codigo_tren) VALUES ('1902', 3, '120A');
INSERT INTO extintor (num_ref, orden, codigo_tren) VALUES ('1903', 4, '120A');

select * from vagon;
select * from extintor;

