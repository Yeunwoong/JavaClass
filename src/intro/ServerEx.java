package intro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in); // Ű���忡�� ���� scanner ��ü ����
		try {
			listener = new ServerSocket(9999); // ���� ���� ����
			System.out.println("Ŭ���̾�Ʈ ������ ��ٸ��� �ֽ��ϴ�.....");
			socket = listener.accept(); // Ŭ���̾�Ʈ�κ��� ���� ��û ���
			System.out.println("Ŭ���̾�Ʈ�� ����Ǿ����ϴ�.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while (true) {
				String inputMessage = in.readLine(); // Ŭ���̾�Ʈ�κ��� �� �� �б�
				if (inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("Ŭ���̾�Ʈ���� bye�� ������ �����Ͽ���");
					break; // "bye"�� ������ ���� ����
				}
				System.out.println("Ŭ���̾�Ʈ�κ��� ������ �޽���: " + inputMessage);
				System.out.print("������>>"); // ������Ʈ
				String outputMessage = scanner.nextLine(); // Ű���忡�� �� �� �б�
				out.write(outputMessage + "\n"); // Ű���忡�� ���� ���ڿ� ����
				out.flush(); // out�� ��Ʈ�� ���ۿ� �ִ� ��� ���ڿ� ����
			}
		} catch (IOException e) { 
			e.printStackTrace();
		} finally {
			try {
				scanner.close(); // scanner �ݱ�
				socket.close(); // ��ſ� ���� �ݱ�
				listener.close(); // ���� ���� �ݱ�
				System.out.println("���� ���� �����Կ�");
			} catch (IOException e) { 
				System.out.println("Ŭ���̾�Ʈ�� ä�� �� ������ �߻��߽��ϴ�.");
				e.printStackTrace();
			}
		}
	}
}
