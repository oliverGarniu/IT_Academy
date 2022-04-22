-- MySQL Workbench Synchronization
-- Generated: 2021-12-11 08:40
-- Model: New Model
-- Version: 1.0
-- Project: Name of the project
-- Author: Fundació ILLESCAT

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

ALTER TABLE `Cul d´Ampolla`.`Clients` 
DROP COLUMN `RecomanatPer`,
DROP COLUMN `DataRegistre`,
DROP COLUMN `email`,
DROP COLUMN `Telèfon`,
DROP COLUMN `Adreça`,
DROP COLUMN `NomClient`,
DROP COLUMN `idClient`,
ADD COLUMN `Client_id` INT(11) NOT NULL AUTO_INCREMENT FIRST,
ADD COLUMN `Client_NomCognom` VARCHAR(45) NOT NULL AFTER `Client_id`,
ADD COLUMN `Client_Adreça` VARCHAR(60) NOT NULL AFTER `Client_NomCognom`,
ADD COLUMN `Client_Telèfon` INT(11) NOT NULL AFTER `Client_Adreça`,
ADD COLUMN `Client_email` VARCHAR(45) NOT NULL AFTER `Client_Telèfon`,
ADD COLUMN `Client_DataRegistre` DATE NOT NULL AFTER `Client_email`,
ADD COLUMN `Client_RecomanatPer` VARCHAR(45) NULL DEFAULT NULL AFTER `Client_DataRegistre`,
ADD COLUMN `Adreça_Adreça_id` INT(11) NOT NULL AFTER `Client_RecomanatPer`,
ADD COLUMN `Adreça_Clients_Client_id` INT(11) NOT NULL AFTER `Adreça_Adreça_id`,
ADD COLUMN `Adreça_Proveïdors_Proveïdor_id` INT(11) NOT NULL AFTER `Adreça_Clients_Client_id`,
ADD COLUMN `Adreça_Proveïdors_Proveïdor_Adreça` VARCHAR(45) CHARACTER SET 'utf8mb4' NOT NULL AFTER `Adreça_Proveïdors_Proveïdor_id`,
DROP PRIMARY KEY,
ADD PRIMARY KEY (`Client_id`),
ADD INDEX `fk_Clients_Adreça1_idx` (`Adreça_Adreça_id` ASC, `Adreça_Clients_Client_id` ASC, `Adreça_Proveïdors_Proveïdor_id` ASC, `Adreça_Proveïdors_Proveïdor_Adreça` ASC, `Client_id` ASC) VISIBLE;
;

ALTER TABLE `Cul d´Ampolla`.`Vendes` 
DROP COLUMN `idUlleres`,
DROP COLUMN `idVenedor`,
DROP COLUMN `idClient`,
DROP COLUMN `idVendes`,
ADD COLUMN `Vendes_id` INT(11) NOT NULL AUTO_INCREMENT FIRST,
ADD COLUMN `Client_id` INT(11) NOT NULL AFTER `Vendes_id`,
ADD COLUMN `Treballador/a_id` INT(11) NOT NULL AFTER `Marca`,
ADD COLUMN `Proveidor_id` INT(11) NOT NULL AFTER `Treballador/a_id`,
ADD COLUMN `Clients_Client_id` INT(11) NOT NULL AFTER `Proveidor_id`,
ADD COLUMN `Clients_Client_id1` INT(11) NOT NULL AFTER `Clients_Client_id`,
ADD COLUMN `Treballadors_Treballador/a_id` INT(11) NOT NULL AFTER `Clients_Client_id1`,
ADD COLUMN `Treballadors_Adreça_Adreça_id1` INT(11) NOT NULL AFTER `Treballadors_Treballador/a_id`,
ADD COLUMN `Treballadors_Adreça_Clients_Client_id` INT(11) NOT NULL AFTER `Treballadors_Adreça_Adreça_id1`,
ADD COLUMN `Treballadors_Adreça_Proveïdors_Proveïdor_id` INT(11) NOT NULL AFTER `Treballadors_Adreça_Clients_Client_id`,
ADD COLUMN `Treballadors_Adreça_Proveïdors_Proveïdor_Adreça` VARCHAR(45) CHARACTER SET 'utf8mb4' NOT NULL AFTER `Treballadors_Adreça_Proveïdors_Proveïdor_id`,
DROP PRIMARY KEY,
ADD PRIMARY KEY (`Vendes_id`, `Client_id`, `Proveidor_id`, `Treballador/a_id`),
ADD INDEX `fk_Vendes_Clients2_idx` (`Clients_Client_id1` ASC) VISIBLE,
ADD INDEX `fk_Vendes_Treballadors2_idx` (`Treballadors_Treballador/a_id` ASC, `Treballadors_Adreça_Adreça_id1` ASC, `Treballadors_Adreça_Clients_Client_id` ASC, `Treballadors_Adreça_Proveïdors_Proveïdor_id` ASC, `Treballadors_Adreça_Proveïdors_Proveïdor_Adreça` ASC) VISIBLE;
;

ALTER TABLE `Cul d´Ampolla`.`Proveïdors` 
CHANGE COLUMN `Proveïdor_Adreça` `Proveïdor_Adreça` VARCHAR(45) CHARACTER SET 'utf8mb4' NOT NULL COMMENT 'Carrer, número, pis, porta, ciutat, CP, país.' ;

