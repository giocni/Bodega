CREATE DATABASE `db_fernando`;
USE `db_fernando`;

CREATE TABLE `administrador`(
	`Iden_Admi` VARCHAR(15) NOT NULL PRIMARY KEY,
	`Nomb_Admi` VARCHAR(30),
	`Apel_Admi` VARCHAR(30),
	`Pass_Admi` VARCHAR(16)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cliente`(
	`Iden_Clie` VARCHAR(15) NOT NULL PRIMARY KEY,
	`Nomb_Clie` VARCHAR(30),
	`Apel_Clie` VARCHAR(30),
	`Tele_Clie` VARCHAR(15)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `factura`(
	`Nume_Fact` VARCHAR(25) NOT NULL PRIMARY KEY,
	`Tota_Fact` VARCHAR(25),
	`Fech_Fact` DATE,
	`Obse_Fact` VARCHAR(250),
	`Fech_Even` DATE,
	`Iden_Admi` VARCHAR(15),
	`Iden_Clie` VARCHAR(15),
	`Desc_Fact` INT,
	FOREIGN KEY (`Iden_Admi`) REFERENCES administrador (`Iden_Admi`),
	FOREIGN KEY (`Iden_Clie`) REFERENCES cliente (`Iden_Clie`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `detalle`(
	`Nume_Deta` VARCHAR(25) NOT NULL PRIMARY KEY,
	`Nomb_Deta` VARCHAR(25),
	`Desc_Deta` VARCHAR(250),
	`Cant_Deta` INT,
	`Valo_Deta` INT,
	`Nume_Fact` VARCHAR(25),
	FOREIGN KEY (`Nume_Fact`) REFERENCES factura (`Nume_Fact`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `inventario`(
	`Nume_Inve` VARCHAR(25) NOT NULL PRIMARY KEY,
	`Nomb_Inve` VARCHAR(30),
	`Desc_Inve` VARCHAR(250),
	`Cant_Inve` INT
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO administrador (Iden_Admi,Nomb_Admi,Apel_Admi,Pass_Admi) VALUES ('20141502','root','Super Usuario','root2014'),
                                                                           ('770329785','Fernando','Camargo Plata','fernando2014');