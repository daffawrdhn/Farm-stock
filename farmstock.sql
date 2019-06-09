-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 09 Jun 2019 pada 17.53
-- Versi server: 10.1.36-MariaDB
-- Versi PHP: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `farmstock`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `detailbarang`
--

CREATE TABLE `detailbarang` (
  `id_detailbarang` int(11) NOT NULL,
  `id_brg` int(11) NOT NULL,
  `id_wh` int(11) NOT NULL,
  `jml_brg` int(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `detailbarang`
--

INSERT INTO `detailbarang` (`id_detailbarang`, `id_brg`, `id_wh`, `jml_brg`) VALUES
(1, 1, 2, 200),
(2, 1, 3, 12900),
(3, 3, 3, 200),
(5, 2, 3, 20000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `distribute`
--

CREATE TABLE `distribute` (
  `id_distribute` int(11) NOT NULL,
  `id_brg` int(11) NOT NULL,
  `id_wh` int(11) NOT NULL,
  `id_penerima` int(11) NOT NULL,
  `sum_goods` int(16) NOT NULL,
  `tgl_distribute` date NOT NULL,
  `keterangan` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `distribute`
--

INSERT INTO `distribute` (`id_distribute`, `id_brg`, `id_wh`, `id_penerima`, `sum_goods`, `tgl_distribute`, `keterangan`) VALUES
(2, 1, 3, 1, 100, '2019-06-08', 'Keterangan'),
(3, 1, 3, 1, 200, '2019-06-09', 'Keterangan');

-- --------------------------------------------------------

--
-- Struktur dari tabel `goods`
--

CREATE TABLE `goods` (
  `id_brg` int(11) NOT NULL,
  `kode_brg` varchar(5) NOT NULL,
  `nama_brg` varchar(255) NOT NULL,
  `berat_brg` int(13) NOT NULL,
  `jenis_brg` varchar(255) NOT NULL,
  `id_supp` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `goods`
--

INSERT INTO `goods` (`id_brg`, `kode_brg`, `nama_brg`, `berat_brg`, `jenis_brg`, `id_supp`) VALUES
(1, 'Kp001', 'Kopi Arabica 256', 2, 'Kopi', 2),
(2, 'Th001', 'Teh Hijau Super', 1, 'Teh', 4),
(3, 'kp002', 'Kopi Robusta 12', 3, 'Kopi', 2);

-- --------------------------------------------------------

--
-- Struktur dari tabel `loaded`
--

CREATE TABLE `loaded` (
  `id_load` int(11) NOT NULL,
  `id_brg` int(11) NOT NULL,
  `id_wh` int(11) NOT NULL,
  `jml_brg` int(16) NOT NULL,
  `tgl_load` date NOT NULL,
  `keterangan` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `loaded`
--

INSERT INTO `loaded` (`id_load`, `id_brg`, `id_wh`, `jml_brg`, `tgl_load`, `keterangan`) VALUES
(2, 1, 2, 200, '2019-06-07', 'Keterangan'),
(3, 1, 3, 200, '2019-06-08', 'Keterangan'),
(4, 3, 3, 200, '2019-06-08', 'Keterangan'),
(5, 1, 3, 1000, '2019-06-08', 'Keterangan'),
(6, 1, 3, 2000, '2019-06-08', 'Keterangan'),
(7, 1, 3, 10000, '2019-06-09', 'Keterangan'),
(8, 2, 3, 20000, '2019-06-09', 'Keterangan');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penerima`
--

CREATE TABLE `penerima` (
  `id_penerima` int(11) NOT NULL,
  `nama_penerima` varchar(255) NOT NULL,
  `almt_penerima` varchar(255) NOT NULL,
  `notlp_penerima` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `penerima`
--

INSERT INTO `penerima` (`id_penerima`, `nama_penerima`, `almt_penerima`, `notlp_penerima`) VALUES
(1, 'CV Baru jaya', 'Jl panjaitan no 32 Malang', '086574434234');

-- --------------------------------------------------------

--
-- Struktur dari tabel `suppliers`
--

CREATE TABLE `suppliers` (
  `id_supp` int(11) NOT NULL,
  `kode_supp` varchar(5) NOT NULL,
  `nama_supp` varchar(255) NOT NULL,
  `almt_supp` varchar(255) NOT NULL,
  `notlp` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `suppliers`
--

INSERT INTO `suppliers` (`id_supp`, `kode_supp`, `nama_supp`, `almt_supp`, `notlp`) VALUES
(2, 'pk002', 'Kebun kopi Mayang', 'Jl Panjaitan 2 Mayang, Jember', '081134987675'),
(3, 'pk003', 'Kebun Jaya Malik ', 'Jl jaya malik no 34 Jember', '089798654321'),
(4, 'pk001', 'Kebun Teh Semeru', 'Jl Mangga no 2 Sumberjambe', '089765453321'),
(5, 'pk004', 'Kebun coklat Puslit', 'Jl PB Sudirman no 26 Jember', '0331456743776');

-- --------------------------------------------------------

--
-- Struktur dari tabel `users`
--

CREATE TABLE `users` (
  `id_user` int(11) NOT NULL,
  `username` varchar(16) NOT NULL,
  `password` varchar(16) NOT NULL,
  `status` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `users`
--

INSERT INTO `users` (`id_user`, `username`, `password`, `status`) VALUES
(1, 'admin', 'admin', 2);

-- --------------------------------------------------------

--
-- Struktur dari tabel `warehouse`
--

CREATE TABLE `warehouse` (
  `id_wh` int(11) NOT NULL,
  `kode_wh` varchar(5) NOT NULL,
  `nama_wh` varchar(255) NOT NULL,
  `kapasitas_wh` int(16) NOT NULL,
  `kapasitas_ava` int(16) NOT NULL,
  `almt_wh` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `warehouse`
--

INSERT INTO `warehouse` (`id_wh`, `kode_wh`, `nama_wh`, `kapasitas_wh`, `kapasitas_ava`, `almt_wh`) VALUES
(1, 'wh001', 'Warehouse Jember 1', 1500000, 1500000, 'Jl Panjaitan no 4 Jember'),
(2, 'wh002', 'Warehouse Jember 2', 2000000, 1999800, 'Jl Sumatra no 21 Ajung, Jember'),
(3, 'wh003', 'Warehouse Jember 3', 1000000, 966900, 'Jl Mantan no 99 Sumberjambe Jember');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `detailbarang`
--
ALTER TABLE `detailbarang`
  ADD PRIMARY KEY (`id_detailbarang`),
  ADD KEY `id_brg` (`id_brg`),
  ADD KEY `id_wh` (`id_wh`);

--
-- Indeks untuk tabel `distribute`
--
ALTER TABLE `distribute`
  ADD PRIMARY KEY (`id_distribute`),
  ADD KEY `id_brg` (`id_brg`),
  ADD KEY `id_wh` (`id_wh`),
  ADD KEY `id_penerima` (`id_penerima`);

--
-- Indeks untuk tabel `goods`
--
ALTER TABLE `goods`
  ADD PRIMARY KEY (`id_brg`),
  ADD KEY `id_supp` (`id_supp`);

--
-- Indeks untuk tabel `loaded`
--
ALTER TABLE `loaded`
  ADD PRIMARY KEY (`id_load`),
  ADD KEY `id_brg` (`id_brg`),
  ADD KEY `id_wh` (`id_wh`);

--
-- Indeks untuk tabel `penerima`
--
ALTER TABLE `penerima`
  ADD PRIMARY KEY (`id_penerima`);

--
-- Indeks untuk tabel `suppliers`
--
ALTER TABLE `suppliers`
  ADD PRIMARY KEY (`id_supp`);

--
-- Indeks untuk tabel `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id_user`);

--
-- Indeks untuk tabel `warehouse`
--
ALTER TABLE `warehouse`
  ADD PRIMARY KEY (`id_wh`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `detailbarang`
--
ALTER TABLE `detailbarang`
  MODIFY `id_detailbarang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT untuk tabel `distribute`
--
ALTER TABLE `distribute`
  MODIFY `id_distribute` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `goods`
--
ALTER TABLE `goods`
  MODIFY `id_brg` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `loaded`
--
ALTER TABLE `loaded`
  MODIFY `id_load` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT untuk tabel `penerima`
--
ALTER TABLE `penerima`
  MODIFY `id_penerima` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT untuk tabel `suppliers`
--
ALTER TABLE `suppliers`
  MODIFY `id_supp` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT untuk tabel `users`
--
ALTER TABLE `users`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT untuk tabel `warehouse`
--
ALTER TABLE `warehouse`
  MODIFY `id_wh` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `detailbarang`
--
ALTER TABLE `detailbarang`
  ADD CONSTRAINT `detailbarang_ibfk_1` FOREIGN KEY (`id_wh`) REFERENCES `warehouse` (`id_wh`),
  ADD CONSTRAINT `detailbarang_ibfk_2` FOREIGN KEY (`id_brg`) REFERENCES `goods` (`id_brg`);

--
-- Ketidakleluasaan untuk tabel `distribute`
--
ALTER TABLE `distribute`
  ADD CONSTRAINT `distribute_ibfk_1` FOREIGN KEY (`id_wh`) REFERENCES `warehouse` (`id_wh`),
  ADD CONSTRAINT `distribute_ibfk_2` FOREIGN KEY (`id_penerima`) REFERENCES `penerima` (`id_penerima`),
  ADD CONSTRAINT `distribute_ibfk_3` FOREIGN KEY (`id_brg`) REFERENCES `goods` (`id_brg`);

--
-- Ketidakleluasaan untuk tabel `goods`
--
ALTER TABLE `goods`
  ADD CONSTRAINT `goods_ibfk_1` FOREIGN KEY (`id_supp`) REFERENCES `suppliers` (`id_supp`);

--
-- Ketidakleluasaan untuk tabel `loaded`
--
ALTER TABLE `loaded`
  ADD CONSTRAINT `loaded_ibfk_1` FOREIGN KEY (`id_wh`) REFERENCES `warehouse` (`id_wh`),
  ADD CONSTRAINT `loaded_ibfk_2` FOREIGN KEY (`id_brg`) REFERENCES `goods` (`id_brg`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
