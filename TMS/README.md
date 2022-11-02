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
 
 ![tdm_dbt1](https://user-images.githubusercontent.com/103960690/199557981-e2607cd2-02f3-47f8-ba9a-cea8039d6365.png)

![tms_dbt2](https://user-images.githubusercontent.com/103960690/199557907-785a95f8-a9cf-4911-b383-2973fa716a7c.png)


Thank You ! 

![image](https://user-images.githubusercontent.com/103960690/193397636-410a06dc-054c-4b6d-b832-03521086ef16.png)
