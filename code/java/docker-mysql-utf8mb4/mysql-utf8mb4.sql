
CREATE TABLE `test_e` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `e` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
SELECT * FROM `jzb-ka`.test_e;

INSERT INTO test_e  (id, e)  VALUES  ( 1, "\xF0\x9F\x90\xB0\xF0\x9F" );