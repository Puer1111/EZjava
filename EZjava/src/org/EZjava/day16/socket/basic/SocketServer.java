package org.EZjava.day16.socket.basic;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

	public static void main(String[] args) {
	ServerSocket serverSocket = null;
	int port = 9999;
	try {
		serverSocket = new ServerSocket(9999);
		System.out.println("클라이언트의 연결을 기다리고 있습니다.");
		Socket socket = serverSocket.accept();
		System.out.println("연결이 완료 되었습니다.");
		
	} catch (IOException e) {

		e.printStackTrace();
	}
	
	}

}