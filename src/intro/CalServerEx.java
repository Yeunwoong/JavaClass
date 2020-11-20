package intro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

public class CalServerEx {

	public static void main(String[] args) {
		ServerCommThread th = new ServerCommThread();
		th.start();
		try {
			Thread.sleep(2000);
			System.out.println();
			System.out.println("Server main thread�� �ٸ� �۾� ����");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static String calc(String exp) {
		StringTokenizer st = new StringTokenizer(exp, " ");
		if (st.countTokens() != 3) return "error";
		String res="";
		int op1 = Integer.parseInt(st.nextToken());
		String opcode = st.nextToken();
		int op2 = Integer.parseInt(st.nextToken());
		switch (opcode) {
			case "+": res = Integer.toString(op1 + op2);
				break;
			case "-": res = Integer.toString(op1 - op2);
				break;
			case "*": res = Integer.toString(op1 * op2);
				break;
			default : res = "error";
		}
		return res;
	}
	
	static class ServerCommThread extends Thread {
		@Override
		public void run() {
			BufferedReader in = null;
			BufferedWriter out = null;
			ServerSocket listener = null;
			Socket socket = null;
			try {
				listener = new ServerSocket(1212); // ���� ���� ����
				System.out.println("Ŭ���̾�Ʈ ������ ��ٸ��� �ֽ��ϴ�.....");
				socket = listener.accept(); // Ŭ���̾�Ʈ�κ��� ���� ��û ���
				System.out.println("Ŭ���̾�Ʈ�� ����Ǿ����ϴ�.");
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				while (true) {
					String inputMessage = in.readLine();
					if (inputMessage.equalsIgnoreCase("bye")) {
						System.out.println("Ŭ���̾�Ʈ���� ������ �����Ͽ���");
						break; // "bye"�� ������ ���� ����
					}
					System.out.println(inputMessage); // ���� �޽����� ȭ�鿡 ���
					String res = calc(inputMessage); // ���. ��� ����� res
					out.write(res + "\n"); // ��� ��� ���ڿ� ����
					out.flush();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(socket != null) socket.close(); // ��ſ� ���� �ݱ�
					if(listener != null) listener.close(); // ���� ���� �ݱ�
					System.out.print("���� ���� �ݾҽ��ϴ�.");
				} catch (IOException e) {
					System.out.println("Ŭ���̾�Ʈ�� ä�� �� ������ �߻��߽��ϴ�.");
					e.printStackTrace();
				}
			}
		}
	}
	

}
