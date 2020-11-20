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
			System.out.println("Server main thread는 다른 작업 가능");
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
				listener = new ServerSocket(1212); // 서버 소켓 생성
				System.out.println("클라이언트 연결을 기다리고 있습니다.....");
				socket = listener.accept(); // 클라이언트로부터 연결 요청 대기
				System.out.println("클라이언트와 연결되었습니다.");
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				while (true) {
					String inputMessage = in.readLine();
					if (inputMessage.equalsIgnoreCase("bye")) {
						System.out.println("클라이언트에서 연결을 종료하였음");
						break; // "bye"를 받으면 연결 종료
					}
					System.out.println(inputMessage); // 받은 메시지를 화면에 출력
					String res = calc(inputMessage); // 계산. 계산 결과는 res
					out.write(res + "\n"); // 계산 결과 문자열 전송
					out.flush();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(socket != null) socket.close(); // 통신용 소켓 닫기
					if(listener != null) listener.close(); // 서버 소켓 닫기
					System.out.print("서버 소켓 닫았습니다.");
				} catch (IOException e) {
					System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
					e.printStackTrace();
				}
			}
		}
	}
	

}
