CREATE DATABASE  IF NOT EXISTS `organize_home_db` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `organize_home_db`;

CREATE TABLE IF NOT EXISTS `material` (
  `id_material` int(11) NOT NULL AUTO_INCREMENT,
  `product-name` varchar(100) NOT NULL,
  `quantity-bought` float(12,0) DEFAULT NULL,
  `price-und` int(11) DEFAULT 0,
  `inclusao` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_material`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
