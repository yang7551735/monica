$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/monica/webserver/accessServer.feature");
formatter.feature({
  "id": "url-to-access-webserver,and-can-get-response-from-server",
  "description": "",
  "name": "url to access WebServer,and can get response from server",
  "keyword": "Feature",
  "line": 2
});
formatter.before({
  "duration": 121438914,
  "status": "passed"
});
formatter.scenario({
  "id": "url-to-access-webserver,and-can-get-response-from-server;access-server\u0027s-servlet",
  "description": "",
  "name": "access server\u0027s servlet",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "webServer is start",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "url \"http://127.0.0.1:8080/testServlet.do\" access servlet",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "response from server \"testServlet\u0027s response\"",
  "keyword": "Then ",
  "line": 7
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.before({
  "duration": 14545634,
  "status": "passed"
});
formatter.scenario({
  "id": "url-to-access-webserver,and-can-get-response-from-server;access-server\u0027s-servlet-with-param;params;2",
  "description": "",
  "name": "access server\u0027s servlet with param",
  "keyword": "Scenario Outline",
  "line": 16,
  "type": "scenario"
});
formatter.step({
  "name": "webServer is start",
  "keyword": "Given ",
  "line": 10
});
formatter.step({
  "name": "url \"http://127.0.0.1:8080/testServlet.do?param1\u003daaa\" access servlet",
  "keyword": "When ",
  "line": 11,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "response from server \"testServlet\u0027s response param1\u003daaa\"",
  "keyword": "Then ",
  "line": 12,
  "matchedColumns": [
    0
  ]
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.before({
  "duration": 14479658,
  "status": "passed"
});
formatter.scenario({
  "id": "url-to-access-webserver,and-can-get-response-from-server;access-server\u0027s-servlet-with-param;params;3",
  "description": "",
  "name": "access server\u0027s servlet with param",
  "keyword": "Scenario Outline",
  "line": 17,
  "type": "scenario"
});
formatter.step({
  "name": "webServer is start",
  "keyword": "Given ",
  "line": 10
});
formatter.step({
  "name": "url \"http://127.0.0.1:8080/testServlet.do?param1\u003daaa\u0026param2\u003dbbb\" access servlet",
  "keyword": "When ",
  "line": 11,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "response from server \"testServlet\u0027s response param1\u003daaa\u0026param2\u003dbbb\"",
  "keyword": "Then ",
  "line": 12,
  "matchedColumns": [
    0
  ]
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("com/monica/webserver/startServer.feature");
formatter.feature({
  "id": "webserver-can-start-in-client-application",
  "description": "Servlet class with @WebServlet can be loaded into WebServer",
  "name": "WebServer can start in client application",
  "keyword": "Feature",
  "line": 2
});
formatter.before({
  "duration": 21345130,
  "status": "passed"
});
formatter.scenario({
  "id": "webserver-can-start-in-client-application;start-server-with-default-port",
  "description": "",
  "name": "start Server with default port",
  "keyword": "Scenario",
  "line": 5,
  "type": "scenario"
});
formatter.step({
  "name": "invoke start method",
  "keyword": "Given ",
  "line": 6
});
formatter.step({
  "name": "use url \"http://127.0.0.1:8080\" can access the server successful",
  "keyword": "Then ",
  "line": 7
});
formatter.match({
  "location": "WebServerTest.invoke_start_method()"
});
formatter.result({
  "duration": 232441802,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://127.0.0.1:8080",
      "offset": 9
    }
  ],
  "location": "WebServerTest.use_url_can_access_the_server_successful(String)"
});
formatter.result({
  "duration": 7656215,
  "status": "passed"
});
formatter.before({
  "duration": 14147819,
  "status": "passed"
});
formatter.scenario({
  "id": "webserver-can-start-in-client-application;start-server-with-assigned-port",
  "description": "",
  "name": "start Server with assigned port",
  "keyword": "Scenario",
  "line": 9,
  "type": "scenario"
});
formatter.step({
  "name": "binding port with 8090",
  "keyword": "Given ",
  "line": 10
});
formatter.step({
  "name": "invoke start method",
  "keyword": "And ",
  "line": 11
});
formatter.step({
  "name": "use url \"http://127.0.0.1:8090\" can access the server successful",
  "keyword": "Then ",
  "line": 12
});
formatter.match({
  "arguments": [
    {
      "val": "8090",
      "offset": 18
    }
  ],
  "location": "WebServerTest.binding_port_with(int)"
});
formatter.result({
  "duration": 8730411,
  "status": "passed"
});
formatter.match({
  "location": "WebServerTest.invoke_start_method()"
});
formatter.result({
  "duration": 21015,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://127.0.0.1:8090",
      "offset": 9
    }
  ],
  "location": "WebServerTest.use_url_can_access_the_server_successful(String)"
});
formatter.result({
  "duration": 188155,
  "status": "passed"
});
});