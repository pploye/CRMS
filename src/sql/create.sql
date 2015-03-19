CREATE DATABASE IF NOT EXISTS `crmstest`;

USE `crmstest`;

CREATE TABLE IF NOT EXISTS `User_Role`(
	`User_Role_Code` VARCHAR(50) NOT NULL,
    `Role_Name` VARCHAR(50) NOT NULL,
    `Description` TEXT NULL,
    `Is_Trashed` BOOLEAN NULL DEFAULT FALSE,
    `Trashed_Date` DATETIME NOT NULL,
    `Is_Active` BOOLEAN NULL DEFAULT FALSE,
    `Active_Date` DATETIME NULL,
    PRIMARY KEY(`User_Role_Code`)
);

CREATE TABLE IF NOT EXISTS `User`(
	`User_Name` VARCHAR(50) NOT NULL,
    `Password` VARCHAR(50) NOT NULL,
    `Registration_Date` TIMESTAMP NOT NULL,
    `User_Role_Code` VARCHAR(50) NOT NULL,
    `Is_Trashed` BOOLEAN NULL DEFAULT FALSE,
    `Trashed_Date` DATETIME NOT NULL,
    `Is_Active` BOOLEAN NULL DEFAULT FALSE,
    `Active_Date` DATETIME NULL,
    PRIMARY KEY(`User_Name`),
    FOREIGN KEY(`User_Role_Code`) REFERENCES `User_Role`(`User_Role_Code`)
);

CREATE TABLE IF NOT EXISTS `Institution`(
	`Institution_Code` VARCHAR(50) NOT NULL,
    `Institution_Name` VARCHAR(50) NOT NULL,
    `Mission` TEXT NULL,
    `Vision` TEXT NULL,
    `Page_Name` VARCHAR(50) NOT NULL,
    `Logo_Path` VARCHAR(500) NULL,
    `Establishment_Date` DATE NOT NULL,
    `Registration_Date` TIMESTAMP NOT NULL,
    `User_Name` VARCHAR(50) NOT NULL,
    `Is_Trashed` BOOLEAN NULL DEFAULT FALSE,
    `Trashed_Date` DATETIME NOT NULL,
    `Is_Active` BOOLEAN NULL DEFAULT FALSE,
    `Active_Date` DATETIME NULL,
    PRIMARY KEY(`Institution_Code`),
    FOREIGN KEY(`User_Name`) REFERENCES `User`(`User_Name`)
);

CREATE TABLE IF NOT EXISTS `Student`(
	`Student_Code` VARCHAR(50) NOT NULL,
    `First_Name` VARCHAR(50) NOT NULL,
    `Last_Name` VARCHAR(50) NOT NULL,
    `Gender` VARCHAR(10) NOT NULL,
    `Date_Of_Birth` DATE NOT NULL,
    `Institution_Code` VARCHAR(50) NOT NULL,
    `User_Name` VARCHAR(50) NOT NULL,
    `Is_Trashed` BOOLEAN NULL DEFAULT FALSE,
    `Trashed_Date` DATETIME NOT NULL,
    `Is_Active` BOOLEAN NULL DEFAULT FALSE,
    `Active_Date` DATETIME NULL,
    PRIMARY KEY(`Student_Code`),
    FOREIGN KEY(`Institution_Code`) REFERENCES `Institution`(`Institution_Code`),
    FOREIGN KEY(`User_Name`) REFERENCES `User`(`User_Name`)
);

CREATE TABLE IF NOT EXISTS `Administrator`(
	`Admin_Code` VARCHAR(50) NOT NULL,
    `First_Name` VARCHAR(50) NOT NULL,
    `Last_Name` VARCHAR(50) NOT NULL,
    `Gender` VARCHAR(10) NOT NULL,
    `Date_Of_Birth` DATE NOT NULL,
    `Institution_Code` VARCHAR(50) NOT NULL,
    `User_Name` VARCHAR(50) NOT NULL,
    `Is_Trashed` BOOLEAN NULL DEFAULT FALSE,
    `Trashed_Date` DATETIME NOT NULL,
    `Is_Active` BOOLEAN NULL DEFAULT FALSE,
    `Active_Date` DATETIME NULL,
    PRIMARY KEY(`Admin_Code`),
    FOREIGN KEY(`Institution_Code`) REFERENCES `Institution`(`Institution_Code`),
    FOREIGN KEY(`User_Name`) REFERENCES `User`(`User_Name`)
);

