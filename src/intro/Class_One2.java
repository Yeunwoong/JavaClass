package intro;

public class Class_One2 {
	public static void main(String[] args) {
		//System.out.println("Message Out Java Program");		
		
		Person2 saeroi = new Person2("Park Saeroi");
		saeroi.setAge(29);
		Person2 saeroi2 = new Person2("Jang Geunwon");
		saeroi2.setAge(29);
		saeroi2.target = saeroi.name;
		System.out.println("name: " + saeroi.name 
				+ " , age: " + saeroi.age 
				+ " , target: " + saeroi.target);
		System.out.println("name: " + saeroi2.name 
				+ " , age: " + saeroi2.age 
				+ " , target: " + saeroi2.target);
	}
}

class Person2 {
    String name; 	 
    int age;
    String target;
    
    Person2(String name){
         this.name = name;
    }
    
    void setAge(int age) {         
        this.age = age;
    }
   
    void hit(String enemy) {  
        this.target = enemy; 
    }
}
