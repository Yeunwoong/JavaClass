package intro;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Class_Net {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.print("����� �Է��Ͻÿ�(��ĭ���� ��� �Է�, ��: 10 + 30) : ");
		
		String input = sc.nextLine();
		
		String[] splitted = input.split(" ");
		for(int i=0; i<splitted.length; i++) {
			System.out.println(splitted[i]);
		}
				
		StringTokenizer st = new StringTokenizer(input, " ");
		int a = Integer.parseInt(st.nextToken());
		String operation = st.nextToken();
		int b = Integer.parseInt(st.nextToken());
		System.out.println("a: " + a + " , op: " + operation + " , b: " + b);
	}

}
