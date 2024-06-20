package org.EZjava.day17.socket.Chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Socket socket = null;
		int port = 9999;
		String address = "127.0.0.1";
		OutputStream os = null;
	//	Writer writer = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			socket = new Socket(address, port);

			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			
			PrintWriter out = new PrintWriter(os,true);
			
			System.out.println("뭐라고 보낼까: ");
			String sendMsg = sc.nextLine();
			out.println(sendMsg);
			
			//dos.writeUTF(sendMsg);
//			dos.flush();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
