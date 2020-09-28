package intro;

public class Class_Two {
	public static void main(String[] args) {
		int max = CommonMethod.getMax(CommonMethod.getMax(1,3),2);
		System.out.println("MAX: " + max);
		
		Subject subject = new Subject("java", 80);
		Student2 student = new Student2("Woong", 1, subject);
		student.setReRe(true);
		subject.setGrade(student);
		
		
	}
}

class Subject {
	private String subjectName;
	private int score;
	private String grade;
	Subject(String subjectName, int score){
		this.subjectName = subjectName;
		this.score = score;
	}
	public String getGrade() {
		return grade;
	}
	public int getScore() {
		return score;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	void setGrade(Student2 student) {
		if(score>=80) {
			if(student.getReRe())
				this.grade = "A";
			else
				this.grade = "A+";
		}			
		if(score>=60)
			this.grade = "A";
		else
			this.grade = "B+";
	}	
}

class Student2 {
	private String studentName;
	private int studentNumber;
	private Subject subject;
	private boolean reRe;
	
	public boolean getReRe() {
		return reRe;
	}
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public boolean isReRe() {
		return reRe;
	}

	public void setReRe(boolean reRe) {
		this.reRe = reRe;
	}

	public Student2(String studentName, int studentNumber, Subject subject) {
		this.studentName = studentName;
		this.studentNumber = studentNumber;
		this.subject = subject;
	}
	
	public Student2(String studentName, int studentNumber, Subject subject, boolean reRe) {
		this.studentName = studentName;
		this.studentNumber = studentNumber;
		this.subject = subject;
		this.reRe = reRe;
	}
}





