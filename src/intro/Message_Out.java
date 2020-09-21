package intro;

public class Message_Out {
	public static void main(String[] args) {
		System.out.println("Message Out Java Program");
		
	}
	
	static int[] makeArray(int a) {
		int[] returnArray = new int[a];
		for(int i=0; i<returnArray.length; i++) {
			returnArray[i] = i+1;
		}
		return returnArray;
	}
}

