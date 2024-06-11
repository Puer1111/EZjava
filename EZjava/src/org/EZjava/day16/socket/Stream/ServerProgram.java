package org.EZjava.day16.socket.Stream;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerProgram {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 9999;
		InputStream is = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("클라 Waiting.. ");
		socket = serverSocket.accept();
			System.out.println("클라 Connect");
			 is = socket.getInputStream();
			 int result = is.read();
			 System.out.println((char)result);
			 result = is.read();
			 System.out.println((char)result);
			 result = is.read();
			 System.out.println((char)result);
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				is.close();
				socket.close();
				serverSocket.close();
			}catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
