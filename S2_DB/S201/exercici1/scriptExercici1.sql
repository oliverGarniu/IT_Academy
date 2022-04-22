-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Cul d´Ampolla
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Cul d´Ampolla
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Cul d´Ampolla` DEFAULT CHARACTER SET utf8 ;
USE `Cul d´Ampolla` ;

-- -----------------------------------------------------
-- Table `Cul d´Ampolla`.`Proveïdors`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Cul d´Ampolla`.`Proveïdors` (
  `Proveïdor_id` INT NOT NULL AUTO_INCREMENT,
  `Proveïdor_Nom` VARCHAR(45) NOT NULL,
  `Proveïdor_NIF` VARCHAR(45) NOT NULL,
  `Proveïdor_Adreça` VARCHAR(45) CHARACTER SET 'utf8mb4' NOT NULL COMMENT 'Carrer, número, pis, porta, ciutat, CP, país.',
  `Proveïdor_Telèfon` INT NOT NULL,
  `Proveïdor_Fax` INT NOT NULL,
  `Ulleres_id` INT NOT NULL,
  PRIMARY KEY (`Proveïdor_id`, `Ulleres_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Cul d´Ampolla`.`Adreça`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Cul d´Ampolla`.`Adreça` (
  `Adreça_id` INT NOT NULL AUTO_INCREMENT,
  `Carrer` VARCHAR(45) NOT NULL,
  `Número` INT NOT NULL,
  `Pis` INT NOT NULL,
  `Porta` INT NOT NULL,
  `Ciutat` VARCHAR(45) NOT NULL,
  `CP` VARCHAR(45) NOT NULL,
  `País` VARCHAR(45) NOT NULL,
  `Clients_Client_id` INT NOT NULL,
  `Proveïdors_Proveïdor_id` INT NOT NULL,
  `Proveïdors_Proveïdor_Adreça` VARCHAR(45) CHARACTER SET 'utf8mb4' NOT NULL,
  `Proveïdors_Proveïdor_id1` INT NOT NULL,
  `Proveïdors_Ulleres_id` INT NOT NULL,
  `Proveïdors_Proveïdor_Adreça1` VARCHAR(45) CHARACTER SET 'utf8mb4' NOT NULL,
  PRIMARY KEY (`Adreça_id`, `Clients_Client_id`, `Proveïdors_Proveïdor_id`, `Proveïdors_Proveïdor_Adreça`),
  INDEX `fk_Adreça_Proveïdors2_idx` (`Proveïdors_Proveïdor_id1` ASC, `Proveïdors_Ulleres_id` ASC, `Adreça_id` ASC),
  CONSTRAINT `fk_Adreça_Proveïdors2`
    FOREIGN KEY (`Proveïdors_Proveïdor_id1` , `Proveïdors_Ulleres_id` , `Adreça_id`)
    REFERENCES `Cul d´Ampolla`.`Proveïdors` (`Proveïdor_id` , `Ulleres_id` , `Proveïdor_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Cul d´Ampolla`.`Clients`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Cul d´Ampolla`.`Clients` (
  `Client_id` INT NOT NULL AUTO_INCREMENT,
  `Client_NomCognom` VARCHAR(45) NOT NULL,
  `Client_Adreça` VARCHAR(60) NOT NULL,
  `Client_Telèfon` INT NOT NULL,
  `Client_email` VARCHAR(45) NOT NULL,
  `Client_DataRegistre` DATE NOT NULL,
  `Client_RecomanatPer` VARCHAR(45) NULL,
  `Adreça_Adreça_id` INT NOT NULL,
  `Adreça_Clients_Client_id` INT NOT NULL,
  `Adreça_Proveïdors_Proveïdor_id` INT NOT NULL,
  `Adreça_Proveïdors_Proveïdor_Adreça` VARCHAR(45) CHARACTER SET 'utf8mb4' NOT NULL,
  PRIMARY KEY (`Client_id`),
  CONSTRAINT `fk_Clients_Adreça1`
    FOREIGN KEY (`Client_id`)
    REFERENCES `Cul d´Ampolla`.`Adreça` (`Adreça_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Cul d´Ampolla`.`Treballadors`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Cul d´Ampolla`.`Treballadors` (
  `Treballador/a_id` INT NOT NULL AUTO_INCREMENT,
  `Treballador/a_NomCognom` VARCHAR(45) NOT NULL,
  `Treballador/a_Adreça` VARCHAR(45) NOT NULL,
  `Treballador/a_Telèfon` INT NOT NULL,
  `Treballador/a_email` VARCHAR(45) NOT NULL,
  `Adreça_Adreça_id1` INT NOT NULL,
  `Adreça_Clients_Client_id` INT NOT NULL,
  `Adreça_Proveïdors_Proveïdor_id` INT NOT NULL,
  `Adreça_Proveïdors_Proveïdor_Adreça` VARCHAR(45) CHARACTER SET 'utf8mb4' NOT NULL,
  `Adreça_Adreça_id` INT NOT NULL,
  `Adreça_Clients_Client_id1` INT NOT NULL,
  `Adreça_Proveïdors_Proveïdor_id1` INT NOT NULL,
  `Adreça_Proveïdors_Proveïdor_Adreça1` VARCHAR(45) CHARACTER SET 'utf8mb4' NOT NULL,
  PRIMARY KEY (`Treballador/a_id`, `Adreça_Adreça_id1`, `Adreça_Clients_Client_id`, `Adreça_Proveïdors_Proveïdor_id`, `Adreça_Proveïdors_Proveïdor_Adreça`),
  CONSTRAINT `fk_Treballadors_Adreça1`
    FOREIGN KEY (`Treballador/a_id`)
    REFERENCES `Cul d´Ampolla`.`Adreça` (`Adreça_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Cul d´Ampolla`.`Vendes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Cul d´Ampolla`.`Vendes` (
  `Vendes_id` INT NOT NULL AUTO_INCREMENT,
  `Client_id` INT NOT NULL,
  `Marca` VARCHAR(45) NOT NULL,
  `Treballador/a_id` INT NOT NULL,
  `Proveidor_id` INT NOT NULL,
  `Clients_Client_id` INT NOT NULL,
  `Clients_Client_id1` INT NOT NULL,
  `Treballadors_Treballador/a_id` INT NOT NULL,
  `Treballadors_Adreça_Adreça_id1` INT NOT NULL,
  `Treballadors_Adreça_Clients_Client_id` INT NOT NULL,
  `Treballadors_Adreça_Proveïdors_Proveïdor_id` INT NOT NULL,
  `Treballadors_Adreça_Proveïdors_Proveïdor_Adreça` VARCHAR(45) CHARACTER SET 'utf8mb4' NOT NULL,
  PRIMARY KEY (`Vendes_id`, `Client_id`, `Proveidor_id`),
  INDEX `fk_Vendes_Treballadors2_idx` (`Treballador/a_id` ASC),
  CONSTRAINT `fk_Vendes_Clients2`
    FOREIGN KEY (`Vendes_id`)
    REFERENCES `Cul d´Ampolla`.`Clients` (`Client_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Vendes_Treballadors2`
    FOREIGN KEY (`Treballador/a_id`)
    REFERENCES `Cul d´Ampolla`.`Treballadors` (`Treballador/a_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Cul d´Ampolla`.`Ulleres`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Cul d´Ampolla`.`Ulleres` (
  `Ulleres_id` INT NOT NULL AUTO_INCREMENT,
  `Marca` VARCHAR(45) NOT NULL,
  `Graduació` DOUBLE NOT NULL,
  `TipusMontura` VARCHAR(45) NOT NULL COMMENT 'Flotant, pasta o metàl·lica.\n',
  `ColorMontura` VARCHAR(45) NOT NULL,
  `ColorVidre` VARCHAR(45) NOT NULL,
  `Preu` DOUBLE NOT NULL,
  `Vendes_Vendes_id` INT NOT NULL,
  `Vendes_Client_id` INT NOT NULL,
  `Vendes_Proveidor_id` INT NOT NULL,
  `Vendes_Treballador/a_id` INT NOT NULL,
  `Proveïdors_Proveïdor_id1` INT NOT NULL,
  `Proveïdors_Ulleres_id` INT NOT NULL,
  `Proveïdors_Proveïdor_Adreça` VARCHAR(45) CHARACTER SET 'utf8mb4' NOT NULL,
  PRIMARY KEY (`Ulleres_id`),
  CONSTRAINT `fk_Ulleres_Vendes1`
    FOREIGN KEY (`Ulleres_id`)
    REFERENCES `Cul d´Ampolla`.`Vendes` (`Vendes_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Ulleres_Proveïdors2`
    FOREIGN KEY (`Ulleres_id`)
    REFERENCES `Cul d´Ampolla`.`Proveïdors` (`Proveïdor_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Cul d´Ampolla`.`Proveidors`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Cul d´Ampolla`.`Proveidors` (
  `idProveïdor` INT(11) NOT NULL AUTO_INCREMENT,
  `NomProveïdor` VARCHAR(45) NOT NULL,
  `NIF` VARCHAR(45) NOT NULL,
  `AdreçaProveidor` VARCHAR(45) CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_0900_ai_ci' NOT NULL COMMENT 'Carrer, número, pis, porta, ciutat, CP, país.',
  `Telefon` INT(11) NOT NULL,
  `Fax` INT(11) NOT NULL,
  `idUlleres` INT(11) NOT NULL,
  PRIMARY KEY (`idProveïdor`, `idUlleres`),
  INDEX `idUlleres_idx` (`idUlleres` ASC) VISIBLE,
  CONSTRAINT `idProveidor`
    FOREIGN KEY ()
    REFERENCES `Cul d´Ampolla`.`Vendes` (),
  CONSTRAINT `idUllera`
    FOREIGN KEY ()
    REFERENCES `Cul d´Ampolla`.`Ulleres` ())
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
