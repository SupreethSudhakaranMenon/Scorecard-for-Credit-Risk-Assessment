CREATE DATABASE  IF NOT EXISTS `springbootdb` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `springbootdb`;

-- Table structure for table `product`


DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `version` varchar(512) CHARACTER SET utf8 DEFAULT NULL,
  `characteristic` varchar(512) CHARACTER SET utf8 DEFAULT NULL, 
  `value` varchar(20) DEFAULT NULL,
  `data` varchar(20) DEFAULT NULL,
  `category` varchar(20) DEFAULT NULL,
  /*`product_id` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,*/
  PRIMARY KEY (`id`)
) 


CREATE TABLE `configuration` (
	`id` int(11) NOT NULL AUTO_INCREMENT,
	`version` varchar(512) CHARACTER SET utf8 DEFAULT NULL,
	`product` varchar(20) DEFAULT NULL,
	`colour` varchar(20) DEFAULT NULL,
	`category` varchar(20) DEFAULT NULL,
	`characteristic` varchar(20) DEFAULT NULL,
	`fromrange` varchar(20) DEFAULT NULL,
	`torange` varchar(20) DEFAULT NULL,
	`value` varchar(20) DEFAULT NULL,
	PRIMARY KEY (`id`)	
)



CREATE TABLE `criteria` (
	`id` int(11) NOT NULL AUTO_INCREMENT,
	`version` varchar(512) CHARACTER SET utf8 DEFAULT NULL,
	`datasource` varchar(20) DEFAULT NULL,
	`sqlapi` varchar(512) DEFAULT NULL,
	`dummykey` varchar(20) DEFAULT NULL,
	`statistical` char(1) NOT NULL,
	PRIMARY KEY (`id`)
)



CREATE TABLE `scorecard` (
	`id` int(11) NOT NULL AUTO_INCREMENT,
	`version` varchar(512) CHARACTER SET utf8 DEFAULT NULL,
	`loanid` int(11) NOT NULL,
	`model` varchar(20) DEFAULT NULL,
	PRIMARY KEY(`id`)
)


CREATE TABLE `c_feature` (
	`id` int(11) NOT NULL,
	`version` varchar(512) CHARACTER SET utf8 DEFAULT NULL,
	`characteristic` varchar(20) DEFAULT NULL,
	`value` varchar(20) DEFAULT NULL,
	`data` varchar(20) DEFAULT NULL,
	`category` varchar(20) DEFAULT NULL,
	PRIMARY KEY(`id`)
)


