-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: bitirmeprojesi
-- ------------------------------------------------------
-- Server version	8.0.21

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
-- Table structure for table `banka_calisanlari`
--

DROP TABLE IF EXISTS `banka_calisanlari`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `banka_calisanlari` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ad_soyad` varchar(255) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `calistigi_banka` int NOT NULL,
  `calistigi_departman` int NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `banka_calisanlari_email_uindex` (`email`),
  KEY `calistigi_banka` (`calistigi_banka`),
  KEY `calistigi_departman` (`calistigi_departman`),
  CONSTRAINT `banka_calisanlari_ibfk_1` FOREIGN KEY (`calistigi_banka`) REFERENCES `bankalar` (`id`),
  CONSTRAINT `banka_calisanlari_ibfk_2` FOREIGN KEY (`calistigi_departman`) REFERENCES `banka_kategorileri` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banka_calisanlari`
--

LOCK TABLES `banka_calisanlari` WRITE;
/*!40000 ALTER TABLE `banka_calisanlari` DISABLE KEYS */;
INSERT INTO `banka_calisanlari` VALUES (16,'Sultan Elibol','sultanelibol@calisan.com','se123',7,2),(19,'Nur Elibol','nurelibol@calisan.com','ne123',5,1),(20,'Ahmet Elibol','ahmetelibol@calisan.com','ae123',6,3),(21,'Veli Elibol','velielibol@calisan.com','ve123',8,4),(22,'Ali Elibol','alielibol@calisan.com','ae123',9,5);
/*!40000 ALTER TABLE `banka_calisanlari` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `banka_calisanlari_cevaplari`
--

DROP TABLE IF EXISTS `banka_calisanlari_cevaplari`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `banka_calisanlari_cevaplari` (
  `id` int NOT NULL AUTO_INCREMENT,
  `banka_calisani_id` int NOT NULL,
  `sikayet_id` int NOT NULL,
  `mesaj` varchar(4000) NOT NULL,
  `cevap_tarihi` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `banka_calisani_id` (`banka_calisani_id`),
  KEY `sikayet_id` (`sikayet_id`),
  CONSTRAINT `banka_calisanlari_cevaplari_ibfk_1` FOREIGN KEY (`banka_calisani_id`) REFERENCES `banka_calisanlari` (`id`),
  CONSTRAINT `banka_calisanlari_cevaplari_ibfk_2` FOREIGN KEY (`sikayet_id`) REFERENCES `sikayetler` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banka_calisanlari_cevaplari`
--

LOCK TABLES `banka_calisanlari_cevaplari` WRITE;
/*!40000 ALTER TABLE `banka_calisanlari_cevaplari` DISABLE KEYS */;
INSERT INTO `banka_calisanlari_cevaplari` VALUES (7,19,18,'Değerli Müşterimiz,\n \nWeb uygulamasında paylaştığınız şikayetiniz Bankamıza ulaşmış olup, en kısa sürede tarafınıza bilgi verilecektir. \nSaygılarımızla,\n\nA Bank','2020-08-27 16:38:23'),(8,19,10,'Değerli Müşterimiz,\n \nWeb uygulamasında paylaştığınız şikayetiniz Bankamıza ulaşmış olup, en kısa sürede tarafınıza bilgi verilecektir. \nSaygılarımızla,\n\nA Bank','2020-08-31 12:03:58');
/*!40000 ALTER TABLE `banka_calisanlari_cevaplari` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `banka_kategorileri`
--

DROP TABLE IF EXISTS `banka_kategorileri`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `banka_kategorileri` (
  `id` int NOT NULL AUTO_INCREMENT,
  `kategori_adi` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `kategori_adi_UNIQUE` (`kategori_adi`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banka_kategorileri`
--

LOCK TABLES `banka_kategorileri` WRITE;
/*!40000 ALTER TABLE `banka_kategorileri` DISABLE KEYS */;
INSERT INTO `banka_kategorileri` VALUES (1,'Bankamatik'),(2,'Hesap'),(3,'Kredi'),(4,'Kredi Kartı'),(5,'Müşteri Hizmetleri');
/*!40000 ALTER TABLE `banka_kategorileri` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bankalar`
--

DROP TABLE IF EXISTS `bankalar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bankalar` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ad` varchar(255) NOT NULL,
  `mevcut_sikayet` int NOT NULL,
  `cozulen_sikayet` int NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ad_UNIQUE` (`ad`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bankalar`
--

LOCK TABLES `bankalar` WRITE;
/*!40000 ALTER TABLE `bankalar` DISABLE KEYS */;
INSERT INTO `bankalar` VALUES (5,'A Bank',3,2),(6,'B Bank',1,0),(7,'C Bank',1,0),(8,'D Bank',2,1),(9,'E Bank',1,0);
/*!40000 ALTER TABLE `bankalar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kullanici_cevaplari`
--

DROP TABLE IF EXISTS `kullanici_cevaplari`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kullanici_cevaplari` (
  `id` int NOT NULL AUTO_INCREMENT,
  `kullanici_id` int NOT NULL,
  `sikayet_id` int NOT NULL,
  `mesaj` varchar(4000) NOT NULL,
  `cevap_tarihi` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `kullanici_id` (`kullanici_id`),
  KEY `sikayet_id` (`sikayet_id`),
  CONSTRAINT `kullanici_cevaplari_ibfk_1` FOREIGN KEY (`kullanici_id`) REFERENCES `kullanicilar` (`id`),
  CONSTRAINT `kullanici_cevaplari_ibfk_2` FOREIGN KEY (`sikayet_id`) REFERENCES `sikayetler` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kullanici_cevaplari`
--

LOCK TABLES `kullanici_cevaplari` WRITE;
/*!40000 ALTER TABLE `kullanici_cevaplari` DISABLE KEYS */;
INSERT INTO `kullanici_cevaplari` VALUES (13,8,18,'Aynı sorunu ben de yaşıyorum, geçen ay ben de şikayette bulundum fakat dönüş yapan olmadı. Lütfen dönüş yapın....','2020-08-27 16:34:04'),(14,9,10,'Aynı sorunu ben de yaşıyorum, geçen ay ben de şikayette bulundum fakat dönüş yapan olmadı. Lütfen dönüş yapın....','2020-08-31 12:01:37');
/*!40000 ALTER TABLE `kullanici_cevaplari` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kullanicilar`
--

DROP TABLE IF EXISTS `kullanicilar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kullanicilar` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ad_soyad` varchar(255) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kullanicilar`
--

LOCK TABLES `kullanicilar` WRITE;
/*!40000 ALTER TABLE `kullanicilar` DISABLE KEYS */;
INSERT INTO `kullanicilar` VALUES (1,'Nur Sultan Bolel','nsb@mail.com','123'),(2,'Ahmet Bolel','ahmet@mail.com','123'),(8,'Veli Elibol','velielibol@mail.com','veli123'),(9,'Fatma ABC','fatmaabc@mail.com','fatma123');
/*!40000 ALTER TABLE `kullanicilar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sikayetler`
--

DROP TABLE IF EXISTS `sikayetler`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sikayetler` (
  `id` int NOT NULL AUTO_INCREMENT,
  `sikayeti_yapan_kisi` int NOT NULL,
  `banka_id` int NOT NULL,
  `sikayet_basligi` varchar(255) NOT NULL,
  `sikayet_telefon_no` varchar(11) NOT NULL,
  `sikayet_icerigi` varchar(4000) NOT NULL,
  `sikayet_tarihi` datetime NOT NULL,
  `sikayet_kategorisi` int NOT NULL,
  `is_solved` bit(1) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `sikayeti_yapan_kisi` (`sikayeti_yapan_kisi`),
  KEY `banka_id` (`banka_id`),
  KEY `sikayet_kategorisi` (`sikayet_kategorisi`),
  CONSTRAINT `sikayetler_ibfk_1` FOREIGN KEY (`sikayeti_yapan_kisi`) REFERENCES `kullanicilar` (`id`),
  CONSTRAINT `sikayetler_ibfk_2` FOREIGN KEY (`banka_id`) REFERENCES `bankalar` (`id`),
  CONSTRAINT `sikayetler_ibfk_3` FOREIGN KEY (`sikayet_kategorisi`) REFERENCES `banka_kategorileri` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sikayetler`
--

LOCK TABLES `sikayetler` WRITE;
/*!40000 ALTER TABLE `sikayetler` DISABLE KEYS */;
INSERT INTO `sikayetler` VALUES (10,1,5,'kredi onayım cok gecikti','5336669922','19 gün önce pandemi ihtiyaç kredisine başvurdum. Henüz bir bilgilendirme yapılmadı. Bu paraya çok ihtiyacım var, Lütfen yardımcı olun. Arkadaşım başvurdu bir buçuk ay sonra onaylandı. Bankaya da gidemiyoruz virüsten dolayı. Kredi başvurum neden bu kadar gecikti.','2020-08-27 15:46:33',3,_binary '\0'),(11,1,6,'Para iadem hala gelmedi','5236235623','Geri iade ettiğim ürünün para iadesi hala yapılmadı. 15 gündür paramın iadesini bekliyorum. Bana 7 ila 10 iş günü içerisinde paranın hesabımda olacağı söylendi fakat herhangi bir işlem yok.','2020-08-27 15:47:46',2,_binary '\0'),(13,1,7,'18 yaş altı sorunu','5336669922','16 yaşındayım ve velimle Genç Hesap açmak istiyorum. Velimle Şubeye gittiğimizde 18 yaş altı kişiler için şubede işlem açamayacaklarını söylediler. \nİnternet şubesinden yapmamızı önerdiler fakat internet şubesi üzerinden 18 yaş altı işlem yapılamıyor. Genç Hesap açmak için her yolu denedim fakat bankanın hataları yüzünden bir türlü ne müşteri temsilcisine ulaşabildim ne de başvuru için bir internet sayfası bulabildim.','2020-08-27 16:13:36',2,_binary '\0'),(15,8,8,'kredi yapılandırma sorunu','5121235645','Bankanızdan 08.2019 da 20 bin tl ihtiyaç kredisi çektim şimdi yapılandırmak istiyorum fakat red cevabı alıyorum. Şimdiye kadar kredi ödemelerimi hep düzenli şekilde yaptım. bir daha kredi verelim onu kapatalım vs deniliyor bir daha kredi çekmek istemiyorum ödememin azalmasını istiyorum lütfen ilgilenir misiniz?','2020-08-27 16:20:33',3,_binary ''),(16,8,9,'E bankası ATM\'si para üstünü vermedi','5236235623','Hafta sonu E bankasına ait olan bankamatikten kartsız işlemler adımından şans oyunu ödemesi yaptım. 110 TL aktarıp 5 TL komisyon şeklinde işlem gerçekleşecek olup en az 150 TL yatırmam gerektiğini yazdı. Ben de bankamatikde yazdığı şekilde 150 TL yatırdım. İşlemim öncesinde bankamatik ekranında para üstü ünitesinin bozuk olduğuna dair bir uyarıda bulunmamasına rağmen dekont fotosunda para ünitesinin bozuk olduğu ve en yakın şubeden alabileceğime dair açıklama bulunuyor. Hafta sonu bu banka bana büyük bir zaman kaybı yaşattı. Beni her bakımdan mağdur eden bu bankadan şikayetçiyim.','2020-08-27 16:21:45',1,_binary '\0'),(17,8,8,'Yıllık Kart Aidatı','5336669922','Yıllık kart aidatı altında 104 TL ücretlendirme yapılmış. Bununla ilgili bankayı aradığımda iade yapamadılar bende 085020***** numarayı arayarak sıkıntımı dile getirdim fakat bana yasal bir işlem olduğu söylendi. Sonuç olarak para iadesi talep etmekte bizim yasal hakkımız kartımı faal olarak kullanıyorum ve düzenli ödemelerin var, kart aidatının iadesiyle ilgili müşteri temsilcisi S**hanım hiç yardımcı olmadı sanki bir insanla değil de robotla konuşuyordum. Bende kendilerine ilettim eğer iade yapılmazsa kartımı ve hesabımı kapatacağımı söyledim. Umarım ilgilenen biri çıkar.','2020-08-27 16:22:45',4,_binary '\0'),(18,2,5,'Kullanmadığım Bir Kredi İçin Faiz Ödemesi Yaptım İade İstiyorum','5236235623','27/07/2020 tarihinde bankanız tarafıma 30.000 TL’lik kredi teklifinde bulundu. Kredi çekmek istemediğimi, çekecek olursam da aileme danışmam gerektiğini arayan arkadaşınıza defalarca belirttim. Kendisi krediyi hesabınıza yatırabiliriz, aynı gün hatta 1 ay içerisinde cayma yapabileceğimi söyledi (faizi söyledi ancak tutarını belirtmedi). Faiz yaptırımı olmaması için krediyi çektiğim günün akşamı internet bankacılığından cayma işlemi yaptım. Ertesi gün tekrar bankanızla X numarası ile irtibata geçtim. Kredimin cayma işlemi yapıldığını Merkez Bankasına onaya gönderildiğini ve onay geldiğinde kapamanın yapılacağı bilgisini aldım ve bu süreçte faiz yaptırımının olmayacağı konusunda görüştüğüm kişiyle teyit ettim. \r\n27/08/2020 tarihinde hesabımdaki bakiyenin düşmediğini fark ettim ve tekrar bankanızla irtibata geçtim. Kullanmadığım bir krediyle ilgili işletilen faizi tarafımca kabul etmiyor ve yaşadığım bu durumun etik olmadığını düşünüyorum. Ben üstüme düşeni zaten yapmış ve bankanızı defalarca aramışım. Bir an önce yaptığım faiz ödemesinin iadesini istiyorum. ','2020-08-27 16:29:03',3,_binary '\0');
/*!40000 ALTER TABLE `sikayetler` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-31 12:56:51
