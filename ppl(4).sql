-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 05, 2017 at 03:49 AM
-- Server version: 10.1.26-MariaDB
-- PHP Version: 7.1.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ppl`
--

-- --------------------------------------------------------

--
-- Table structure for table `bebek`
--

CREATE TABLE `bebek` (
  `id_bebek` tinyint(4) NOT NULL,
  `jenis_bebek` enum('Bebek Pedaging','Bebek Petelur') NOT NULL,
  `harga_beli` int(11) NOT NULL,
  `harga_jual` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `bebek`
--

INSERT INTO `bebek` (`id_bebek`, `jenis_bebek`, `harga_beli`, `harga_jual`) VALUES
(1, 'Bebek Pedaging', 7000, 35000),
(2, 'Bebek Petelur', 8000, 40000);

-- --------------------------------------------------------

--
-- Table structure for table `gejala`
--

CREATE TABLE `gejala` (
  `id_gejala` int(11) NOT NULL,
  `nama_gejala` varchar(50) NOT NULL,
  `pertanyaan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `gejala`
--

INSERT INTO `gejala` (`id_gejala`, `nama_gejala`, `pertanyaan`) VALUES
(101, 'mata berlendir', 'apakah bebek anda sering mengeluarkan lendir.?'),
(102, 'lemah', 'apakah bebek anda terlihat lemah dan tampak selalu mengantuk.?'),
(103, 'produksi telur berkurang', 'apakah bebek anda mengalami penurunan produktivitas telur.?'),
(104, 'tubuh mengurus', 'apakah bebek anda mengalami penurunan bobot / tampak mengurus.?'),
(105, 'kulit kering', 'apakah bebek anda mengalami kulit kering.?'),
(106, 'bulu rontok', 'apakah bebek anda sering mengalami bulu rontok.?'),
(107, 'gelisah', 'apakah bebek anda tampak gelisah.?'),
(108, 'kelumpuhan', 'apakah bebek anda tidak dapat bergerak / mengalami kelumpuhan.?'),
(109, 'sesak nafas', 'apakah bebek anda terlihat mengalami sesak nafas.?'),
(110, 'pial bengkak dan panas', 'apakah bebek anda mengalami pial bengkak dan panas.?'),
(111, 'jalan sempoyongan', 'apakah bebek anda tidak bisa berjalan normal / terlihat sempoyongan.?'),
(112, 'suara nyaring', 'apakah bebek anda mengeluarkan suara yang nyaring.?'),
(113, 'kotoran yang bening', 'apakah bebek anda mengeluarkan kotoran yang bening dan bercair.?'),
(114, 'kurangnya nafsu makan', 'apakah bebek anda mengalami nafsu makan yang menurun.?'),
(115, 'berlendir', 'apakah bebek anda mengeluarkan lendir disekitar mulut / tampak pilek.?'),
(116, 'kotoran dari mata dan hidung', 'apakah bebek anda mengeluarkan kotoran dari mata dan hidung.?'),
(117, 'pembengkakan sinus', 'apakah bebek anda mengalami pembengkakan sinus.?'),
(118, 'bercak darah pada kotoran', 'apakah bebek anda mengeluarkan kotoran yang bercampur bercak darah.?');

-- --------------------------------------------------------

--
-- Table structure for table `penyakit`
--

