-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.41-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema online_book
--

CREATE DATABASE IF NOT EXISTS online_book;
USE online_book;

--
-- Definition of table `bill`
--

DROP TABLE IF EXISTS `bill`;
CREATE TABLE `bill` (
  `b_id` int(10) unsigned NOT NULL auto_increment,
  `t_name` varchar(45) NOT NULL,
  `t_phone` varchar(11) NOT NULL,
  `t_distance` varchar(45) NOT NULL,
  `waiting_time` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  PRIMARY KEY  (`b_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bill`
--

/*!40000 ALTER TABLE `bill` DISABLE KEYS */;
/*!40000 ALTER TABLE `bill` ENABLE KEYS */;


--
-- Definition of table `book`
--

DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `b_id` int(10) unsigned NOT NULL auto_increment,
  `c_city` varchar(45) NOT NULL,
  `c_car` varchar(45) NOT NULL,
  `p_location` varchar(45) NOT NULL,
  `d_location` varchar(45) NOT NULL,
  `p_date` datetime NOT NULL,
  PRIMARY KEY  USING BTREE (`b_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book`
--

/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` (`b_id`,`c_city`,`c_car`,`p_location`,`d_location`,`p_date`) VALUES 
 (1,'Dhaka','appache','Faridpur','Jessore','2018-04-14 00:00:00'),
 (2,'Magura','appache','Faridpur','Jessore','2018-04-14 00:00:00'),
 (3,'Faridpur','Corolla','Rajbari','Madaripur','2018-04-14 08:25:15'),
 (4,'Faridpur','Corolla','Rajbari','Madaripur','2018-04-14 08:25:15');
/*!40000 ALTER TABLE `book` ENABLE KEYS */;


--
-- Definition of table `category`
--

DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `cat_id` int(10) unsigned NOT NULL auto_increment,
  `choose city` varchar(45) NOT NULL,
  `max bill charge` varchar(45) NOT NULL,
  `free km` varchar(45) NOT NULL,
  `waiting charge` varchar(45) NOT NULL,
  `extra charge` varchar(45) NOT NULL,
  PRIMARY KEY  (`cat_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `category`
--

/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` (`cat_id`,`choose city`,`max bill charge`,`free km`,`waiting charge`,`extra charge`) VALUES 
 (1,'dhaka','1222','22','20','45'),
 (2,'dhaka','1222','22','20','45'),
 (3,'Dhaka','500','100','200','8'),
 (4,'Dhaka','500','100','200','8'),
 (5,'Dhaka','500','100','200','8'),
 (6,'Dhaka','500','100','200','8'),
 (7,'','','','',''),
 (8,'','','','','');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;


--
-- Definition of table `contact`
--

DROP TABLE IF EXISTS `contact`;
CREATE TABLE `contact` (
  `d_id` int(10) unsigned NOT NULL auto_increment,
  `d_name` varchar(45) NOT NULL,
  `d_phone` varchar(11) NOT NULL,
  `d_email` varchar(45) NOT NULL,
  `d_address` varchar(45) NOT NULL,
  `d_lisence` varchar(45) NOT NULL,
  PRIMARY KEY  USING BTREE (`d_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `contact`
--

/*!40000 ALTER TABLE `contact` DISABLE KEYS */;
INSERT INTO `contact` (`d_id`,`d_name`,`d_phone`,`d_email`,`d_address`,`d_lisence`) VALUES 
 (1,'aa','ass','aa','asaa',''),
 (2,'aa','ass','aa','asaa',''),
 (3,'bffg','dfgdf','gfd','gf','fdfg'),
 (4,'bffg','dfgdf','gfd','gf','fdfg'),
 (5,'','','','',''),
 (6,'','','','',''),
 (7,'Rana','01937745755','jewel.ranama92@gmail.com','Magura','1659889'),
 (8,'Rana','01937745755','jewel.ranama92@gmail.com','Magura','1659889'),
 (9,'reaj','01937745755','akash@gmail.com','8','1659889'),
 (10,'reaj','01937745755','akash@gmail.com','8','1659889');
/*!40000 ALTER TABLE `contact` ENABLE KEYS */;


--
-- Definition of table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `u_id` int(10) unsigned NOT NULL auto_increment,
  `u_username` varchar(45) NOT NULL,
  `u_pass` varchar(45) NOT NULL,
  `u_fullname` varchar(45) NOT NULL,
  `u_email` varchar(45) NOT NULL,
  PRIMARY KEY  (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`u_id`,`u_username`,`u_pass`,`u_fullname`,`u_email`) VALUES 
 (1,'admin','123','md jewel rana','jewel.ranama92@gmail.com'),
 (2,'admin','123','md jewel rana','jewel.ranama92@gmail.com'),
 (3,'abid','123','abid hasan','jewel.ranama92@gmail.com'),
 (4,'abid','123','abid hasan','jewel.ranama92@gmail.com'),
 (5,'reaj','123','reajul islam','reaj2364@gmail.com'),
 (6,'reaj','123','reajul islam','reaj2364@gmail.com'),
 (7,'Akas','','',''),
 (8,'Akas','','',''),
 (9,'Akas','123','Mahedi Akash ','akash@gmail.com'),
 (10,'Akas','123','Mahedi Akash ','akash@gmail.com'),
 (11,'','','',''),
 (12,'','','',''),
 (13,'reaj','123','abid hasan','jewel.ranama92@gmail.com'),
 (14,'reaj','123','abid hasan','jewel.ranama92@gmail.com');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