ALTER TABLE `Cul d´Ampolla`.`Ulleres` 
ADD COLUMN `Ulleres_id` INT(11) NOT NULL AUTO_INCREMENT FIRST,
ADD COLUMN `Vendes_Vendes_id` INT(11) NOT NULL AFTER `Preu`,
ADD COLUMN `Vendes_Client_id` INT(11) NOT NULL AFTER `Vendes_Vendes_id`,
ADD COLUMN `Vendes_Proveidor_id` INT(11) NOT NULL AFTER `Vendes_Client_id`,
ADD COLUMN `Vendes_Treballador/a_id` INT(11) NOT NULL AFTER `Vendes_Proveidor_id`,
ADD COLUMN `Proveïdors_Proveïdor_id1` INT(11) NOT NULL AFTER `Vendes_Treballador/a_id`,
ADD COLUMN `Proveïdors_Ulleres_id` INT(11) NOT NULL AFTER `Proveïdors_Proveïdor_id1`,
ADD COLUMN `Proveïdors_Proveïdor_Adreça` VARCHAR(45) CHARACTER SET 'utf8mb4' NOT NULL AFTER `Proveïdors_Ulleres_id`,
CHANGE COLUMN `TipusMontura` `TipusMontura` VARCHAR(45) NOT NULL COMMENT 'Flotant, pasta o metàl·lica.\n' ,
DROP PRIMARY KEY,
ADD PRIMARY KEY (`Ulleres_id`);
;

ALTER TABLE `Cul d´Ampolla`.`Adreça` 
CHANGE COLUMN `Proveïdors_Proveïdor_Adreça` `Proveïdors_Proveïdor_Adreça` VARCHAR(45) CHARACTER SET 'utf8mb4' NOT NULL ,
CHANGE COLUMN `Proveïdors_Proveïdor_Adreça1` `Proveïdors_Proveïdor_Adreça1` VARCHAR(45) CHARACTER SET 'utf8mb4' NOT NULL ;

ALTER TABLE `Cul d´Ampolla`.`Treballadors` 
CHANGE COLUMN `Adreça_Proveïdors_Proveïdor_Adreça` `Adreça_Proveïdors_Proveïdor_Adreça` VARCHAR(45) CHARACTER SET 'utf8mb4' NOT NULL ,
CHANGE COLUMN `Adreça_Proveïdors_Proveïdor_Adreça1` `Adreça_Proveïdors_Proveïdor_Adreça1` VARCHAR(45) CHARACTER SET 'utf8mb4' NOT NULL ;

ALTER TABLE `Cul d´Ampolla`.`Clients` 
ADD CONSTRAINT `fk_Clients_Adreça1`
  FOREIGN KEY (`Adreça_Adreça_id` , `Adreça_Clients_Client_id` , `Adreça_Proveïdors_Proveïdor_id` , `Adreça_Proveïdors_Proveïdor_Adreça` , `Client_id`)
  REFERENCES `Cul d´Ampolla`.`Adreça` (`Adreça_id` , `Clients_Client_id` , `Proveïdors_Proveïdor_id` , `Proveïdors_Proveïdor_Adreça` , `Adreça_id`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;

ALTER TABLE `Cul d´Ampolla`.`Vendes` 
ADD CONSTRAINT `fk_Vendes_Clients2`
  FOREIGN KEY (`Clients_Client_id1`)
  REFERENCES `Cul d´Ampolla`.`Clients` (`Client_id`)
  ON DELETE CASCADE
  ON UPDATE CASCADE,
ADD CONSTRAINT `fk_Vendes_Treballadors2`
  FOREIGN KEY (`Treballadors_Treballador/a_id` , `Treballadors_Adreça_Adreça_id1` , `Treballadors_Adreça_Clients_Client_id` , `Treballadors_Adreça_Proveïdors_Proveïdor_id` , `Treballadors_Adreça_Proveïdors_Proveïdor_Adreça`)
  REFERENCES `Cul d´Ampolla`.`Treballadors` (`Treballador/a_id` , `Adreça_Adreça_id1` , `Adreça_Clients_Client_id` , `Adreça_Proveïdors_Proveïdor_id` , `Adreça_Proveïdors_Proveïdor_Adreça`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;

ALTER TABLE `Cul d´Ampolla`.`Ulleres` 
ADD CONSTRAINT `fk_Ulleres_Vendes1`
  FOREIGN KEY (`Ulleres_id`)
  REFERENCES `Cul d´Ampolla`.`Vendes` (`Vendes_id`)
  ON DELETE CASCADE
  ON UPDATE CASCADE,
ADD CONSTRAINT `fk_Ulleres_Proveïdors2`
  FOREIGN KEY (`Ulleres_id`)
  REFERENCES `Cul d´Ampolla`.`Proveïdors` (`Proveïdor_id`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;

ALTER TABLE `Cul d´Ampolla`.`Adreça` 
ADD CONSTRAINT `fk_Adreça_Proveïdors2`
  FOREIGN KEY (`Proveïdors_Proveïdor_id1` , `Proveïdors_Ulleres_id` , `Proveïdors_Proveïdor_Adreça1`)
  REFERENCES `Cul d´Ampolla`.`Proveïdors` (`Proveïdor_id` , `Ulleres_id` , `Proveïdor_Adreça`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;

ALTER TABLE `Cul d´Ampolla`.`Treballadors` 
ADD CONSTRAINT `fk_Treballadors_Adreça1`
  FOREIGN KEY (`Adreça_Adreça_id` , `Adreça_Clients_Client_id1` , `Adreça_Proveïdors_Proveïdor_id1` , `Adreça_Proveïdors_Proveïdor_Adreça1`)
  REFERENCES `Cul d´Ampolla`.`Adreça` (`Adreça_id` , `Clients_Client_id` , `Proveïdors_Proveïdor_id` , `Proveïdors_Proveïdor_Adreça`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
