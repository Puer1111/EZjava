package org.EZjava.day17.socket.Chatting;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {

	ServerSocket serversocket =null;
	InputStream is = null;
	Reader rd = null;
	Socket socket = null;
	int port = 9999;
	DataInputStream dis = null;
	try {
		serversocket = new ServerSocket(port);
		System.out.println("Waiting..");
		socket = serversocket.accept();
		System.out.println("connect");
		BufferedReader in = new BufferedReader(new InputStreamReader(is)); 
//		문자 기반의 보조 스트림
//		 socket 의 스트림은 바이트 기반 스트림이다
//		 바이트 -> 문자로 변경 해주어야한다. 
		//--> inputStreamReader 
		is = socket.getInputStream();
		dis = new DataInputStream(is);
		String recvMsg = in.readLine(); // BufferedReader랑 짝꿍 
//		String recvMsg = dis.readUTF();
		System.out.println("결과: "+recvMsg);
	} catch (IOException e) {
		
		e.printStackTrace();
	}finally {
		try {
			socket.close();
		}catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	}

}