CREATE TABLE IF NOT EXISTS `Professor`(
	`Professor_Code` VARCHAR(50) NOT NULL,
    `First_Name` VARCHAR(50) NOT NULL,
    `Last_Name` VARCHAR(50) NOT NULL,
    `Gender` VARCHAR(10) NOT NULL,
    `Date_Of_Birth` DATE NOT NULL,
    `Title` VARCHAR(50) NULL,
    `Education_Level` VARCHAR(50) NULL,
    `Institution_Code` VARCHAR(50) NOT NULL,
    `User_Name` VARCHAR(50) NOT NULL,
    `Is_Trashed` BOOLEAN NULL DEFAULT FALSE,
    `Trashed_Date` DATETIME NOT NULL,
    `Is_Active` BOOLEAN NULL DEFAULT FALSE,
    `Active_Date` DATETIME NULL,
    PRIMARY KEY(`Professor_Code`),
    FOREIGN KEY(`Institution_Code`) REFERENCES `Institution`(`Institution_Code`),
    FOREIGN KEY(`User_Name`) REFERENCES `User`(`User_Name`)
);

CREATE TABLE IF NOT EXISTS `Course`(
	`Course_Code` VARCHAR(50) NOT NULL,
    `Course_Name` VARCHAR(50) NOT NULL,
    `Credit_Hour` VARCHAR(5) NOT NULL,
    `Description` TEXT NULL,
    `Is_Trashed` BOOLEAN NULL DEFAULT FALSE,
    `Trashed_Date` DATETIME NOT NULL,
    `Is_Active` BOOLEAN NULL DEFAULT FALSE,
    `Active_Date` DATETIME NULL,
    PRIMARY KEY(`Course_Code`)
);

CREATE TABLE IF NOT EXISTS `Address`(
	`Address_Code` VARCHAR(50) NOT NULL,
    `State` VARCHAR(50) NULL,
    `Street` VARCHAR(50) NULL,
    `City` VARCHAR(50) NULL,
    `Country` VARCHAR(50) NULL,
    `Zip_Code` VARCHAR(10) NULL,
    `Email` VARCHAR(50) NOT NULL,
    `Website` VARCHAR(100) NULL,
    `Phone_Number` VARCHAR(50) NULL,
    `Is_Cell` BOOLEAN NULL DEFAULT FALSE,
    `Is_Trashed` BOOLEAN NULL DEFAULT FALSE,
    `Trashed_Date` DATETIME NULL,
    `Is_Active` BOOLEAN NULL DEFAULT FALSE,
    `Active_Date` DATETIME NULL,
    `Fax` VARCHAR(50) NULL,
    PRIMARY KEY(`Address_Code`)
);

CREATE TABLE IF NOT EXISTS `Department`(
	`Department_Code` VARCHAR(50) NOT NULL,
    `Department_Name` VARCHAR(50) NOT NULL,
    `Description` TEXT NULL,
    `Is_Trashed` BOOLEAN NULL DEFAULT FALSE,
    `Trashed_Date` DATETIME NOT NULL,
    `Is_Active` BOOLEAN NULL DEFAULT FALSE,
    `Active_Date` DATETIME NULL,
    PRIMARY KEY(`Department_Code`)
);

CREATE TABLE IF NOT EXISTS `Program`(
	`Program_Code` VARCHAR(50) NOT NULL,
    `Program_Name` VARCHAR(50) NOT NULL,
    `Program_Title` VARCHAR(50) NOT NULL,
    `Description` TEXT NULL,
    `Is_Trashed` BOOLEAN NULL DEFAULT FALSE,
    `Trashed_Date` DATETIME NOT NULL,
    `Is_Active` BOOLEAN NULL DEFAULT FALSE,
    `Active_Date` DATETIME NULL,
    PRIMARY KEY(`Program_Code`)
);