package intro;

public class Class_Generic {
	public static void main(String[] args) {
		StoreObjectAtMost<String> name5 = new StoreObjectAtMost<>();
		name5.add("��ٿ�");
		name5.add("������");		
		
		StoreObjectAtMost<Integer> age5 = new StoreObjectAtMost<>();
		age5.add(1);
		age5.add(2);
	}
	
	static class StoreObjectAtMost<T> {		
		T first, second;
		void add(T o) {
			if(first == null) 
				first = o;
			else if (second == null)
				second = o;
			else {
				first = second;
				second = o;
			}
		}
	}
}
