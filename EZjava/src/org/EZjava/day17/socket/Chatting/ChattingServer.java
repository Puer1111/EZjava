package org.EZjava.day17.socket.Chatting;

import java.io.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChattingServer {

	public static void main(String[] args) {
		ServerSocket serversocket = null;
		Socket socket = null;
		OutputStream os = null;
		InputStream is = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		int port = 9999;
		try {
			serversocket = new ServerSocket(port);
			System.out.println("waiting..");
			socket = serversocket.accept();
			System.out.println("Connect");

			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
		while(true) {
			System.out.println("뭐라고 입력할까? :");
			String sendMsg = sc.nextLine();
			dos.writeUTF(sendMsg);
			if("exit".equals(sendMsg))break;
			dos.flush();
			System.out.println();
			
			String recvMsg = dis.readUTF();
			System.out.println("결과2: "+ recvMsg);
		}
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

}
