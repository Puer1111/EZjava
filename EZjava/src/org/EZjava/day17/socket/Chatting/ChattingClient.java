package org.EZjava.day17.socket.Chatting;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChattingClient {

	public static void main(String[] args) {
		Socket socket = null;
		int port = 9999;
		String address = "192.168.60.231";
		OutputStream os = null;
		InputStream is = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			socket = new Socket(address, port);
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("Connect!");
			while(true) {
			String recvMsg = dis.readUTF();
			System.out.println("결과:" + recvMsg);
			System.out.println();
			System.out.println("이번에 뭐라고 보낼까?: ");
			String sendMsg = sc.nextLine();
			dos.writeUTF(sendMsg);
			if("exit".equals(sendMsg))break;
			dos.flush();
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}finally {
			try {
				socket.close();
			}catch (IOException e) {

				e.printStackTrace();}
		}
	}

}
