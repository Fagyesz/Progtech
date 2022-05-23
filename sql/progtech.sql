-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 23, 2022 at 06:25 AM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `progtech`
--

-- --------------------------------------------------------

--
-- Table structure for table `names`
--

CREATE TABLE `names` (
  `id` int(11) NOT NULL,
  `name` varchar(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `names`
--

INSERT INTO `names` (`id`, `name`) VALUES
(1, '0'),
(2, '0'),
(3, '0'),
(4, 'bob'),
(5, 'Lorem'),
(6, 'Nero');

-- --------------------------------------------------------

--
-- Table structure for table `saves`
--

CREATE TABLE `saves` (
  `id` int(11) NOT NULL,
  `save` varchar(512) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `saves`
--

INSERT INTO `saves` (`id`, `save`) VALUES
(2, 'GVRBkfQJMyzx0hjMWfOvwAsVkuO27vrphv9pWXNdcsASqDN4yptphQPFu5rPGuU6Jofh1MkDXjuWdI4TJJL26CySZ1sgZhAdRA5LA1lMobhDeHCtJgHlb5zrLIcW08HE4AA4ijL9exqnWTzjR2eAcxfMtstEq9IMmUsA6TCBXP5ne9fztxvr8vKjZ0Q9s9UnJEmQRK1naPE9zzfYP4sxdxXrtUvBj1aKnHyQwBsEy0ZHA0npSandtpU8J2nHWAG1o6kk1iT3uKrBI8L0BpoJGdOWiLgJ2GZhXUOvLNYkKUM4AzWZCzFM7EW4Vb6wsIt5WX1RiRQAYCTnU2lLm5OCoLveqmbAoWX4ZE8qHRyv3rKq4hJQSpqXOhkWihnkkmVqVUCbreQL7GRry9neQuOUCQa619yeejVjOc1tgUFo7HILp3N9NTHmu3VQmYKbX6n0i70vVfGmgTMtUv601LRFti7YHZXnhRTrT6LjhPImL02pUk1xRkOy98pgVFSqmnIx'),
(3, '7Vm8EBr8bpo8MzrihJLY8ii3Rk2AwS6Mz9c3aetbKBZgcjnX7FUDQ0wKoA24ubCA6YuYttBwvac1Sk5q8bis7LknG3KYou0QhKcGKGQ3Glmi6rNsGKY3naXqoFctNgGz74t16Y27dsbDxcn2wUNtFZwziy14YbiBER2RDfWINorohXgICN6QMdaiK9lOo9SVDtoCua89wJyS1S8iteqRggTbAqdMzJHx4gW9LPfQViRLGifN9udRRc3XmUatJa885qPHTkcOgKElYL5Qy4EjesuWh1ICNZCuH2ClKwcsCl5mQ9BuxdnUzGnBAPi7t4JYkCmSG4RmEyPHVAdaUeOPYTHtob4sLuWUw9FLizf1hN4BS7ZoOKCEsnzH26uJm1AlGsF4eOzjw4LTLny4QICFc92FGgptU8EdB30jdgPcgERIoKTeZRWcKj1s2ewylSzoMucQF79bxqGuKxidC0qnE9Tnhynpk2pKpadJZ1iQu3LdTLOocnscJYjYWGpXTwyv'),
(4, 'R1ByXzXRFTZG1zQvQT3DwBfUshghE1lcU49vncpo6sYwk58HRXJGEJU2tmB41mUSFE1SuK5GX59oJrC7orfn2KdkZLJNkn7sU7RclGDsFRsevRLNo57QaxdEF9rkApFn4ltTVODBLNYXIgoOXN9yK1pGilN6y1F2Yd2T7KXiF9BRKauKngSWNDzuZtLrYzxd540jBvYYhehWIqM2L5dZFT4mWBhI6aOqdGBA3RZO2fL88dMs25VieVvWKZfOrzFnLrx3AhvldHFvoTSMm2u7TX4B8B75McY4B0wounbbJY9f7CSzna01AlTA1IPElEGFUejDMoNioIgXBGuSxBh8zwWtP5aBmmstPWQdDDgxLcWTWqXL6hZXLPh7xq3lEstpF4GIK2187YLdEzsYZdn6ihMh6HeRhCnqFswxnnHZ0hefy0d6CByS7gXUABUYJjD5SU5SlmaAq3m954smhJNe5bY1Z7WHlh3Da1MsoDD4dXuSl1ZtLDnLPjQURNuyeoZA'),
(8, '..................................................................W................................................................WW........................................................................................................................................................................................................................................................D.................................D.............................D..................................................................'),
(9, '...............................................................................................................................................................................................................................................................................................................................................................W..............................................................W...........................................................D.DWWW...........................DWWDW');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(128) NOT NULL,
  `password` varchar(128) NOT NULL,
  `role` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `names`
--
ALTER TABLE `names`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `saves`
--
ALTER TABLE `saves`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `names`
--
ALTER TABLE `names`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `saves`
--
ALTER TABLE `saves`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
