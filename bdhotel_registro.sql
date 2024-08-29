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
INSERT INTO `registro` VALUES (1,'CHECKIN',100,1,'juan',1234,101,'CHECKOUT','2024-08-02 00:00:00','2024-08-09 00:00:00',NULL,'2024-08-02 00:00:00'),(2,'CHECKIN',500,230,'carlos',123,201,'CHECKOUT','2024-08-02 00:00:00','2024-08-09 00:00:00','2024-08-02 00:00:00','2024-08-02 00:00:00'),(3,'RESERVA',500,33,'asdjkakljd',123123,202,'CHECKOUT','2024-08-02 00:00:00','2024-08-09 00:00:00','2024-08-02 00:00:00','2024-08-02 00:00:00'),(4,'CHECKIN',500,50,'carlos',1234,202,'CHECKOUT','2024-08-02 00:00:00','2024-08-09 00:00:00',NULL,'2024-08-02 00:00:00'),(5,'RESERVA',123,123,'juan',123,123,'CANCELADO','2024-08-02 00:00:00','2024-08-09 00:00:00','2024-08-02 00:00:00',NULL),(6,'CHECKIN',500,1,'aleja',123,202,'CHECKOUT','2024-08-03 00:00:00','2024-08-09 00:00:00',NULL,'2024-08-18 00:00:00'),(7,'CHECKIN',10332,123,'carlos',123123123,123,'OCUPADO','2024-08-19 00:00:00','2024-08-26 00:00:00',NULL,NULL);
/*!40000 ALTER TABLE `registro` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-08-20 14:43:12
