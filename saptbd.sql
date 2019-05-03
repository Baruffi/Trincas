-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: 03-Maio-2019 às 20:11
-- Versão do servidor: 5.7.24
-- versão do PHP: 7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `saptbd`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `historico`
--

DROP TABLE IF EXISTS `historico`;
CREATE TABLE IF NOT EXISTS `historico` (
  `ID_HISTORICO` int(11) NOT NULL AUTO_INCREMENT,
  `ID_USUARIO` int(11) DEFAULT NULL,
  `ID_MATERIAL` int(11) DEFAULT NULL,
  `DATA_HISTORICO` date DEFAULT NULL,
  `HORA_HISTORICO` time DEFAULT NULL,
  PRIMARY KEY (`ID_HISTORICO`),
  KEY `ID_USUARIO` (`ID_USUARIO`),
  KEY `ID_MATERIAL` (`ID_MATERIAL`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `material`
--

DROP TABLE IF EXISTS `material`;
CREATE TABLE IF NOT EXISTS `material` (
  `ID_MATERIAL` int(11) NOT NULL AUTO_INCREMENT,
  `NOME` varchar(40) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `KCRITICO` double NOT NULL,
  `C` double NOT NULL,
  `N` double NOT NULL,
  `ESPESSURA` double NOT NULL,
  PRIMARY KEY (`ID_MATERIAL`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `material`
--

INSERT INTO `material` (`ID_MATERIAL`, `NOME`, `KCRITICO`, `C`, `N`, `ESPESSURA`) VALUES
(1, 'Material_teste1', 35.5, 0.22, 3, 0.75);

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `ID_USUARIO` int(11) NOT NULL AUTO_INCREMENT,
  `NOME` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `LOGIN` varchar(15) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `SENHA` varchar(15) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `FORMACAO` varchar(250) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`ID_USUARIO`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`ID_USUARIO`, `NOME`, `LOGIN`, `SENHA`, `FORMACAO`) VALUES
(1, 'Aluno', '1', '1', NULL);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
