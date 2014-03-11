$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/monica/webserver/startServer.feature");
formatter.feature({
  "id": "webserver-can-start-in-client-application",
  "description": "Servlet class with @WebServlet can be loaded into WebServer",
  "name": "WebServer can start in client application",
  "keyword": "Feature",
  "line": 2
});
formatter.before({
  "duration": 50247147,
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
  "location": "WebServerStarterTest.invoke_start_method()"
});
formatter.result({
  "duration": 81664201,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://127.0.0.1:8080",
      "offset": 9
    }
  ],
  "location": "WebServerStarterTest.use_url_can_access_the_server_successful(String)"
});
formatter.result({
  "duration": 4969872,
  "status": "passed"
});
formatter.before({
  "duration": 3559668,
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
  "location": "WebServerStarterTest.binding_port_with(int)"
});
formatter.result({
  "duration": 13395818,
  "status": "passed"
});
formatter.match({
  "location": "WebServerStarterTest.invoke_start_method()"
});
formatter.result({
  "duration": 8660,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://127.0.0.1:8090",
      "offset": 9
    }
  ],
  "location": "WebServerStarterTest.use_url_can_access_the_server_successful(String)"
});
formatter.result({
  "duration": 55164,
  "status": "passed"
});
});