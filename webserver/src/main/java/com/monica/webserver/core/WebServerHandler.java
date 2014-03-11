package com.monica.webserver.core;

import org.apache.mina.core.service.IoHandler;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

public class WebServerHandler implements IoHandler{

	public void sessionCreated(IoSession session) throws Exception {
		
	}

	public void sessionOpened(IoSession session) throws Exception {
		
	}

	public void sessionClosed(IoSession session) throws Exception {
		
	}

	public void sessionIdle(IoSession session, IdleStatus status)
			throws Exception {
		
	}

	public void exceptionCaught(IoSession session, Throwable cause)
			throws Exception {
		
	}

	public void messageReceived(IoSession session, Object message)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void messageSent(IoSession session, Object message) throws Exception {
		
	}

}
