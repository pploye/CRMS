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
    PRIMARY KEY(`Address_Id`)
);

CREATE TABLE IF NOT EXISTS `Student`(
	`Student_Code` VARCHAR(50) NOT NULL,
    `First_Name` VARCHAR(50) NOT NULL,
    `Last_Name` VARCHAR(50) NOT NULL,
    `Gender` VARCHAR(10) NOT NULL,
    `Date_Of_Birth` DATE NOT NULL,
    `Is_Trashed` BOOLEAN NULL DEFAULT FALSE,
    `Trashed_Date` DATETIME NOT NULL,
    `Is_Active` BOOLEAN NULL DEFAULT FALSE,
    `Active_Date` DATETIME NULL,
    PRIMARY KEY(`Student_Id`)
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
    `Is_Trashed` BOOLEAN NULL DEFAULT FALSE,
    `Trashed_Date` DATETIME NOT NULL,
    `Is_Active` BOOLEAN NULL DEFAULT FALSE,
    `Active_Date` DATETIME NULL,
    PRIMARY KEY(`Student_Id`)
);

CREATE TABLE IF NOT EXISTS `Course`(
	`Corse_Code` VARCHAR(50) NOT NULL,
    `Course_Name` VARCHAR(50) NOT NULL,
    `Credit_Hour` VARCHAR(5) NOT NULL,
    `Description` TEXT NULL,
    `Is_Trashed` BOOLEAN NULL DEFAULT FALSE,
    `Trashed_Date` DATETIME NOT NULL,
    `Is_Active` BOOLEAN NULL DEFAULT FALSE,
    `Active_Date` DATETIME NULL,
    PRIMARY KEY(`Student_Code`)
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

CREATE TABLE IF NOT EXISTS `Professor`(
	`Professor_Code` VARCHAR(50) NOT NULL,
    `First_Name` VARCHAR(50) NOT NULL,
    `Last_Name` VARCHAR(50) NOT NULL,
    `Gender` VARCHAR(10) NOT NULL,
    `Date_Of_Birth` DATE NOT NULL,
    `Title` VARCHAR(50) NULL,
    `Education_Level` VARCHAR(50) NULL,
    `Is_Trashed` BOOLEAN NULL DEFAULT FALSE,
    `Trashed_Date` DATETIME NOT NULL,
    `Is_Active` BOOLEAN NULL DEFAULT FALSE,
    `Active_Date` DATETIME NULL,
    PRIMARY KEY(`Professor_Code`)
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

CREATE TABLE IF NOT EXISTS `Accadamic_Year`(
	`Accadamic_Year_Code` VARCHAR(50) NOT NULL,
    `Name` VARCHAR(50) NOT NULL,
    `Description` TEXT NULL,
    `Start_Date` DATETIME NOT NULL,
    `End_Date` DATETIME NOT NULL,
    `Year` YEAR NOT NULL,
    `Is_Trashed` BOOLEAN NULL DEFAULT FALSE,
    `Trashed_Date` DATETIME NOT NULL,
    `Is_Active` BOOLEAN NULL DEFAULT FALSE,
    `Active_Date` DATETIME NULL,
    PRIMARY KEY(`Program_Code`)
);

CREATE TABLE IF NOT EXISTS `User`(
	`UserName` VARCHAR(50) NOT NULL,
    `Password` VARCHAR(50) NOT NULL,
    `Description` TEXT NULL,
    `Registration_Date` TIMESTAMP NOT NULL,
    `Institution_Code` VARCHAR(50) NOT NULL,
    `User_Code` VARCHAR(50) NULL,
    `Is_Trashed` BOOLEAN NULL DEFAULT FALSE,
    `Trashed_Date` DATETIME NOT NULL,
    `Is_Active` BOOLEAN NULL DEFAULT FALSE,
    `Active_Date` DATETIME NULL,
    PRIMARY KEY(`User`)
);

