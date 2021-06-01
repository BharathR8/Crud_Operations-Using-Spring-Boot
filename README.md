# Crud_Operations-Using-Spring-Boot

Tools used in the project:
1. Java
2. Spring Boot
3. Maven
4. MongoDB
5. Postman

How to run the project?
Right-click on the root directory -> Run As -> Spring Boot App.

How to test the project?
Open Postman

GET - 'http://localhost:8080/vaccines/'

GET BY ID - 'http://localhost:8080/vaccines/[id]'

POST - 'http://localhost:8080/vaccines/'
BODY : {"name" : "Pfizer", "efficacy" : "93.0", "doses" : "2"}
HEADER : Content-Type: application/json

PUT - 'http://localhost:8080/vaccines/[id]'
BODY : {"name" : "Moderna", "efficacy" : "93.0", "doses" : "2"}
HEADER : Content-Type: application/json

DELETE - 'http://localhost:8080/vaccines/[id]'
