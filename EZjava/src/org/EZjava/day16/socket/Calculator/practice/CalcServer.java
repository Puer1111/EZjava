package org.EZjava.day16.socket.Calculator.practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalcServer {

	public static void main(String[] args) {
		ServerSocket serversocket = null;
		Socket socket = null;
		int port = 9999;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			serversocket = new ServerSocket(port);
			System.out.println("Waiting for Client..");
			socket = serversocket.accept();
			System.out.println("Complete");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			while(true) {
			String recvMsg = dis.readUTF();
			if("exit".equals(recvMsg))break;
			// String sendMsg = dos.writeUTF();
			System.out.println(recvMsg);
			String[] data = recvMsg.split(" ");
			String result = " ";
			int num1 = Integer.parseInt(data[0]);
			int num2 = Integer.parseInt(data[2]);
			String operator = data[1];
			switch (operator) {
			case "+":
				result = num1 + num2 + "";
				break;
			case "-":
				result = num1 - num2 + "";
				break;
			case "*":
				result = num1 * num2 + "";
				break;
			case "/":
				result = num1 / num2 + "";
				break;
			case "%":
				result = num1 % num2 + "";
				break;

			}
			dos.writeUTF(result);
			dos.flush();}
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
