CREATE TABLE FIESTA_A(
ID_FIESTA NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(100)UNIQUE,
FECHA DATE,
DESCRIPCION NVARCHAR2(100)
);

INSERT INTO FIESTA_A VALUES(1,'Noche buena','24/12/2022','Es una fiesta a donde se unen las familias');
commit;