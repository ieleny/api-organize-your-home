CREATE TABLE IF NOT EXISTS `material` (
  `id_material` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(100) NOT NULL,
  `quantity_bought` float(12,0) DEFAULT NULL,
  `price_und` int(11) DEFAULT 0,
  `inclusion_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_material`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
