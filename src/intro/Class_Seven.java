package intro;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class Class_Seven {
	public static void main(String[] args) {
		HashMap<String, String> h = new HashMap<String, String>(); 
		h.put("apple", "사과"); // "apple" 키와 "사과" 값의 쌍을 해시맵에 삽입
		h.put("apple", "배"); 
		String kor = h.get("apple"); // "apple" 키로 값 검색. kor는 "사과“
		System.out.println(kor);
		
		
		TreeSet<String> names = new TreeSet<>();
		names.add("1번");
		names.add("2번");
		names.add("3번");
		names.add("1번");
		names.add("2번");
		
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
		
		// 5 개의 점수 저장
		javaScore.put("김성동", 97);
		javaScore.put("황기태", 88);
		javaScore.put("김남윤", 98);
		javaScore.put("이재문", 70);
		javaScore.put("한원선", 99);
		
		Iterator<String> keys = javaScore.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(key + " : ");
			System.out.println(javaScore.get(key));
		}		
		
		javaScore.put("이재문", 80);
		
		keys = javaScore.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(key + " : ");
			System.out.println(javaScore.get(key));
		}	
	}
}
