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
	`Nume_Fact` INT PRIMARY KEY AUTO_INCREMENT,
	`Tota_Fact` INT,
	`Fech_Fact` DATE,
	`Obse_Fact` VARCHAR(250),
	`Desc_Fact` INT,
	`Fech_Even` DATE,
	`Iden_Clie` VARCHAR(15),
	FOREIGN KEY (`Iden_Clie`) REFERENCES cliente (`Iden_Clie`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `detalle`(
	`Nume_Deta` INT PRIMARY KEY AUTO_INCREMENT,
	`Nomb_Deta` VARCHAR(25),
	`Desc_Deta` VARCHAR(250),
	`Cant_Deta` INT,
	`Valo_Deta` INT,
	`Nume_Fact` INT NOT NULL,
	FOREIGN KEY (`Nume_Fact`) REFERENCES factura (`Nume_Fact`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `inventario`(
	`Nume_Inve` VARCHAR(25) NOT NULL PRIMARY KEY,
	`Nomb_Inve` VARCHAR(30),
	`Desc_Inve` VARCHAR(250),
	`Cant_Inve` INT
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `licencia`(
    `Codi_Lice` VARCHAR(20) NOT NULL PRIMARY KEY,
    `Esta_Lice` BOOLEAN
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO administrador (Iden_Admi,Nomb_Admi,Apel_Admi,Pass_Admi) VALUES ('20141502','root','Super Usuario','root2014'),
                                                                           ('770329785','Fernando','Camargo Plata','fernando2014'),
                                                                           ('1065610405','Leonis Rafael','Ocampo Neves','junior1989');