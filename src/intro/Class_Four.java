package intro;

public class Class_Four {
	public static void main(String[] args) {
		Shape s = new Shape();
	}
}

abstract class Shape { // �߻� Ŭ���� ����
	public Shape() { }
	public void paint() { draw(); }
	abstract public void draw(); // �߻� �޼ҵ�
}

abstract class Line extends Shape {
	
}


