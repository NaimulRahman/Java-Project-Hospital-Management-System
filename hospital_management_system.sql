-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 21, 2019 at 07:53 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital_management_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `doctors`
--

CREATE TABLE `doctors` (
  `dId` varchar(6) NOT NULL,
  `dName` varchar(30) NOT NULL,
  `dMobileNo` varchar(12) NOT NULL,
  `dSalary` varchar(12) NOT NULL,
  `specialization` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctors`
--

INSERT INTO `doctors` (`dId`, `dName`, `dMobileNo`, `dSalary`, `specialization`) VALUES
('0003', 'Joy', '015656363', '45000', 'Cardiologist'),
('001', 'Aman', '01567666', '50000', 'cardialogist'),
('004', 'Nazmul', '01545465', '40000', 'Neurologist'),
('11', 'Jubair', '017647337', '2000', 'nephrologist'),
('12', 'ABc', '06767', '457788', 'medicine'),
('d00010', 'Nabil', '171000000', '300000', 'Medicine');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `userId` varchar(6) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`userId`, `password`) VALUES
('aman', '1234'),
('anam', '1234'),
('joy', '1234'),
('naimul', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `patients`
--

CREATE TABLE `patients` (
  `date` varchar(10) NOT NULL,
  `pId` varchar(10) NOT NULL,
  `pName` varchar(10) NOT NULL,
  `pAge` varchar(10) NOT NULL,
  `pGender` varchar(20) NOT NULL,
  `appointment` varchar(20) NOT NULL,
  `payment` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patients`
--

INSERT INTO `patients` (`date`, `pId`, `pName`, `pAge`, `pGender`, `appointment`, `payment`) VALUES
('4/8/2019', '001', 'Nabil', '21', 'male', 'Neurologist', '2000'),
('4/8/2019', '002', 'aman', '20', 'male', 'medicine', '2000'),
('3/6/2019', '007', 'Naim', '21', 'male', 'medicine', '2000'),
('5/8/2109', '008', 'Akram', '21', 'male', 'Neurologist', '2000'),
('3/8/2019', '009', 'Joy', '17', 'male', 'medicine', '200'),
('20/8/2019', '10', 'zayan', '20', 'male', 'neurologist', '2000'),
('4/8/2019', '11', 'Jubair', '20', 'male', 'medicine', '2000');

-- --------------------------------------------------------

--
-- Table structure for table `staffmembers`
--

CREATE TABLE `staffmembers` (
  `sid` varchar(10) NOT NULL,
  `sName` varchar(10) NOT NULL,
  `sMobileNo` varchar(20) NOT NULL,
  `sSalary` varchar(10) NOT NULL,
  `jobTitle` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staffmembers`
--

INSERT INTO `staffmembers` (`sid`, `sName`, `sMobileNo`, `sSalary`, `jobTitle`) VALUES
('0003', 'Shopnil', '0172462747', '20000', 'Wardboy'),
('001', 'Aman', '0177677677', '20000', 'Staff'),
('002', 'Nabil', '01965675667', '20000', 'Receptionist'),
('004', 'Runa', '0156737566', '250000', 'Nurse'),
('Jubair', '11', '017663644', '20000', 'Wardboy');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `doctors`
--
ALTER TABLE `doctors`
  ADD PRIMARY KEY (`dId`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`userId`);

--
-- Indexes for table `patients`
--
ALTER TABLE `patients`
  ADD PRIMARY KEY (`pId`);

--
-- Indexes for table `staffmembers`
--
ALTER TABLE `staffmembers`
  ADD PRIMARY KEY (`sid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
