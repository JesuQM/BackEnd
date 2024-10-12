-- MySQL dump 10.13  Distrib 8.0.39, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: tienda
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.32-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `equipo`
--

DROP TABLE IF EXISTS `equipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `equipo` (
  `ID_EQUIPO` int(11) NOT NULL,
  `DESCRIPCION` varchar(255) DEFAULT NULL,
  `VALOR_ESPERADO` int(11) DEFAULT NULL,
  `VALOR_MAXIMO` int(11) DEFAULT NULL,
  `VALOR_MINIMO` int(11) DEFAULT NULL,
  `TIPO_EQUIPO` int(11) NOT NULL,
  PRIMARY KEY (`ID_EQUIPO`),
  KEY `FKlhuom8xm8i2frfupob91h2pct` (`TIPO_EQUIPO`),
  CONSTRAINT `FKlhuom8xm8i2frfupob91h2pct` FOREIGN KEY (`tipo_equipo`) REFERENCES `tipo_equipo` (`tipo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipo`
--

LOCK TABLES `equipo` WRITE;
/*!40000 ALTER TABLE `equipo` DISABLE KEYS */;
INSERT INTO `equipo` VALUES (1,'MOVIMIENTO DE TIERRA',4,10,3,1),(2,'PERFORACION Y DEMOLICION',3,8,2,1),(3,'GENERACION E ILUMINACIÓN',3,8,2,1),(4,'MOTOBOMBAS',3,7,2,1),(5,'ELEVACION Y MANIPULACION DE CARGA',4,9,3,1),(6,'ENCOFRADO VERTICAL',3,5,2,2),(7,'ENCONFRADO HORIZONTAL',3,5,2,2),(8,'ANDAMIOS VERTICAL',3,5,2,3),(9,'ANDAMIOS FLOTANTES',3,5,2,3);
/*!40000 ALTER TABLE `equipo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `historial_equipo`
--

DROP TABLE IF EXISTS `historial_equipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `historial_equipo` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `EQUIPO` int(11) DEFAULT NULL,
  `FECHA_REGISTRO` datetime(6) DEFAULT NULL,
  `TIPO_EQUIPO` int(11) DEFAULT NULL,
  `VALOR_MEDIDO` int(11) DEFAULT NULL COMMENT 'Valor medido en dias',
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `histori_tipo_equipo_TIPO_fk` (`TIPO_EQUIPO`),
  KEY `historial_ID_EQUIPO_fk` (`EQUIPO`),
  CONSTRAINT `histori_tipo_equipo_TIPO_fk` FOREIGN KEY (`TIPO_EQUIPO`) REFERENCES `tipo_equipo` (`tipo`),
  CONSTRAINT `historial_ID_EQUIPO_fk` FOREIGN KEY (`EQUIPO`) REFERENCES `equipo` (`id_equipo`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historial_equipo`
--

LOCK TABLES `historial_equipo` WRITE;
/*!40000 ALTER TABLE `historial_equipo` DISABLE KEYS */;
INSERT INTO `historial_equipo` VALUES (4,1,'2024-10-03 19:00:00.000000',1,12,'MOVIMIENTO DE TIERRA'),(7,1,'2024-10-08 19:00:00.000000',1,6,'MOVIMIENTO DE TIERRA'),(8,5,'2024-10-15 19:00:00.000000',1,9,'ELEVACION Y MANIPULACION DE CARGA'),(9,2,'2024-10-16 19:00:00.000000',1,5,'PERFORACION Y DEMOLICION');
/*!40000 ALTER TABLE `historial_equipo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_equipo`
--

DROP TABLE IF EXISTS `tipo_equipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_equipo` (
  `TIPO` int(11) NOT NULL,
  `DESCRIPCION` varchar(255) NOT NULL,
  PRIMARY KEY (`TIPO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_equipo`
--

LOCK TABLES `tipo_equipo` WRITE;
/*!40000 ALTER TABLE `tipo_equipo` DISABLE KEYS */;
INSERT INTO `tipo_equipo` VALUES (1,'MAQUINARIA'),(2,'ENCOFRADOS'),(3,'ANDAMIOS');
/*!40000 ALTER TABLE `tipo_equipo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-10-12 13:12:31
