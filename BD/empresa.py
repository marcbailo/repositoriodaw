CREATE TABLE Producte (
PROD_NUM INT(6),
DESCRIPCIO VARCHAR(30),
PRIMARY KEY (PROD_NUM)

);

CREATE TABLE Detall (
COM_NUM SMALLINT(4),
DETALL_NUM SMALLINT(4),
PROD_NUM INT(6),
PREU_VENDA DECIMAL(8,2),
QUANTITAT INT(8),
IMPORT DECIMAL(8,2),
PRIMARY KEY (DETALL_NUM),
FOREIGN KEY (PROD_NUM) REFERENCES Producte (PROD_NUM),  
FOREIGN KEY (COM_NUM) REFERENCES Comanda (COM_NUM)

);

CREATE TABLE Emp (
EMP_NO SMALLINT(4),
COGNOM VARCHAR(10),
OFICI VARCHAR(10),
CAP SMALLINT(4),
DATA_ALTA DATE,
SALARI INT,
COMISSIO INT,
DEPT_NO TINYINT(2),
PRIMARY KEY (EMP_NO),
FOREIGN KEY (DEPT_NO) REFERENCES Dept (DEPT_NO)

);



CREATE TABLE Comanda (
COM_NUM SMALLINT(4),
COM_DATA DATE,
COM_TIPUS CHAR(1),
CLIENT_COD INT(6),
DATA_TRAMESA DATE,
TOTAL DECIMAL(8,2),
PRIMARY KEY (COM_NUM),
FOREIGN KEY (CLIENT_COD) REFERENCES Client (CLIENT_COD)

);


CREATE TABLE Dept (
DEPT_NO TINYINT(2),
DNOM VARCHAR(14),
LOC VARCHAR(14),
PRIMARY KEY (DEPT_NO)

);



CREATE TABLE Client (
CLIENT_COD INT(6),
NOM VARCHAR(45),
ADRECA VARCHAR(40),
CIUTAT VARCHAR(30),
ESTAT VARCHAR(2),
CODI_POSTAL VARCHAR(9),
AREA SMALLINT(3),
TELEFON VARCHAR(9),
REPR_COD SMALLINT(4),
LIMIT_CREDIT DECIMAL(9,2),
OBSERVACIONS TEXT,
PRIMARY KEY (CLIENT_COD)

);









