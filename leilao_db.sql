-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 13-Jul-2023 às 16:23
-- Versão do servidor: 10.1.9-MariaDB
-- PHP Version: 5.5.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `leilao_db`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `lance`
--

CREATE TABLE `lance` (
  `id` int(11) NOT NULL,
  `leilao_id` int(11) NOT NULL,
  `participante_id` int(11) NOT NULL,
  `valor` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `lance`
--

INSERT INTO `lance` (`id`, `leilao_id`, `participante_id`, `valor`) VALUES
(5, 8, 5, '4000.00'),
(6, 8, 7, '60000.00'),
(7, 9, 6, '40000.00'),
(8, 9, 10, '60000.00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `leilao`
--

CREATE TABLE `leilao` (
  `id` int(11) NOT NULL,
  `veiculo_id` int(11) NOT NULL,
  `encerrado` tinyint(1) NOT NULL,
  `vencedor_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `leilao`
--

INSERT INTO `leilao` (`id`, `veiculo_id`, `encerrado`, `vencedor_id`) VALUES
(7, 8, 0, NULL),
(8, 9, 1, 7),
(9, 10, 1, 10);

-- --------------------------------------------------------

--
-- Estrutura da tabela `participante`
--

CREATE TABLE `participante` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `pass` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `participante`
--

INSERT INTO `participante` (`id`, `nome`, `email`, `pass`) VALUES
(5, 'Marta', 'mmm', '111'),
(6, 'Miguel Simao', 'aaa', '111'),
(7, 'molde', 'jjj', 'jjj'),
(8, 'gilherme', 'ggg', 'ggg'),
(9, 'Deni', 'd@gmail.com', 'ddd'),
(10, 'Helder ', 'hhh', '111');

-- --------------------------------------------------------

--
-- Estrutura da tabela `veiculo`
--

CREATE TABLE `veiculo` (
  `id` int(11) NOT NULL,
  `marca` varchar(255) NOT NULL,
  `modelo` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `veiculo`
--

INSERT INTO `veiculo` (`id`, `marca`, `modelo`) VALUES
(5, 'Toyota', 'Corrola'),
(6, 'Toyota', 'Rav4'),
(7, 'Toyota', 'Suzuki'),
(8, 'BlablaBla', 'Elantra'),
(9, 'SGgdrgdgdrj', 'ASFfxdddfgfd'),
(10, 'ertyrytytrererertyertyer', '45455656tyghghfg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `lance`
--
ALTER TABLE `lance`
  ADD PRIMARY KEY (`id`),
  ADD KEY `leilao_id` (`leilao_id`),
  ADD KEY `participante_id` (`participante_id`);

--
-- Indexes for table `leilao`
--
ALTER TABLE `leilao`
  ADD PRIMARY KEY (`id`),
  ADD KEY `veiculo_id` (`veiculo_id`),
  ADD KEY `vencedor_id` (`vencedor_id`);

--
-- Indexes for table `participante`
--
ALTER TABLE `participante`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `veiculo`
--
ALTER TABLE `veiculo`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `lance`
--
ALTER TABLE `lance`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `leilao`
--
ALTER TABLE `leilao`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `participante`
--
ALTER TABLE `participante`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `veiculo`
--
ALTER TABLE `veiculo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `lance`
--
ALTER TABLE `lance`
  ADD CONSTRAINT `lance_ibfk_1` FOREIGN KEY (`leilao_id`) REFERENCES `leilao` (`id`),
  ADD CONSTRAINT `lance_ibfk_2` FOREIGN KEY (`participante_id`) REFERENCES `participante` (`id`);

--
-- Limitadores para a tabela `leilao`
--
ALTER TABLE `leilao`
  ADD CONSTRAINT `leilao_ibfk_1` FOREIGN KEY (`veiculo_id`) REFERENCES `veiculo` (`id`),
  ADD CONSTRAINT `leilao_ibfk_2` FOREIGN KEY (`vencedor_id`) REFERENCES `participante` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
