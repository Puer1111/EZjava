package org.EZjava.day16.socket.Calculator.practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class CalcClient {

	public static void main(String[] args) {
		Socket socket = null;
		int port = 9999;
		String address = "127.0.0.1";
		OutputStream os = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		Scanner sc = new Scanner(System.in);
		try {
			socket = new Socket(address, port);
			System.out.println("Connect");
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			while (true) {
				System.out.print("어떻게 계산 할까: ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				if("exit".equals(sendMsg))break;
				dos.flush();
				String recvMsg = dis.readUTF();
				System.out.println("계산 결과 :  " + recvMsg);
			}
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				os.close();
				socket.close();
				dos.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

}
