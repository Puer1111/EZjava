package org.EZjava.day17.socket.Baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class BaseballServer {

	public static void main(String[] args) {
		ServerSocket serversocket = null;
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		int port = 9999;
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		try {
			serversocket = new ServerSocket(port);
			System.out.println("Waiting ..");
			socket = serversocket.accept();
			System.out.println("Connect");
			
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);

			int[] numbers = new int[3];
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = (int)(Math.random()*9) + 1;
				for (int j = 0; j < i; j++) {
					if (numbers[i] == numbers[j]) {
						i--;
						break;
					}
				}
				}
			for (int num : numbers) {
				System.out.print(num + " ");
			}
			System.out.println();

			String recvMsg = dis.readUTF();
			String data[] = recvMsg.split(" ");

			int strike = 0;
			int ball = 0;

			for (int i = 0; i < numbers.length; i++) {
				for (int j = 0; j < numbers.length; j++) {
					int num = Integer.parseInt(data[i]);
					if (numbers[i] == num) {
						if (i == j) {
							strike++;
						} else {
							ball++;
						}
					}
				}
			}
			String result = strike + "스트라이크 " + ball + "볼";
			dos.writeUTF(result);
			dos.flush();
		} catch (

		IOException e) {
			e.printStackTrace();
		}
	}

}
//			while (true) {
//				int nums[] = new int[3];
//				for (int i = 0; i < nums.length; i++) {
//					nums[i] = rand.nextInt(7);
//				}
//				int num1 = Integer.parseInt(data[0]);
//				int num2 = Integer.parseInt(data[1]);
//				int num3 = Integer.parseInt(data[2]);
//
//				if (nums[0] == num1) {
//					result = "1 Strike , 2 Ball";
//					if (nums[1] == num2) {
//						result = "2 Strike , 1 Ball";
//					}
//					if (nums[2] == num3) {
//						result = "3 Strike";
//					}
//				}
//
//				if (nums[1] == num2) {
//					result = "2 Strike , 1 Ball";
//					if (nums[0] == num1) {
//						result = "1 Strike , 2 Ball";
//					}
//					if (nums[2] == num3) {
//						result = "3 Strike";
//					}
//				}
//
//				if (nums[2] == num3) {
//					result = "1 Strike , 2 Ball";
//					if (nums[1] == num2) {
//						result = "2 Strike , 1 Ball";
//					}
//					if (nums[0] == num1) {
//						result = "1 Strike , 2 Ball";
//					}
//				} else {
//					result = "3 ball";
//				}
//				dos.writeUTF(result);
//				dos.flush();
//			}
