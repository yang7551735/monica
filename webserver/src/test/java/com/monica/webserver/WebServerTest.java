package com.monica.webserver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;

import com.monica.webserver.core.MinaWebServer;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class WebServerTest {
	
	WebServer webServer = null;
	
	@Before
	public void setup(){
		webServer = MinaWebServer.instance();
	}
	
	@Given("^invoke start method$")
	public void invoke_start_method() throws Throwable {
		webServer.start();
	}

	@Then("^use url \"([^\"]*)\" can access the server successful$")
	public void use_url_can_access_the_server_successful(String urlString) throws Throwable {
	    URL url = null;
		try {
			url = new URL(urlString);
			url.openConnection();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			Assert.fail("can't connect to webSever");
		}
	}

	@Given("^binding port with (\\d+)$")
	public void binding_port_with(int port) throws Throwable {
		webServer.bind(port);
	}	
	
}
