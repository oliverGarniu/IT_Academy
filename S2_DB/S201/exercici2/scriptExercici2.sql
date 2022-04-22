-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Pizzeria
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Pizzeria
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Pizzeria` DEFAULT CHARACTER SET utf8 ;
USE `Pizzeria` ;

-- -----------------------------------------------------
-- Table `Pizzeria`.`Província`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`Província` (
  `Província_id` INT NOT NULL AUTO_INCREMENT,
  `Província_Nom` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Província_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Localitat`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`Localitat` (
  `Localitat_id` INT NOT NULL AUTO_INCREMENT,
  `Localitat_Nom` VARCHAR(45) NOT NULL,
  `Província_Província_id` INT NOT NULL,
  PRIMARY KEY (`Localitat_id`),
  INDEX `fk_Localitat_Província_idx` (`Província_Província_id` ASC),
  CONSTRAINT `fk_Localitat_Província`
    FOREIGN KEY (`Província_Província_id`)
    REFERENCES `Pizzeria`.`Província` (`Província_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Client`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`Client` (
  `Client_id` INT NOT NULL AUTO_INCREMENT,
  `Client_Nom` VARCHAR(45) NOT NULL,
  `Client_Cognoms` VARCHAR(45) NOT NULL,
  `Client_Adreça` VARCHAR(45) NOT NULL,
  `Client_CP` INT NOT NULL,
  `Client_Telèfon` INT NOT NULL,
  `Localitat_Localitat_id` VARCHAR(45) NOT NULL,
  `Província_Província_id` INT NOT NULL,
  PRIMARY KEY (`Client_id`),
  CONSTRAINT `fk_Client_Localitat1`
    FOREIGN KEY (`Client_id`)
    REFERENCES `Pizzeria`.`Localitat` (`Localitat_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Client_Província1`
    FOREIGN KEY (`Client_id`)
    REFERENCES `Pizzeria`.`Província` (`Província_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Botiga`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`Botiga` (
  `Botiga_id` INT NOT NULL AUTO_INCREMENT,
  `Botiga_Adreça` VARCHAR(45) NOT NULL,
  `Botiga_CP` INT NOT NULL,
  `Botiga_Provincia` VARCHAR(45) NOT NULL,
  `Botiga_Localitat` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Botiga_id`),
  CONSTRAINT `Botiga_Província`
    FOREIGN KEY (`Botiga_id`)
    REFERENCES `Pizzeria`.`Província` (`Província_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `Botiga_Localitat`
    FOREIGN KEY (`Botiga_id`)
    REFERENCES `Pizzeria`.`Localitat` (`Localitat_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Comanda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`Comanda` (
  `Comanda_id` INT NOT NULL AUTO_INCREMENT,
  `Comanda_DataHora` DATETIME NOT NULL,
  `Comanda_BotigaDomicili` VARCHAR(45) NOT NULL COMMENT 'En cas de tractar-se d´una comanda de repartiment a domicili cal indicar el repartidor i data/hora del moment del lliurament.',
  `Comanda_QuantitatProductes` VARCHAR(60) NOT NULL COMMENT 'Unitats de cada tipus de producte (pizzas, hamburgueses, begudes).',
  `Comanda_PreuTotal` DOUBLE NOT NULL,
  `Client_Client_id` INT NOT NULL,
  `Botiga_Botiga_id` INT NOT NULL,
  `Repartidor_id` VARCHAR(45) NULL,
  `DataHora_EntregaDomicili` DATETIME NULL,
  PRIMARY KEY (`Comanda_id`),
  INDEX `fk_Comanda_Client1_idx` (`Client_Client_id` ASC),
  INDEX `fk_Comanda_Botiga1_idx` (`Botiga_Botiga_id` ASC),
  CONSTRAINT `fk_Comanda_Client1`
    FOREIGN KEY (`Client_Client_id`)
    REFERENCES `Pizzeria`.`Client` (`Client_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Comanda_Botiga1`
    FOREIGN KEY (`Botiga_Botiga_id`)
    REFERENCES `Pizzeria`.`Botiga` (`Botiga_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Productes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`Productes` (
  `Comanda_Comanda_id` INT NOT NULL,
  INDEX `fk_Productes_Comanda1_idx` (`Comanda_Comanda_id` ASC),
  CONSTRAINT `fk_Productes_Comanda1`
    FOREIGN KEY (`Comanda_Comanda_id`)
    REFERENCES `Pizzeria`.`Comanda` (`Comanda_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Categories`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`Categories` (
  `Categories_id` INT NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`Categories_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Pizzes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`Pizzes` (
  `Pizzes_id` INT NOT NULL AUTO_INCREMENT,
  `Pizzes_Nom` VARCHAR(45) NOT NULL,
  `Pizzes_Descripció` VARCHAR(45) NOT NULL,
  `Pizzes_Imatge` BLOB NOT NULL,
  `Pizzes_Preu` DOUBLE NOT NULL,
  `Categories_Categories_id` INT NOT NULL,
  PRIMARY KEY (`Pizzes_id`),
  INDEX `fk_Pizzes_Categories1_idx` (`Categories_Categories_id` ASC),
  CONSTRAINT `Pizzes`
    FOREIGN KEY (`Pizzes_id`)
    REFERENCES `Pizzeria`.`Productes` (`Comanda_Comanda_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Pizzes_Categories1`
    FOREIGN KEY (`Categories_Categories_id`)
    REFERENCES `Pizzeria`.`Categories` (`Categories_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Hamburgueses`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`Hamburgueses` (
  `Hamburgueses_id` INT NOT NULL AUTO_INCREMENT,
  `Hamburgueses_Nom` VARCHAR(45) NOT NULL,
  `Hamburgueses_Descripció` VARCHAR(45) NOT NULL,
  `Hamburgueses_Imatge` BLOB NOT NULL,
  `Hamburgueses_Preu` INT NOT NULL,
  `Hamburgueses_Hamburgueses_id` INT NOT NULL,
  PRIMARY KEY (`Hamburgueses_id`),
  CONSTRAINT `fk_Hamburgueses_Hamburgueses1`
    FOREIGN KEY (`Hamburgueses_id`)
    REFERENCES `Pizzeria`.`Productes` (`Comanda_Comanda_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Begudes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`Begudes` (
  `Begudes_id` INT NOT NULL AUTO_INCREMENT,
  `Begudes_Nom` VARCHAR(45) NOT NULL,
  `Begudes_Descripció` VARCHAR(45) NOT NULL,
  `Begudes_Imatge` BLOB NOT NULL,
  `Begudes_Preu` DOUBLE NOT NULL,
  PRIMARY KEY (`Begudes_id`),
  CONSTRAINT `Begudes`
    FOREIGN KEY (`Begudes_id`)
    REFERENCES `Pizzeria`.`Productes` (`Comanda_Comanda_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Categoria1`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`Categoria1` (
  `Categoria1_id` INT NOT NULL AUTO_INCREMENT,
  `Categoria1_Nom` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Categoria1_id`),
  CONSTRAINT `Categoria1`
    FOREIGN KEY (`Categoria1_id`)
    REFERENCES `Pizzeria`.`Categories` (`Categories_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Categoria2`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`Categoria2` (
  `Categoria2_id` INT NOT NULL AUTO_INCREMENT,
  `Categoria2_Nom` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Categoria2_id`),
  CONSTRAINT `Categoria_2`
    FOREIGN KEY (`Categoria2_id`)
    REFERENCES `Pizzeria`.`Categories` (`Categories_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Categoria3`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`Categoria3` (
  `Categoria3_id` INT NOT NULL AUTO_INCREMENT,
  `Categoria3_Nom` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Categoria3_id`),
  CONSTRAINT `Categoria_3`
    FOREIGN KEY (`Categoria3_id`)
    REFERENCES `Pizzeria`.`Categories` (`Categories_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Empleats`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`Empleats` (
  `Empleats_id` INT NOT NULL AUTO_INCREMENT,
  `Empleats_Nom` VARCHAR(45) NOT NULL,
  `Empleats_Cognoms` VARCHAR(45) NOT NULL,
  `Empleats_NIF` VARCHAR(20) NOT NULL,
  `Empleats_Telèfon` INT NOT NULL,
  `Empleats_CuinerRepartidor` VARCHAR(45) NOT NULL COMMENT 'Cal indicar si es tracta d´un cuiner o d´un repartidor.',
  `Botiga_Botiga_id` INT NOT NULL,
  PRIMARY KEY (`Empleats_id`),
  INDEX `fk_Empleats_Botiga1_idx` (`Botiga_Botiga_id` ASC),
  CONSTRAINT `fk_Empleats_Botiga1`
    FOREIGN KEY (`Botiga_Botiga_id`)
    REFERENCES `Pizzeria`.`Botiga` (`Botiga_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
