package intro;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class Class_Seven {
	public static void main(String[] args) {
		HashMap<String, String> h = new HashMap<String, String>(); 
		h.put("apple", "���"); // "apple" Ű�� "���" ���� ���� �ؽøʿ� ����
		h.put("apple", "��"); 
		String kor = h.get("apple"); // "apple" Ű�� �� �˻�. kor�� "�����
		System.out.println(kor);
		
		
		TreeSet<String> names = new TreeSet<>();
		names.add("1��");
		names.add("2��");
		names.add("3��");
		names.add("1��");
		names.add("2��");
		
		System.out.println(names.first());
		System.out.println(names.last());
		
		Iterator<String> ir = names.iterator();
		while(ir.hasNext()) {
			String a = ir.next();
			System.out.println(a);
		}
		
		for(String a : names) {
			System.out.println(a);
		}
		
		HashMap<String, Integer> javaScore = 
				new HashMap<String, Integer>();
		
		// 5 ���� ���� ����
		javaScore.put("�輺��", 97);
		javaScore.put("Ȳ����", 88);
		javaScore.put("�賲��", 98);
		javaScore.put("���繮", 70);
		javaScore.put("�ѿ���", 99);
		
		Iterator<String> keys = javaScore.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(key + " : ");
			System.out.println(javaScore.get(key));
		}		
		
		javaScore.put("���繮", 80);
		
		keys = javaScore.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(key + " : ");
			System.out.println(javaScore.get(key));
		}	
	}
}
