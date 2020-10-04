package intro;

public class Class_Three {
	public static void main(String[] args) {
		C c = new C();
		Person5 p = new Student("");		
		p.draw();
		printTest(p);
	}
	
	static void printTest(Person5 p) {
		p.draw();
	}
}

class A{
	public A() {
		System.out.println("持失切A");
	}
}

class B extends A {
	public B() {
		System.out.println("持失切B");
	}
}

class C extends B {
	public C() {
		System.out.println("持失切C");
	}	
}

class Person5 {
	String name;
	String id;
	public Person5(String name) {
		this.name = name;
	}
	public void draw() {
		System.out.println("Person draw");
	}
	
}

class Student extends Person5 {
	String grade;
	String department;
	public Student(String name) {
		super(name);
	}
	public void draw() {
		System.out.println("Student draw");
		super.draw();
	}
	
	
	
}



