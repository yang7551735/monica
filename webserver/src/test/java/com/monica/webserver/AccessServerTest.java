package com.monica.webserver;

import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import junit.framework.Assert;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;

import com.google.common.base.Strings;
import com.monica.webserver.core.MinaWebServer;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccessServerTest {
	
	WebServer webServer = null;
	
	@Before
	public void setup(){
		webServer = MinaWebServer.instance();
	}
	
	@Given("^webServer is start$")
	public void webServer_is_start() throws Throwable {
		webServer.start();
	}

	@When("^url \"([^\"]*)\" access servlet$")
	public void url_access_servlet(String urlString) throws Throwable {
		URL url = new URL(urlString);
		URLConnection conn = url.openConnection();
		List<String> lines = IOUtils.readLines(conn.getInputStream());
	}

	@Then("^response from server \"([^\"]*)\"$")
	public void response_from_server(String arg1) throws Throwable {
//		Assert.assertEquals(expected, StringUtils.join(lines, ""));
	}
}
