# Fundamental_Project

## Name Of Application

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
  
### CI Pipeline
![CI Pipeline](https://github.com/makhdoomshabir/Fundamental_Project/blob/master/CI_Pipeline(1)image.gif)

* Source code – Java

* VCS – We chose GitHub because Git is now considered an industry standard as apposed to something like Subversion. One of the most useful features being that you have access to prior builds so that if any issues arise you can revert back to previous builds of the application. The use of branches also enables teams to work away from the master branch where they can work on specific features, all these features encourage teamwork. 

* Project Tracking – We chose Jira Software because it is more suited towards software development specifically whereas other tracking tools such as Trello are more one-size fits all. Jira has built in features such as sprints tailored for agile software development.

* Email Server – We chose Outlook because it is the default Email service and a very common Email service provider.

* CI Server – We chose Jenkins because it is open sourced and runs on Ubuntu which is the OS we are developing on as a team which provides us with consistency across devices. Its internal and cloud based. 

* Build Tool – Jenkins

* Artefact Repository – GitHub

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
![jira board](https://github.com/makhdoomshabir/fundamentalproject/blob/master/Screenshot%20from%202020-09-06%2013-49-05.png)

### Installation
Use the command line to run the application from Springboot, the server host is "localhost:8080/html/Homepage.html"

### Risk Assessment

![risk assessment](https://github.com/makhdoomshabir/Fundamental_Project/blob/master/Screenshot%20from%202020-09-04%2012-54-11.png)

### Circle CI Deployment Attempt

![deploy](https://github.com/makhdoomshabir/fundamentalproject/blob/master/Screenshot%20from%202020-09-06%2013-37-41.png)

### Current Bugs

* Blog name can be created but post themselves cannot
* Error calling the id from javascript to then succesfully delete and append posts
* Application has not yet been connected to the GCP

### Future Version Improvements 

* A login page would be the next priority to allow multiple users to create and store their data as individual users. 
* A more aesthetic front end to entice client customers to use the application. This would be achieved with CSS.
* More accessible features such as the ability to alter fonts, font size, title sizes, add images, organise the structure of the page.
* Smaller implementations such as adding a "date created" and an "author" for each post created.

