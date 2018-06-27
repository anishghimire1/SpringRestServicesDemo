# Spring-Boot-Restful-Services
Simple Spring Boot application to expose Restful Web Services for simple adding services and getting current time with timezone.

# Run the example

Clone and run an example application

1. `git clone https://github.com/anishghimire1/SpringRestServicesDemo.git`
2. `cd SpringRestServicesDemo`
3. `gradle clean build`
4. Import SpringRestServicesDemo as a gradle project to Eclipse
5. Right click on the project and Run as Spring Boot Application

This application provide Restful Service for three APIs:

1. GET API for adding two numbers, and getting json response as a result:
   http://localhost/math/add?n1=numberparam1&n2=numberparam2
   The API is also available at: 
   https://quiet-scrubland-66073.herokuapp.com/math/add?n1=11&n2=22 
Sample Response:
{
	"status": "SUCCESS",
	"result": {
		"number1": "11.0",
		"number2": "22.0",
		"sum": "33.0"
	}
}
   
2. POST API for adding two numbers from form data, 'number1' and 'number2':
   http://localhost/math/add
   Also available at:
   https://quiet-scrubland-66073.herokuapp.com/math/add 
Sample Response:
{
	"status": "SUCCESS",
	"result": {
		"number1": "42.0",
		"number2": "22.0",
		"sum": "64.0"
	}
}
   
3. GET API for getting current time and time zone for Calgary:
	http://localhost/time/now
	Also available at:
	https://quiet-scrubland-66073.herokuapp.com/time/now 
	(In the server it displays server time instead of current MDT time, the code changes are in github though)
Sample Response:
{
	"status": "SUCCESS",
	"result": {
		"currentTime": "12:34:41",
		"timezone": "MDT"
	}
}

Sample Generic Error Response:
{
	"status": "ERROR",
	"result": {
		"errormessage": "Failed to convert value of type 'java.lang.String' to required type 'double'; nested exception is java.lang.NumberFormatException: For input string: \"abc\""
	}
}



