package org.EZjava.day16.socket.basic;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {

	public static void main(String[] args) {
		String address = "127.0.0.1";
		int port = 9999;
		try {
			Socket socket = new Socket(address , port );
			System.out.println("서버와 연결 되었습니다");
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
	
			e.printStackTrace();
		}

	}

}
