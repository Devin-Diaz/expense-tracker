CREATE DATABASE IF NOT EXISTS `ecom`;
USE `ecom`;

DROP TABLE IF EXISTS `tbl-expenses`;

CREATE TABLE `tbl-expenses`
(
	`id` BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `amount` DECIMAL(19, 2) NOT NULL,
    `created_at` BIGINT(20) NOT NULL,
    `description` VARCHAR(255) NOT NULL,
    `note` VARCHAR(255)
);

INSERT INTO tbl_expenses(`amount`, `created_at`, `description`, `note`)
	VALUES(200.99, UNIX_TIMESTAMP(), "Monitor", "Lenovo 25in monitor");
    
INSERT INTO tbl_expenses(`amount`, `created_at`, `description`, `note`)
	VALUES(599.99, UNIX_TIMESTAMP(), "Tablet", "iPad Air")

