package intro;

public class CommonMethod {
	static void check(Person person) {
		boolean adult = false;
		if(person.country.equals(Constant.USA)) {
			if(person.age >= Constant.Threshold_USA)
				adult = true;
		} else if(person.country.equals(Constant.KOR)) {
			if(person.age >= Constant.Threshold_KOR)
				adult = true;
		}
		
		if(adult)
			System.out.println("�����Դϴ�.");
		else
			System.out.println("������ �ƴմϴ�.");
	}
}
