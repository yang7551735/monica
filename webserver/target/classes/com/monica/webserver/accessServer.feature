
Feature: url to access WebServer,and can get response from server

Scenario: access server's servlet
    Given webServer is start
    When url "http://127.0.0.1:8080/testServlet.do" access servlet
    Then response from server "testServlet's response"
    
Scenario Outline: access server's servlet with param
    Given webServer is start
    When url "http://127.0.0.1:8080/testServlet.do?<Params>" access servlet
    Then response from server "testServlet's response <Params>"
    
    Examples: Params  
   		|	Params										|
    	|	param1=aaa								|
    	|	param1=aaa&param2=bbb		|
