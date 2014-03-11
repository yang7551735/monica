
Feature: WebServer can start in client application
	Servlet class with @WebServlet can be loaded into WebServer

Scenario: start Server with default port
    Given invoke start method
    Then use url "http://127.0.0.1:8080" can access the server successful 
    
Scenario: start Server with assigned port
	Given binding port with 8090
	And invoke start method
	Then use url "http://127.0.0.1:8090" can access the server successful
