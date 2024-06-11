package org.EZjava.day16.socket.Calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		int port = 9999;
		Socket socket = null;
		InputStream is = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;

		try {
			serverSocket = new ServerSocket(port);
			System.out.println("Waiting..");
			socket = serverSocket.accept();
			System.out.println("Complete");
			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);
			while(true) {
			String recvMsg = dis.readUTF();
			String result = " ";
			String[] data = recvMsg.split(" ");
			int num1 = Integer.parseInt(data[0]);
			int num2 = Integer.parseInt(data[2]);
			String operator = data[1];
			switch (operator) {
			case "+":
				result = num1 + num2 + ""; // 정수 문자화
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
			dos.flush();
			
			System.out.println(recvMsg);
//			if(recvMsg == result)break;
			}
		}	 catch (IOException e) {
			e.printStackTrace();
		}
//		finally {
//			try {
//				is.close();
//				os.close();
//				dis.close();
//				dos.close();
//				socket.close();
//			}catch (IOException e) {
//				e.printStackTrace();
//			}
//		}

	}

}
