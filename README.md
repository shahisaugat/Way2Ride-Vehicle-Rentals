# Way2Ride Vehicle Rental System
Way2Ride Vehicle Rental is a fully optimized vehicle rental platform
that gives user a seamless experience of renting a vehicle both two wheeler's and four wheeler's.
It allows user to surf over a varieties of vehicles and book them at their ease without needing to hassle.

## Features

### Admin Panel
- Dashboard
- Vehicle Management
- User Management
- Notification Preferences
- Statistics

### User Panel
- Home
- Vehicle Catalogue
- Two Wheeler's
- Four Wheeler's
- Feedback and Support
- Settings
- Notifications
- Reward System
- Search Integrated
- Light and Dark Mode

## Screenshots
<img src="Way2Ride-VehicleRentals/Git Images/Screenshot (1).png" alt="Login Page" width="400"/>&nbsp;
<img src="Way2Ride-VehicleRentals/Git Images/Screenshot (2).png" alt="Settings Page" width="400"/>&nbsp;
<img src="Way2Ride-VehicleRentals/Git Images/Screenshot (3).png" alt="Payment Gateway" width="400"/>&nbsp;
<img src="Way2Ride-VehicleRentals/Git Images/Screenshot (4).png" alt="Home Page" width="400"/>&nbsp;
<img src="Way2Ride-VehicleRentals/Git Images/Screenshot (5).png" alt="Feedback" width="400"/>&nbsp;
<img src="Way2Ride-VehicleRentals/Git Images/Screenshot (6).png" alt="Two Wheeler's" width="400"/>

## Getting Started

Follow these instructions to set up the project on your local machine for testing.

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/saugatshahi/Way2Ride.git
   ```
   ### or
   
   ```bash
   git clone https://github.com/shahisaugat/Way2Ride-Vehicle-Rentals.git
   ```

2. Create database with following MySQL commands:
   
   ```MySQL
   use newtestdb;

CREATE TABLE USER_DETAILS (
    EmailAddress VARCHAR(255) Primary key NOT NULL,
    FullName VARCHAR(255) NOT NULL,
    ContactNo VARCHAR(15),
    Country VARCHAR(255),
    HomeAddress VARCHAR(255),
    Password VARCHAR(255) NOT NULL,
    ImageData BLOB,
    LicenseNumber VARCHAR(20),
    DateOfIssue DATE,
    DateOfExpiry DATE,
    SecurityAnswer1 VARCHAR(255),
    SecurityAnswer2 VARCHAR(255),
    SecurityAnswer3 VARCHAR(255)
);

Alter table user_details add column ProfilePicture longblob;

Alter table user_details modify ImageData longblob;

CREATE TABLE ModelItem (
    ModelId int auto_increment primary key,
    Category VARCHAR(255),
    Features VARCHAR(255),
    Brand VARCHAR(255),
    PowerSource VARCHAR(255),
    Limitations VARCHAR(255),
    Price VARCHAR(255),
    Quantity VARCHAR(255)
);
 
ALTER TABLE ModelItem
ADD COLUMN CarImage LONGBLOB;
CREATE TABLE notification_store (
    NotifyId INT PRIMARY KEY,
   DescriptionNote varchar(255)
);

ALTER TABLE notification_store modify NotifyId INT auto_increment;

CREATE TABLE OrderTrack (
    OrderID VARCHAR(50) Primary Key,
    CarName VARCHAR(255),
    TransactionDate VARCHAR(20),
    CarImage LONGBLOB
);

ALTER TABLE OrderTrack
ADD COLUMN HolderName VARCHAR(255),
 
ADD COLUMN HolderNumber VARCHAR(255),
ADD COLUMN CVV VARCHAR(16),
ADD COLUMN ExpDate VARCHAR(15),
ADD COLUMN PostalCode VARCHAR(15),
ADD COLUMN EmailAddress VARCHAR(255),
ADD COLUMN Price VARCHAR(255)
;

CREATE TABLE userfeedback (
uid INT auto_increment PRIMARY KEY,
    emailAddress VARCHAR(255),
    FullName VARCHAR(255),
    screenshot BLOB,
    description TEXT,
    enquirytype VARCHAR(100),
    FOREIGN KEY (emailAddress) REFERENCES user_details(EmailAddress)
);
Alter table userfeedback modify column screenshot longblob;

CREATE TABLE purchases (
    purchase_id INT PRIMARY KEY,
    email_address VARCHAR(255),  -- Assuming email address is unique
    amount DECIMAL(10, 2)
);
 
CREATE TABLE user_totals (
    email_address VARCHAR(255) PRIMARY KEY,
    total_amount DECIMAL(10, 2)
);

INSERT INTO purchases (purchase_id, email_address, amount)
VALUES (1, 'user1@example.com', 50.00);
INSERT INTO purchases (purchase_id, email_address, amount)
VALUES (3, 'user2@example.com', 70.00);
ALTER TABLE purchases
ADD COLUMN purchase_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP;

CREATE TABLE twowheelers (
    ID INT auto_increment primary key,
    BikeName varchar(255),
    BikePower varchar(255),
    BikeBrand varchar(255),
    BikePrice varchar(255),
    BikeSpeed varchar(255),
    BikeImage longblob);

3. Go to the path Way2Ride Vehicle Rentals - Java Swing\Way2Ride-VehicleRentals\src\app\vehicle\database and change the username and password:
   ```Java
   try{
            String username = "root";
            String password = "SaugatSHELL196$!";
            String database = "newtestdb";
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection;
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/" + database, username, password
            );
            if(connection == null){
                System.out.println("Database connection fail");
            }else{
                System.out.println("Database connection success");
            }
            return connection;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }

   4. Run the application

   # GitHub Main
   Github Main Repository Link: (https://github.com/saugatshahi/Way2Ride.git)
   
