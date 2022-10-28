CREATE DATABASE sistemaOS;
USE  sistemaOS;

CREATE TABLE ordemServico (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `data` DATE NOT NULL,
  `descricao` VARCHAR(255) NOT NULL,
  `cliente` VARCHAR(255) NOT NULL,
  `veiculo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`codigo`));

CREATE TABLE itemOs (
  `id` INT NOT NULL AUTO_INCREMENT,
  `codItem` VARCHAR(45) NOT NULL,
  `nomeCurto` VARCHAR(45) NOT NULL,
  `descricao` VARCHAR(255) NULL,
  `codigoOs` INT NOT NULL,
  PRIMARY KEY (`id`, `codigoOs`),
  INDEX `fk_itemOs_ordemServico_idx` (`codigoOs` ASC) VISIBLE,
  CONSTRAINT `fk_itemOs_ordemServico`
    FOREIGN KEY (`codigoOs`)
    REFERENCES ordemServico(`codigo`));
    
    INSERT INTO ordemServico values (1,01/01/2022,'revisao 10.000km','Jose Silva', 'Toyota SW4');
    INSERT INTO itemOs values (1,'lav3','lavagem grande','lavagem completa para veiculos grandes (SUV)','1');
    SELECT * FROM ORDEMSERVICO ORDER BY CODIGO;
   


