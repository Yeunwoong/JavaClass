package intro;

public class Class_Three {
	public static void main(String[] args) {
		C c = new C();
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