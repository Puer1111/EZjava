package org.EZjava.day16.socket.Calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CalClient {

	public static void main(String[] args) {
		Socket socket = null;
		String address = "127.0.0.1";
		int port = 9999;
		OutputStream os = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		InputStream is = null;
		Scanner sc = new Scanner(System.in);
		try {
			socket = new Socket(address, port);
			System.out.println("Connected");
			// socket.getInputStream();
			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);
			while(true) {
			System.out.print("계산식(빈칸으로 띄어 입력 ex)24+42 >>");
			String sendMsg = sc.nextLine();
			dos.writeUTF(sendMsg);
			dos.flush();
			String recvMsg = dis.readUTF();
			System.out.println("계산결과: " + recvMsg);
			}
			} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
//		finally {
//			try {
//				is.close();
//				os.close();
//				dos.close();
//				dis.close();
//				socket.close();
//			}catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}

	}

