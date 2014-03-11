package com.monica.webserver;

import java.io.IOException;
import java.net.InetSocketAddress;

import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

public class MinaWebServer implements WebServer {

	private IoAcceptor acceptor;
	
	public MinaWebServer(IoAcceptor acceptor) {
		this.acceptor = acceptor;
	}

	public static WebServer instance() {
        IoAcceptor acceptor = new NioSocketAcceptor();
        acceptor.setHandler(new WebServerHandler());
		return new MinaWebServer(acceptor);
	}

	public void start() {
		
	}

	public WebServer bind(int port) {
		try {
			acceptor.bind( new InetSocketAddress(port) );
		} catch (IOException e) {
			e.printStackTrace();
		}
		return this;
	}

}
