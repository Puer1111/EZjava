package org.EZjava.day16.socket.Stream;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientProgram {

	public static void main(String[] args) {
		String address = "127.0.0.1";
		int port = 9999;
		OutputStream os = null;
		Socket socket = null;
		try {
			socket = new Socket(address, port);
			System.out.println("서버 Connect..");
			os = socket.getOutputStream();
			os.write(104);
			os.write(105);
			os.write(106);
			os.flush();
		} catch (UnknownHostException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				os.close();
				socket.close();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}

	}

}
