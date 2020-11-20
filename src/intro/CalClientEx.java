package intro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class CalClientEx {
	public static void main(String[] args) {
		ClientCommThread th = new ClientCommThread();
		th.start();
		try {
			Thread.sleep(2000);
			System.out.println();
			System.out.println("Client main thread�� �ٸ� �۾� ����");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	static class ClientCommThread extends Thread {
		@Override
		public void run() {
			BufferedReader in = null;
			BufferedWriter out = null;
			Socket socket = null;
			Scanner scanner = new Scanner(System.in); 
			try {
				socket = new Socket("localhost", 9999);
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				while (true) {
					System.out.print("����� �Է��Ͻÿ�(��ĭ���� ��� �Է�, ��: 10 + 30) : ");
					String outputMessage = scanner.nextLine(); // Ű���忡�� ���� �б�
					if (outputMessage.equalsIgnoreCase("bye")) {
						out.write(outputMessage+"\n"); // "bye" ���ڿ� ����
						out.flush();
						break; // ����ڰ� "bye"�� �Է��� ��� ������ ���� �� ���� ����
					}
					out.write(outputMessage + "\n"); // Ű���忡�� ���� ���� ���ڿ� ����
					out.flush();
					String inputMessage = in.readLine(); // �����κ��� ��� ��� ����
					System.out.println("������ ��� ��� ����: " + inputMessage);
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			} finally {
				try {
					scanner.close();
					if(socket != null) socket.close(); // Ŭ���̾�Ʈ ���� �ݱ�
					System.out.print("Ŭ���̾�Ʈ ���� �ݾҽ��ϴ�.");
				} catch (IOException e) {
					System.out.println("������ ä�� �� ������ �߻��߽��ϴ�.");
					e.printStackTrace();
				}
			}
		}
	}
}
