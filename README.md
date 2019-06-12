# Scorecard-for-Credit-Risk-Assessment
UI Layer and also CRUD functionality for Characteristic and Configuration screen

## Write-up of my work Till date
https://gist.github.com/SupreethSudhakaranMenon/557660bfad089de12d3befb6d71a627d

## Installation
Just import it to your IDE and build the project to resolve the dependencies.

## Database Configuration
Add Database credentials to `/resources/application.properties`  
The Default ones are :  

`spring.datasource.url=jdbc:mysql://localhost:3306/springbootdb`    
`spring.datasource.username=root`    
`spring.datasource.password=`    
`spring.jpa.hibernate.ddl-auto=update`    

## Server port Configuration  
Add this small snippet in this file `/resources/application.properties`  

`server.port = 7777`  
**"Server port number can be changed."**

## Usage  
Run the project through IDE and head out to the `localhost` port as set by you.
