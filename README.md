# Fundamental_Project

## BLog Site

### Brief

This project requires a CRUD (create, read, update, delete) application which should highlight the skills learnt over the next few weeks. Skills including project planning, risk and price considerations, use of git and java.

### Requirements

* Create a Jira board to plan project 
* Add to product backlog
* Create Risk Assessment 
* Version control
* ERD (relationship diagram)
* CRUD functionality 


### Methodology

Application will be a blog form

* Login Details:
 1. Username
 2. Password
 3. Name of Blog
 
 
* Creating Posts:
 1. Create Blog name
 2. Create title
 3. Create body of text
 4. Submit, append, and delete multiple blogs
 
### Entity Relationship Diagram 

The ERD requires 3 tables, a user table, a blog name table and a post table. Posts hold a many-to-one relationship with blogs. As the user would enter data into the tables, there is no need for me to add any data in prior to the application running.

![ERD](https://github.com/makhdoomshabir/fundamentalproject/blob/master/Screenshot%20from%202020-09-07%2000-00-13.png)
  
### CI Pipeline
![CI Pipeline](https://github.com/makhdoomshabir/fundamentalproject/blob/master/Screenshot%20from%202020-09-06%2023-37-35.png)

* Source code: Java 
  1. Object orientated allowing for reuasable code  
  2. Secure

* VCS: GitHub 
  1. Considered an industry standard as apposed to something like Subversion.
  2. Have access to prior builds allowing you to revert back to previous builds of the application. 
  3. Can work in development branch and merge changes into master.

* Project Tracking: Jira Software 
  1. More suited towards software development whereas Trello is more generic. 
  2. Jira has built in features such as sprints tailored for agile software development.

* Email Server: Outlook 
  1. Default Email service and a very common Email service provider.

* CI Server: Circle CI 
  1. Can run complicated pipelines efficiently.
  2. Seamlessly connects with Github.
  

### Moscow Prioritisation 

Must have:
* Jira kanban board to help plan
* Risk Assessment to be aware of potential dangers and failures
* CRUD functionality for the Blog data
* Connected to GCP to host mySQL

Should have:
* Login page 
* Application deployed

Could have:
* More aesthetic front end to attract customers

Wont have:
* User ability to edit font size, font, text positioning
* User ability to add images


### Jira Board
A sprint from my Jira board:

![jira board](https://github.com/makhdoomshabir/fundamentalproject/blob/master/Screenshot%20from%202020-09-06%2013-49-05.png)

### Installation
Use the command line to run the application from Springboot, the server host is "localhost:8080/html/Homepage.html"

### Risk Assessment

The risk assessment covers and highlights any potential risk of failure or security dangers with a guide of how bad this risk is and whether it can be tolerated or not.

![risk assessment](https://github.com/makhdoomshabir/fundamentalproject/blob/master/Screenshot%20from%202020-09-07%2000-19-19.png)

### Circle CI Deployment Attempt

![deploy](https://github.com/makhdoomshabir/fundamentalproject/blob/master/Screenshot%20from%202020-09-06%2013-37-41.png)

Error due to there being no package.json file. Something we havent come across yet however I attempted to add a package.json file, with no real luck.

![package.json file](https://github.com/makhdoomshabir/fundamentalproject/blob/master/Screenshot%20from%202020-09-06%2023-57-49.png)

### Current Bugs

* Cannot create posts within a blog 
* Error calling the id from javascript to then succesfully delete and append posts
* Application has not yet been connected to the GCP
* Deployment failed due to no package.json file available

### Future Version Improvements 

* A login page would be the next priority to allow multiple users to create and store their data as individual users. 
* A more aesthetic front end to entice client customers to use the application. This would be achieved with CSS.
* More accessible features such as the ability to alter fonts, font size, title sizes, add images, organise the structure of the page.
* Smaller implementations such as adding a "date created" and an "author" for each post created.

