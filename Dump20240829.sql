-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: bdhotel
-- ------------------------------------------------------
-- Server version	8.0.39

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `habitacion`
--

DROP TABLE IF EXISTS `habitacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `habitacion` (
  `numero` int NOT NULL,
  `piso` int DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `num_person` int DEFAULT NULL,
  `valor` float DEFAULT NULL,
  PRIMARY KEY (`numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `habitacion`
--

LOCK TABLES `habitacion` WRITE;
/*!40000 ALTER TABLE `habitacion` DISABLE KEYS */;
INSERT INTO `habitacion` VALUES (101,1,'SENCILLA',1,50000),(102,1,'DOBLE',2,100000),(103,1,'SENCILLA',1,50000),(104,1,'DOBLE',2,100000),(105,1,'SENCILLA',1,50000),(201,2,'SENCILLA',1,70000),(202,2,'DOBLE',2,120000),(203,2,'SENCILLA',1,70000),(204,2,'DOBLE',2,120000),(205,2,'SENCILLA',1,70000),(301,3,'SENCILLA',1,90000),(302,3,'DOBLE',2,140000),(303,3,'SENCILLA',1,90000),(304,3,'DOBLE',2,140000),(305,3,'SENCILLA',1,90000);
/*!40000 ALTER TABLE `habitacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registro`
--

DROP TABLE IF EXISTS `registro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `registro` (
  `idregistro` int NOT NULL,
  `tiporegistro` varchar(45) NOT NULL,
  `valortotal` decimal(10,0) NOT NULL,
  `valorabono` decimal(10,0) NOT NULL,
  `nombrecontacto` varchar(45) NOT NULL,
  `telefonocontacto` bigint NOT NULL,
  `habitacion` int NOT NULL,
  `estado` varchar(45) NOT NULL,
  `fecha_inicial` datetime NOT NULL,
  `fecha_final` datetime NOT NULL,
  `fecha_cancel` datetime DEFAULT NULL,
  `fecha_checkout` datetime DEFAULT NULL,
  PRIMARY KEY (`idregistro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registro`
--

LOCK TABLES `registro` WRITE;
/*!40000 ALTER TABLE `registro` DISABLE KEYS */;
INSERT INTO `registro` VALUES (1,'CHECKIN',30000,10000,'fernando',21232425,101,'CHECKOUT','2024-08-19 00:00:00','2024-08-22 00:00:00',NULL,'2024-08-19 00:00:00'),(2,'RESERVA',80000,40000,'maria',232323,101,'CANCELADO','2024-08-23 00:00:00','2024-08-31 00:00:00','2024-08-29 00:00:00',NULL),(3,'CHECKIN',480000,240000,'iguana',22333233,102,'CHECKOUT','2024-08-19 00:00:00','2024-08-31 00:00:00',NULL,'2024-08-21 00:00:00'),(4,'CHECKIN',120000,60000,'jose',3048922532,102,'CHECKOUT','2024-08-22 00:00:00','2024-08-25 00:00:00',NULL,'2024-08-22 00:00:00'),(5,'RESERVA',80000,30000,'antonio',3256892345,102,'RESERVADO','2024-08-29 00:00:00','2024-08-31 00:00:00',NULL,NULL),(6,'RESERVA',560000,200000,'nesticor',9101112,201,'RESERVADO','2024-12-24 00:00:00','2025-01-01 00:00:00',NULL,NULL),(7,'CHECKIN',250000,50000,'julian',32323,103,'CHECKOUT','2024-08-26 00:00:00','2024-08-31 00:00:00',NULL,'2024-08-26 00:00:00'),(8,'CHECKIN',1000000,10000,'jose',2323211,104,'CHECKOUT','2024-08-26 00:00:00','2024-08-31 00:00:00',NULL,'2024-08-29 00:00:00'),(9,'CHECKIN',100000,40000,'jose',1232323,103,'OCUPADO','2024-08-29 00:00:00','2024-08-31 00:00:00',NULL,NULL);
/*!40000 ALTER TABLE `registro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registro_huesped`
--

DROP TABLE IF EXISTS `registro_huesped`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `registro_huesped` (
  `idregistro` int NOT NULL,
  `identificacion` bigint NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `telefono` bigint DEFAULT NULL,
  PRIMARY KEY (`idregistro`,`identificacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registro_huesped`
--

LOCK TABLES `registro_huesped` WRITE;
/*!40000 ALTER TABLE `registro_huesped` DISABLE KEYS */;
INSERT INTO `registro_huesped` VALUES (0,2112345,'fernando',21232425),(1,24252628,'maria',232323),(2,1232323,'iguana',22333233),(3,11232111134,'jose',3048922532),(4,111233322,'antonio',3256892345),(5,12345678,'nesticor',9101112),(6,1212121,'julian',32323),(7,12132323,'jose',2323211),(8,232323,'jose',1232323);
/*!40000 ALTER TABLE `registro_huesped` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `usuario` varchar(8) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `correo` varchar(45) DEFAULT NULL,
  `telefono` int DEFAULT NULL,
  PRIMARY KEY (`usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES ('diego','123','juan diego','julassom@unal.edu.co',12112212),('juan','123','jose','juanjo@unal.edu.co',2323232);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-08-29 10:35:34
