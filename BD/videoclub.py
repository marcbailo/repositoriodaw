CREATE TABLE Pelicula (
CodiPeli INT(5),
Titol VARCHAR(15),
CodiGenere INT(5),
SegonaPart INT(5),
CodiActor INT(5),
PRIMARY KEY (CodiPeli)

);


CREATE TABLE Genere (
CodiGenere INT(5),
Descripcio VARCHAR(15), 
PRIMARY KEY (CodiGenere)

);

CREATE TABLE Copia (
CodiPeli INT(5),
CodiCopia INT(5),
PRIMARY KEY (CodiCopia),
FOREIGN KEY (CodiPeli) REFERENCES Pelicula (CodiPeli)

);


CREATE TABLE Actor (
CodiActor INT(5),
Nom VARCHAR(15),
PRIMARY KEY (CodiActor)

);

CREATE TABLE Interpretada (
CodiPeli INT(5),
CodiActor INT(5), 
FOREIGN KEY (CodiPeli) REFERENCES Pelicula (CodiPeli),
FOREIGN KEY (CodiActor) REFERENCES Actor (CodiActor)

);


CREATE TABLE Prestec (
CodiPeli INT(5),
CodiCopia INT(5),
Data DATE,
DNI CHAR(10),
PRIMARY KEY (Data),
FOREIGN KEY (CodiPeli) REFERENCES Pelicula (CodiPeli),
FOREIGN KEY (CodiCopia) REFERENCES Copia (CodiCopia)

);


CREATE TABLE Client (
DNI CHAR(10),
Nom VARCHAR(20),
Adreca VARCHAR(20),
Telefon CHAR(9),
PRIMARY KEY (DNI)

);

CREATE TABLE Factura (
CodiFactura INT(5),
Data DATE,
Import DECIMAL(9,2),
DNI CHAR(10),
PRIMARY KEY (CodiFactura),
FOREIGN KEY (DNI) REFERENCES Client (DNI)

);


CREATE TABLE Detallfactura (
CodiFactura INT(5),
LiniaFactura INT(5),
Descripcio VARCHAR(15),
PreuUnitari DECIMAL(9,2),
NumeroUnitats INT(5),
PRIMARY KEY (LiniaFactura),
FOREIGN KEY (CodiFactura) REFERENCES Factura (CodiFactura)


);


