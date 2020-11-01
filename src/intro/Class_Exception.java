package intro;

public class Class_Exception {
	public static void main(String[] args){
		try {
			int a =  Integer.parseInt("10asdasdasd");
			System.out.println(a);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (OutOfMemoryError e) {
			System.out.println(e.getMessage());
		} 
	}
	static void makePerson() throws Exception {
		PersonE p = new PersonE();
		p.setGrade(7);		
	}
}

class PersonE {
	int age;
	int grade;
	void setGrade(int grade) throws Exception {
		if(grade<1 || grade >6) {
			Exception ex = new Exception("학년 에러");
			throw ex;
		}
		this.grade = grade;
	}
	
	void showError() throws Error{
		Error e = new Error();
		throw e;
	}
}

