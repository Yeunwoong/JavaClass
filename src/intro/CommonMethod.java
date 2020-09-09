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
			System.out.println("성인입니다.");
		else
			System.out.println("성인이 아닙니다.");
	}
}
