package com.monica.webserver;

public interface WebServer {

	void start();

	WebServer bind(int port);

}
