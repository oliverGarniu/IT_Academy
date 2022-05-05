CREATE TABLE IF NOT EXISTS `JocDeDaus`.`jugadors` (
  `jugador_id` INT NOT NULL AUTO_INCREMENT,
  `date` DATE NULL DEFAULT NULL,
  `jugador_name` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`jugador_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 8
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_spanish_ci






CREATE TABLE IF NOT EXISTS `JocDeDaus`.`partides` (
  `partida_id` INT NOT NULL AUTO_INCREMENT,
  `dau_1` INT NULL DEFAULT NULL,
  `dau_2` INT NULL DEFAULT NULL,
  `winner` BIT(1) NOT NULL,
  `jugador_id` INT NULL DEFAULT NULL,
  PRIMARY KEY (`partida_id`),
  INDEX `FKnhknwcpi075iujt1dl3f6wawg` (`jugador_id` ASC) VISIBLE,
  CONSTRAINT `FKnhknwcpi075iujt1dl3f6wawg`
    FOREIGN KEY (`jugador_id`)
    REFERENCES `JocDeDaus`.`jugadors` (`jugador_id`)
    ON DELETE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 54
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_spanish_ci




