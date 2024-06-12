package org.EZjava.day17.socket.Baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class BaseballClient {

	public static void main(String[] args) {
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		int port = 9999;
		String address = "127.0.0.1";

		try {
			socket = new Socket(address, port);
			System.out.println("Connect!");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
		
			System.out.print("숫자 입력(띄어쓰기 구분): ");
			String sendMsg = sc.nextLine();
			dos.writeUTF(sendMsg);
			dos.flush();
			
			String recvMsg = dis.readUTF();
			System.out.println("결과: " + recvMsg);
		
		} catch (UnknownHostException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
