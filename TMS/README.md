# Tender-Management-System_Using_JDBC-with DAO pattern

Project Type : 
------------------------------------------------------
|> Console Based Individual Project <|


Topics for the Application:
-----------------------------------------------------
● Core Java
● SQL
● JDBC

Attention areas:
------------------------------------------------------
Core Java: 
● Basic Oops concept
● Exception handling
● Collection framework

SQL: 
● Basic SQL
● Table relationships
● Joins
● Subqueries

JDBC with DAO pattern


					*===============================*
					|>	Tender Management System   <|
					*===============================*
		
	Domain Description:
	-------------------
	Whenever a company  requires a service / merchandise , a tender is floated. Company maintains an empaneled list 
	of Vendors. An empaneled vendor can only bid for a tender. Every vendor can bid only once against each tender. 
	Against each tender there may be bids from several vendors. The company will then select the most suitable bid 
	and places the order to that vendor.
	
	There are 2 users in the system:
	1. Administrator 
	2. Vendor
	
	
	The Role of Administrator is: 
	-----------------------------
	1. Login with his account.
	2. Register new Vendor. (assign a new username and password to him)
	3. View all the vendors.
	4. Create new tenders.
	5. View All the Tenders.
	6. View All the Bids of a tender.
	7. Assign tender to a vendor.
	
	
	The Role of a Vendor is: 
	------------------------
	1. Login with his account (username and password given by admin)
	1. View all the current Tenders.
	2. Place a Bid against a Tender.
	3. View status of a Bid(Whether Selected or Not)
	4. View his own Bid History.



	*========================================*
	|>	  MySQL Database tables details:    <|
	*========================================*
 
	  +------------------------------------+
	  | Tables_in_tender_management_system |
	  +------------------------------------+
	  | administrator                      |
	  | bids                               |
	  | tenders                            |
	  | vendor                             |
	  | vendor_tender                      |
	  +------------------------------------+
 
 
 > desc administrator;
+----------+-------------+------+-----+---------+-------+
| Field    | Type        | Null | Key | Default | Extra |
+----------+-------------+------+-----+---------+-------+
| id       | int         | NO   | PRI | NULL    |       |
| name     | varchar(20) | YES  |     | NULL    |       |
| dob      | date        | YES  |     | NULL    |       |
| email    | varchar(20) | YES  | UNI | NULL    |       |
| password | varchar(15) | YES  |     | NULL    |       |
+----------+-------------+------+-----+---------+-------+
 
 
 > desc vendor;
+--------------+-------------+------+-----+---------+----------------+
| Field        | Type        | Null | Key | Default | Extra          |
+--------------+-------------+------+-----+---------+----------------+
| id           | int         | NO   | PRI | NULL    | auto_increment |
| vname        | varchar(20) | YES  |     | NULL    |                |
| GST_no       | int         | YES  | UNI | NULL    |                |
| edate        | date        | YES  |     | NULL    |                |
| email        | varchar(20) | YES  | UNI | NULL    |                |
| password     | varchar(15) | YES  |     | NULL    |                |
| signature_id | int         | YES  | MUL | NULL    |                |
+--------------+-------------+------+-----+---------+----------------+
 
 
 > desc tenders;
+------------+-------------+------+-----+---------+-------+
| Field      | Type        | Null | Key | Default | Extra |
+------------+-------------+------+-----+---------+-------+
| tender_Id  | int         | NO   | PRI | NULL    |       |
| flat_type  | varchar(20) | YES  |     | NULL    |       |
| base_price | int         | YES  |     | NULL    |       |
| furniture  | varchar(20) | YES  |     | NULL    |       |
| location   | varchar(20) | YES  |     | NULL    |       |
| s_date     | date        | YES  |     | NULL    |       |
| e_date     | date        | YES  |     | NULL    |       |
+------------+-------------+------+-----+---------+-------+
 
 
> desc bids;
+---------------+-------------+------+-----+---------+----------------+
| Field         | Type        | Null | Key | Default | Extra          |
+---------------+-------------+------+-----+---------+----------------+
| bid_no        | int         | NO   | PRI | NULL    | auto_increment |
| offer_price   | int         | YES  |     | NULL    |                |
| bid_tender    | int         | YES  | MUL | NULL    |                |
| vendor_id     | int         | YES  | MUL | NULL    |                |
| status_of_bid | varchar(15) | YES  |     | NULL    |                |
+---------------+-------------+------+-----+---------+----------------+

> desc vendor_tender;
+-----------------------+------+------+-----+---------+-------+
| Field                 | Type | Null | Key | Default | Extra |
+-----------------------+------+------+-----+---------+-------+
| id                    | int  | YES  | MUL | NULL    |       |
| tender_Id             | int  | YES  | MUL | NULL    |       |
| highest_offered_price | int  | YES  |     | NULL    |       |
+-----------------------+------+------+-----+---------+-------+


Thank You ! 

![image](https://user-images.githubusercontent.com/103960690/193397636-410a06dc-054c-4b6d-b832-03521086ef16.png)
