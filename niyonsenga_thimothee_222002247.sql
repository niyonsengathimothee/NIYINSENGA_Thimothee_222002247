-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 19, 2024 at 09:15 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hostel_reservation_management_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `customer_id` int(7) NOT NULL,
  `fname` varchar(18) NOT NULL,
  `lname` varchar(18) NOT NULL,
  `email` varchar(35) NOT NULL,
  `telephone` varchar(15) NOT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customer_id`, `fname`, `lname`, `email`, `telephone`, `password`) VALUES
(1, '', '', '', '', NULL),
(2, '', '', '', '', NULL),
(3, 'fname', 'lname', 'email', 'telephone', NULL),
(4, 'fname', 'lname', 'email', 'telephone', NULL),
(5, 'fname', 'lname', 'email', 'telephone', NULL),
(6, 'fname', 'lname', 'telephone', 'email@gmail', NULL),
(7, 'Alise', 'Rukundo', 'email@gmail', 'telephone', NULL),
(8, 'alice', 'rukundo', '0787205393', 'fgh', NULL),
(9, 'Alise', 'Rukundo', 'email@gmail', 'telephone', NULL),
(10, '', '', '', '', NULL),
(11, 'Alise', 'Rukundo', 'email@gmail', 'telephone', NULL),
(12, '656', '', '', '', NULL),
(13, 'jeanpierre', 'mutaba', '089', 'jh@gmail.com', NULL),
(14, '', '', '', '', NULL),
(15, 'alice', 'uwase', '0787205393', 'alice@gmail.com', NULL),
(16, 'thimothee', 'niyonsenga', '0787205393', 'niyo@gmail.com', NULL),
(17, '', '', '', '', NULL),
(18, 'SDFGHJK', 'SDFGHJ', '234567', '123456789', NULL),
(19, 'ASDFGHJ', 'SDFG', '12345678', 'SDFGHJ', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `payment_id` int(7) NOT NULL,
  `Paymentmethod` varchar(18) NOT NULL,
  `Paymentamount` varchar(21) NOT NULL,
  `Paymentstatus` varchar(15) NOT NULL,
  `Paymentdate` varchar(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`payment_id`, `Paymentmethod`, `Paymentamount`, `Paymentstatus`, `Paymentdate`) VALUES
(35, 'Credit Card', '250.00', 'Paid', '2024-02-18'),
(36, 'Cash', '150.00', 'Paid', '2024-02-19'),
(37, 'Debit Card', '200.00', 'Pending', '2024-02-20'),
(38, 'PayPal', '180.00', 'Paid', '2024-02-21'),
(39, 'Bank Transfer', '300.00', 'Pending', '2024-02-22'),
(40, 'credit card', '250', '12/12/2024', 'paid'),
(41, 'credit card', '250', '12/12/2024', 'paid'),
(42, 'credit card', '250', '12/12/2024', 'paid');

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

CREATE TABLE `reservation` (
  `reservation_id` int(7) NOT NULL,
  `customer_id` int(7) NOT NULL,
  `Checkindate` date NOT NULL,
  `Checkoutdate` date NOT NULL,
  `Bookingdate` date NOT NULL,
  `Totalprice` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `reservation`
--

INSERT INTO `reservation` (`reservation_id`, `customer_id`, `Checkindate`, `Checkoutdate`, `Bookingdate`, `Totalprice`) VALUES
(1, 1, '2024-02-18', '2024-02-20', '2024-02-15', 200),
(2, 4, '2024-02-19', '2024-02-21', '2024-02-16', 220),
(3, 2, '2024-02-20', '2024-02-22', '2024-02-17', 240),
(4, 4, '2024-02-21', '2024-02-23', '2024-02-18', 260),
(5, 2, '2024-02-22', '2024-02-24', '2024-02-19', 280);

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `Roomtype` varchar(18) NOT NULL,
  `Pricepernight` varchar(21) NOT NULL,
  `Description` varchar(250) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `room_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`Roomtype`, `Pricepernight`, `Description`, `customer_id`, `room_id`) VALUES
('Double', '1500.00', 'Spacious double r', 2, 1),
('Double', '150.00', 'Spacious double r', 2, 2),
('Suite', '250.00', 'Luxurious suite w', 3, 3),
('Twin', '120.00', 'Comfortable room ', 4, 4),
('Family', '200.00', 'Large family room', 5, 5);

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `staff_id` int(11) NOT NULL,
  `fname` varchar(11) NOT NULL,
  `lname` varchar(11) NOT NULL,
  `email` varchar(11) NOT NULL,
  `telephone` varchar(15) NOT NULL,
  `payment_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`staff_id`, `fname`, `lname`, `email`, `telephone`, `payment_id`) VALUES
(3459, 'John', 'Doe john', '+123456789', 'john.doe@ex', 38),
(3461, 'Michael', 'Johnson', 'michael.joh', '+1122334455', 39),
(3462, 'Emily', 'Brown', 'emily.brown', '+9988776655', 37),
(3464, 'John', 'Doe', 'john.doe@ex', '+123456789', 38),
(3465, 'Jane', 'Smith', 'jane.smith@', '+987654321', 35),
(3466, 'Michael', 'Johnson', 'michael.joh', '+1122334455', 39),
(3467, 'Emily', 'Brown', 'emily.brown', '+9988776655', 37),
(3468, 'David', 'Taylor', 'david.taylo', '+6655443322', 35),
(3469, 'John', 'Doe', 'john.doe@ex', '38', NULL),
(3470, 'alice', 'uwase', '0787205393', '1234', NULL),
(3471, '', '', '', '', NULL),
(3472, 'John', 'Doe john', '+123456789', '38', NULL),
(3473, 'Jane', 'Smith', 'jane.smith@', '35', NULL),
(3474, 'alice', 'cloude', '078987556', '1', NULL),
(3475, '', '', '', '', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customer_id`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`payment_id`);

--
-- Indexes for table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`reservation_id`),
  ADD KEY `fk_reservation_customer` (`customer_id`);

--
-- Indexes for table `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`room_id`),
  ADD KEY `fk_room_customer` (`customer_id`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`staff_id`),
  ADD KEY `fk_staff_payment` (`payment_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `customer_id` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `payment_id` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- AUTO_INCREMENT for table `reservation`
--
ALTER TABLE `reservation`
  MODIFY `reservation_id` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `room`
--
ALTER TABLE `room`
  MODIFY `room_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `staff`
--
ALTER TABLE `staff`
  MODIFY `staff_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3476;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `fk_reservation_customer` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`);

--
-- Constraints for table `room`
--
ALTER TABLE `room`
  ADD CONSTRAINT `fk_room_customer` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`);

--
-- Constraints for table `staff`
--
ALTER TABLE `staff`
  ADD CONSTRAINT `fk_staff_payment` FOREIGN KEY (`payment_id`) REFERENCES `payment` (`payment_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
