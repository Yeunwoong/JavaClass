package intro;

public class Class_One {
	public static void main(String[] args) {
		System.out.println("Message Out Java Program");
		Person p = new Person(20, Constant.KOR);
		CommonMethod.check(p);	
		
	}	
}

class Person {
    int age;
    String country;
    
    Person(int age, String country){
    	this.age = age;
    	this.country = country;
    }
    
}
