How to Run:

- right clik on project -> Run As -> Spring Boot App

 APIs
 
 1- register-API: EndPoint(POST: http://localhost:2019/api/employee/register)
    This API will be user to create employee record in data base. basically used for employee registration.
    
    this will be a post request.
    
    Smaple body data:
    {
		"firstName":"Arun",
		"lastName":"Sathua",
		"gender":"Male",
		"dateOfBirth":"21-NOV-1989",
		"department":"Java"
	}
	
2- getAllEmployee-API : EndPoint(POST: http://localhost:2019/api/employee/register)

	this will be a get request. and will return all the registerd employee list with ascending order by first name.

DATABSE Info:

Here I have configured H2 In Memory DB.

spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
