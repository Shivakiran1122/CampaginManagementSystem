 **CampaignManagementSystem**<br/>
  **Introduction:**
•	Planning, carrying out, monitoring, and analyzing a marketing initiative are all parts of campaign management. This could be a marketing campaign for the introduction of a new product or an event, but it also might just be a small promotion. <br/>
•	The main aim is to capture the status of each campaign that desired views are achieved with in the specified start and end date of campaign.<br/>

**Application Design:**

Project design these are the following technologies that are been used :
•	Front End Technology: ReactJS is been used for front end view (web page view)<br/>
•	Back End Technology: Spring Boot is used for handling all the business Logic<br/>
•	Database: MYSQL is the database used for storing the data.<br/>

**Front End Technology:**

•	Using ReactJS the Front-end part of the application is handled. The several components like campaign entries page, campaigns displaying page, campaign final report page  are used in the application.<br/>
•	In the following project  we are considering the following parameters like campaign name, campaign category , campaign URL, campaign start date, campaign end date, number of desired views of that particular campaign in the campaign entry page.<br/>
•	In the campaign display page, all the campaigns available are randomly displayed the each campaign is been displayed with the specified start date & end date as specified during the campaign entry.<br/>
•	It also shows you the data like current time, current date of campaign generation  in the same page where the campaigns are displayed.<br/>

**Back End Technology:**

•	Using Spring boot and RESTFUL API the Back-end part of the application is handled . The are several layers like Controller layer, Service layer, Repository layer where the  application  control is handled. 

•	The user request is been is send through an API call to controller and controller handles the particular request from the client. Controller  request is then passed to the layers like service layer then followed by JPA repository layer. Finally, this layer interacts with the data base & store the required data in the database.


•	 Java backend framework  Hibernate is used in Application Design. It is a framework that provides an abstraction layer for interacting with your database, from establishing connections to implement CRUD operations.


**Database:**

•	MySQL is the database used for storing all the required data.
•	Connection is been establishing between back end and data base so that what ever the required data available can be stored in database, later the processing of data can be done after the  data storage.

**Improvements:**

•	In the project  we can add drop down menu of the available category campaigns.
•	When user select the particular category campaign then all the information of the particular campaign category will be displayed like all the campaigns of particular  category information will be displayed like campaign  name, campaign image, campaign generated date , successful campaign views, desired campaign views , campaign  acquired status.

