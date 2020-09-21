package intro;

public class CommonMethod {
	static void check(Person person) {
		boolean adult = false;
		if(person.country.equals(Constant.USA)) {
			if(person.age >= Constant.Threshold_USA)
				adult = true;
		} else if(person.country.equals(Constant.KOR)) {
			if(person.age >= Constant.Threshold_KOR)
				adult = true;
		}		
		if(adult)
			System.out.println("성인입니다.");
		else
			System.out.println("성인이 아닙니다.");
	}
	
	static int getMax(int n1, int n2) {
		int max = n1>n2?n1:n2;
	    return (max);
	}
	
	static int getMax(int n1, int n2, int n3) {
		int max = n1>n2?n1:n2;
		max = max>n3?max:n3;
		// or
		//int max = getMax(getMax(n1,n2),n3);  
	    return (max);
	}
	
	static int[] makeArray(int a) {
		int array[]=new int[a];
		for(int i = 0;i<a;i++) {
			array[i] = i+1;
		}
		return array;
	}
	
	static String printString(String input, int a) {
		return input.substring(a);
	}
	static String printString(String input, int a, int b) {
		return input.substring(a,b);
	}
	
	static String getGrade(Subject subject) {
		if(subject.score<0) {
			System.out.println("wrong score");
			return "WRONG";
		}			
		if(subject.score>=80)  
			return "A+";
		if(subject.score>=60)
			return "A";
		else
			return "B+";
	}

}