CREATE TABLE `penyakit` (
  `id_penyakit` int(11) NOT NULL,
  `nama_penyakit` varchar(50) NOT NULL,
  `Deskripsi` text NOT NULL,
  `penanganan` text NOT NULL,
  `tingkatKematian` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `penyakit`
--

INSERT INTO `penyakit` (`id_penyakit`, `nama_penyakit`, `Deskripsi`, `penanganan`, `tingkatKematian`) VALUES
(1, 'Colera', 'Penyakit kolera pada itik disebabkan oleh bakteri Pasteurella Avicia. Kondisi Kandang yang basah dan lembab dapat mempercepat penularan.', 'Pengobatannya adalah dengan memakai Meoxy, Coliguin atau Kanamin. Kemudian suntikkan obat tersebut pada urat daging dada bebek yang disesuaikan dengan dosis yang terdpat pada label obat tersebut.', 60),
(2, 'White eye', 'Penyakit mata memutih pada bebek juga diduga disebabkan oleh virus. Penyakit ini bisa menyerang bebek pada segala umur dan yang paling rawan adalah itik umur kurang dari 2 bulan. Penyakit white eye sangat mudah menyerang pada bebek yang kekurangan vitamin A. Kondisi kandang yang lembab dan lantai  yang basah juga memudahkan bebek terserang penyakit white eye.', 'Pencegahan yang bisa dilakukan dengan memberikan antibiotika yang dapat di campurkan dalam air minum atau pakannya. ', 30),
(3, 'Rickets Duck', 'penyakit Rickets Duck merupakan penyakit yang menyerang bebek pada tulang. sehingga dapat menyebabkan bebek mengalami kelumpuhan', 'Pencegahan yang bisa dilakukan dengan memberikan makanan yang mengandung mineral, kalsium, fosfor dan vitamin D.', 20),
(4, 'Sinusitis', 'penyakit ini disebabkan oleh pemeliharaan unggas yang kurang terawat, kekurangan mineral dalam pakan, serta tidak tersedianya kolam untuk bermain', '1.Pencegahan yang bisa dilakukan dengan tata laksana pemeliharaan yang baik\r\n2.Pengobatan bagi bebek yang terserang penyakit ini bisa dengan menyuntikkan antibiotika. ', 50),
(5, 'Salmonellosis', 'Penyakit ini merupakan penyakit yang menular kepada bebek. menyerang dari segala usia sehingga rentan terhadap kematian', '1.Pencegahan yang bisa dilakukan adalah dengan menjaga kesehatan dan kebersihan.\r\n2.Sebaiknya dilakukan pembersihan kandang secara berkala agar kandang bebas dari kuman salmonella', 55),
(6, 'Coryza Bebek', 'penyakit coryza atau biasa disebut dengan pilek merupakan penyakit yang dapat menular terutama kepada bebek dewasa', 'Pencegahan yang bisa dilakukan dengan memberikan antibiotika yang dicampur dalam pakan dan minum dan bisa dengan menyuntikkan obat streptomycin sulphate. Pada anak Bebek yang berusia anakan bisa diberikan lewat minum atau makanan.', 20),
(7, 'Coccidiosis bebek', 'Coccidiosis disebut juga penyakit berak darah.Penularan Coccidiosis dapat melalui kotoran bebek yang membawa coccida dan terjadi relatif cepat pada bebek segala umur, tetapi yang banyak terserang adalah anak bebek.', 'Pencegahan yang bisa dilakukan adalah dengan memberikan obat-obatan seperti coccidiostat melalui obat yang dicampurkan dalam pakan atau minum.', 50),
(8, 'Stress', 'Penyakit Stress atau cekaman pada bebek bisa disebabkan oleh berbagai faktor pengganggu yang secara langsung mempengaruhi fisiologi tubuh bebek, misalnya suara bising, sering berpindah-pindah tempat, pertukaran pakan dan lain sebagainya.', 'Saat ini obat untuk mengatasi penyakit stress pada bebek belum ada. Kita hanya dapat menghindari segala gangguan yang dapat menimbulkan stress yaitu dengan cara memelihara lingkungan dan menjaga kebersihan lingkungan peternakan.', 10),
(9, 'Antibiotika Dermatitis', 'Penyakit ini terjadi akibat penggunaan obat-obatan yang mengandung antibiotika secara berlebihan. Sehingga menyebabkan kulit itik menjadi kering , bulu rontok dan mudah patah, itik selalu gelisah karena gatal-gatal pada kulitnya.', 'Pencegahan yang bisa dilakukan adalah dengan menggunakan antibiotika seperlunya.', 0),
(10, 'Kekurangan Vitamin A', 'Kekurangan vitamin A biasanya disebabkan pakan itik yang kurang mengandung vitamin A.\r\n\r\nPenyakit kekurangan (defisiensi) vitamin A juga karena peternak mengganti jagung kuning dengan jagung putih yang miskin vitamin A.', '1. perbanyak pemberian pakan yang mengandung vitamin A\r\n2. Memberi makan berupa jagung kuning', 30),
(11, 'Botulism', 'Penyakit Botulism pada bebek adalah penyakit yang terjadi karena bebek memakan bangkai atau daging yang sudah layu. Misalnya pemberian makanan daging bekicot yang sudah layu. Bangkai yang sudah berulat mengandung kuman Clastridium Botulinium, kuman ini sangat berbahaya karena memproduksi racun.', 'Pengobatannya adalah dengan memberi obat-obatan pencahar agar dapat meneluarkan racun dari tubuh bebek melalui kotoran bebek. Salah satu obat tradisionalnya adalah dengan memberi satu sendok minyak kelapa lalu diberi air bersih sebanyak-banyaknya.', 50),
(12, 'Penyakit Bebek Aflatokskosis', 'Penyakit ini disebabkan oleh racun jamur Aspergillus flavus. Di Indonesia jamur ini banyak terdpat pada jagung, dedak, dan pada pakar berkadar air tinggi atau kurang kering', 'Pengobatannya adalah dengan memberinya antibiotika yang dicampur pada pakan atau air minum.', 60);

-- --------------------------------------------------------

--
-- Table structure for table `record`
--

CREATE TABLE `record` (
  `idRecord` int(11) NOT NULL,
  `idUser` int(11) NOT NULL,
  `idPenyakit` int(11) NOT NULL,
  `idBebek` tinyint(11) NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `record`
--

INSERT INTO `record` (`idRecord`, `idUser`, `idPenyakit`, `idBebek`, `jumlah`) VALUES
(1, 1, 5, 1, 0),
(2, 1, 4, 2, 0),
(5, 1, 11, 1, 0),
(6, 2, 5, 1, 12),
(7, 2, 2, 1, 26),
(8, 2, 8, 1, 4),
(9, 4, 11, 1, 7),
(10, 5, 11, 2, 20),
(11, 5, 11, 1, 7),
(12, 5, 11, 1, 7),
(13, 5, 11, 1, 2),
(14, 5, 11, 1, 12),
(15, 5, 11, 1, 3),
(16, 5, 11, 1, 45),
(17, 6, 11, 1, 35);

-- --------------------------------------------------------

--
-- Table structure for table `relasi`
--

CREATE TABLE `relasi` (
  `id_penyakit` int(11) NOT NULL,
  `id_gejala` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `relasi`
--

INSERT INTO `relasi` (`id_penyakit`, `id_gejala`) VALUES
(1, 109),
(1, 110),
(1, 111),
(1, 112),
(2, 116),
(2, 109),
(2, 102),
(3, 108),
(5, 116),
(5, 113),
(7, 114),
(7, 104),
(7, 108);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `modal` int(11) NOT NULL DEFAULT '0',
  `lahan` smallint(6) NOT NULL DEFAULT '0',
  `level` tinyint(4) NOT NULL DEFAULT '1',
  `jumlahBebek` smallint(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `modal`, `lahan`, `level`, `jumlahBebek`) VALUES
(1, 'arif', '123456', 4000000, 25, 1, 100),
(2, 'epaw', 'qwerty', 15991000, 99, 1, 396),
(3, 'a', '', 0, 0, 1, 0),
(4, 'rida', '12345', 17919900, 125, 1, 500),
(5, 'irfan', '123', 15000000, 250, 1, 509),
(6, 'test', '1234', 50000000, 350, 1, 1400);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bebek`
--
ALTER TABLE `bebek`
  ADD PRIMARY KEY (`id_bebek`);

--
-- Indexes for table `gejala`
--
ALTER TABLE `gejala`
  ADD PRIMARY KEY (`id_gejala`);

--
-- Indexes for table `penyakit`
--
ALTER TABLE `penyakit`
  ADD PRIMARY KEY (`id_penyakit`);

--
-- Indexes for table `record`
--
ALTER TABLE `record`
  ADD PRIMARY KEY (`idRecord`),
  ADD KEY `idPenyakit` (`idPenyakit`),
  ADD KEY `idUser` (`idUser`),
  ADD KEY `idBebek` (`idBebek`);

--
-- Indexes for table `relasi`
--
ALTER TABLE `relasi`
  ADD KEY `id_penyakit` (`id_penyakit`),
  ADD KEY `id_gejala` (`id_gejala`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bebek`
--
ALTER TABLE `bebek`
  MODIFY `id_bebek` tinyint(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `gejala`
--
ALTER TABLE `gejala`
  MODIFY `id_gejala` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=119;
--
-- AUTO_INCREMENT for table `penyakit`
--
ALTER TABLE `penyakit`
  MODIFY `id_penyakit` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT for table `record`
--
ALTER TABLE `record`
  MODIFY `idRecord` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `record`
--
ALTER TABLE `record`
  ADD CONSTRAINT `record_ibfk_1` FOREIGN KEY (`idPenyakit`) REFERENCES `penyakit` (`id_penyakit`),
  ADD CONSTRAINT `record_ibfk_2` FOREIGN KEY (`idUser`) REFERENCES `users` (`id`),
  ADD CONSTRAINT `record_ibfk_3` FOREIGN KEY (`idBebek`) REFERENCES `bebek` (`id_bebek`);

--
-- Constraints for table `relasi`
--
ALTER TABLE `relasi`
  ADD CONSTRAINT `relasi_ibfk_2` FOREIGN KEY (`id_penyakit`) REFERENCES `penyakit` (`id_penyakit`),
  ADD CONSTRAINT `relasi_ibfk_3` FOREIGN KEY (`id_gejala`) REFERENCES `gejala` (`id_gejala`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
