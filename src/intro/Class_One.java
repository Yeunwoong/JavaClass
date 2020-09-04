package intro;

public class Class_One {
	public static void main(String[] args) {
		System.out.println("Message Out Java Program");		
	}
}

class Person {
    String name; 	 
    int age;
    String target;
    
    Person(String name){
         this.name = name;
    }
    
    void setAge(int age) {         
        this.age = age;
    }
   
    void hit(String enemy) {  
        this.target = enemy; 
    }
}
