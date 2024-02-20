
CREATE TABLE Malalt (
Inscripcio INT(5),
Cognom VARCHAR(15),
Adreca VARCHAR(20),
Data_Naix DATE,
Sexe CHAR(1),
Nss CHAR(9)

);













CREATE TABLE Ingressos (
    Inscripcio INT(5),
    Hospital_Cod TINYINT(2),
    Sala_Cod TINYINT(2),
    Llit SMALLINT(4)
);


CREATE TABLE Hospital (
    Hospital_Cod TINYINT(2),
    Nom VARCHAR(10),
    Adreca VARCHAR(20),
    Telefon VARCHAR(8),
    Qtat_Llits SMALLINT(3)
);



CREATE TABLE Doctor (
    Hospital_Cod TINYINT(2),
    Doctor_No SMALLINT(3),
    Cognom VARCHAR(13),
    Especialitat VARCHAR(16)
);


CREATE TABLE Sala (
Hospital_Cod TINYINT(2),
Sala_Cod TINYINT(2),
Nom VARCHAR(20),
Qtat_Llits SMALLINT(3)

);



CREATE TABLE Plantilla (
    Hospital_Cod TINYINT(2),
    Sala_Cod TINYINT(2),
    Empleat_No SMALLINT(4),
    Cognom VARCHAR(15),
    Funcio VARCHAR(10),
    Torn VARCHAR(1),
    Salari INT(10)

);