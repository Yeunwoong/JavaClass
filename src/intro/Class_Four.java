package intro;

public class Class_Four {
	public static void main(String[] args) {
		Shape s = new Shape();
	}
}

abstract class Shape { // 추상 클래스 선언
	public Shape() { }
	public void paint() { draw(); }
	abstract public void draw(); // 추상 메소드
}

abstract class Line extends Shape {
	
}


