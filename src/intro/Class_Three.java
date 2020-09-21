package intro;

public class Class_Three {
	public static void main(String[] args) {
		C c = new C();
		Person p = new Student("");		
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

class Person {
	String name;
	String id;
	public Person(String name) {
		this.name = name;
	}
	public void draw() {
		System.out.println("Person draw");
	}
	
}

class Student extends Person {
	String grade;
	String department;
	public Student(String name) {
		super(name);
	}
	public void draw() {
		System.out.println("Student draw");
	}
}

