package intro;

import java.io.IOException;
import java.sql.SQLException;

public class Class_Exception {
	public static void main(String[] args) {
		
		
		//makePerson();
		
		try {
			int a =  Integer.parseInt("10asdasd");
			System.out.println(a);
		} catch (NumberFormatException e) {
			System.out.println("Exception 발생했으니 받아보자");
		} catch (Exception e) {
			System.out.println("혹시 몰라서...");
		}
		
		
		
		
		//int a =  Integer.parseInt("10asdasdasd");
		//System.out.println(a);
		
		try {
			//int a = Integer.parseInt("10asdas");				
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
		try {
			//
		} catch(Exception e) {
			//e.printStackTrace();
		}
		
		
		try {
			
		} catch (RuntimeException e) {
			System.out.println(e.getMessage() + "   완료" );
		}
		
		
		
		
		
		/*catch (OutOfMemoryError e) {
			System.out.println(e.getMessage());
		}
		*/
		 
		try {
			PersonE p = new PersonE();
			//p.setGrade(-3);
			//System.out.println("동작할까요?");
		} catch (Exception e) {
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
	
	void setGrade(int grade) throws IOException {
		System.out.println("setGrade 실행됨");
		if(grade<1 || grade >6) {			
			throw new IOException("학년 에러");
		}
		this.grade = grade;
	}
	
	void setAge(int age) throws SQLException
	{
		if(age <0)
		{
			SQLException e = new SQLException("나이에 대한 잘못된 변경");
			throw e;
		}
			
		this.age = age;
	}
	
	void setGrade2(int grade) throws Exception {
		System.out.println("setGrade2 실행됨");
		if(grade<1 || grade >6) {			
			throw new Exception("학년 에러2");
		}
		this.grade = grade;
	}
	
	
	
	void showError() throws Error{
		Error e = new Error();
		throw e;
	}
}

class SaeroiThread extends PersonE implements Runnable {
	@Override
	void setGrade(int grade) throws Exception {

	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
