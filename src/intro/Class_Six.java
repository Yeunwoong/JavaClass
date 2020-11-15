package intro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;
import java.util.TreeSet;

public class Class_Six {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<>();
		animals.add("dog");
		animals.add("cat");
		animals.add("horse");
		String longest = "";
		String longest2 = "";
		for(int i=0; i<animals.size(); i++) {
			if(longest.length()<animals.get(i).length())
				longest = animals.get(i);			
		}
		
		System.out.println(longest);
		
		Iterator<String> it = animals.iterator();
		while(it.hasNext()) {
			String value = it.next();
			if(longest2.length()<value.length())
				longest2 = value;			
		}
		
		System.out.println(longest2);	
		
		Stack<String> numbers = new Stack<>();
		numbers.push("1��");
		numbers.push("2��");
		numbers.push("3��");	
		int size = numbers.size();
		
		for(int i=0; i<size; i++) {
			//System.out.println(numbers.pop());
		}
		
		TreeSet<String> numbers9 = new TreeSet<>();
		numbers9.add("1��");
		numbers9.add("2��");
		numbers9.add("3��");
		numbers9.add("1��");
		numbers9.add("2��");
		
		Iterator<String> ir = numbers9.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
		System.out.println(numbers9.first());
		System.out.println(numbers9.last());
		
		HashMap<String, Integer> score = new HashMap<>();
		score.put("���繮", 70);
		score.put("�ѿ���", 99);
		score.put("�賲��", 99);
		score.put("�輺��", 97);
		score.put("Ȳ����", 88);
		
		Iterator<String> keySet = score.keySet().iterator();
		
		while(keySet.hasNext()) {
			String key = keySet.next();
			Integer value = score.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println("//");
		
		score.put("���繮", 80);
		
		keySet = score.keySet().iterator();
		
		while(keySet.hasNext()) {
			String key = keySet.next();
			Integer value = score.get(key);
			System.out.println(key + " : " + value);
		}
		
		System.out.println("//");
		
		for(String key : score.keySet()) {
			Integer value = score.get(key);
			System.out.println(key + " : " + value);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//for(String a : names) {
		//	//System.out.println(a);
		//}
		
		
	}
}
