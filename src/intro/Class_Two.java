package intro;

public class Class_Two {
	public static void main(String[] args) {
		int max = CommonMethod.getMax(CommonMethod.getMax(1,3),2);
		System.out.println("MAX: " + max);
		
		Subject subject = new Subject("java", -1);
		Student student = new Student("Woong", 1, subject);
		student.subject.setGrade(CommonMethod.getGrade(subject));		
		System.out.println(student.subject.grade);
	}
}

class Subject {
	String subjectName;
	int score;
	String grade;
	Subject(String subjectName, int score){
		this.subjectName = subjectName;
		this.score = score;
	}
	void setGrade(String grade) {		
		this.grade = grade;
	}	
}

class Student {
	String studentName;
	int studentNumber;
	Subject subject;
	boolean reRe;
	public Student(String studentName, int studentNumber, Subject subject) {
		this.studentName = studentName;
		this.studentNumber = studentNumber;
		this.subject = subject;
	}
}





