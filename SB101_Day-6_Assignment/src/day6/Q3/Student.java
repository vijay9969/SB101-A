package day6.Q3;

public class Student {
	
	int roll;
	String name;
	String email;
	int marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student(int roll, String name, String email, int marks) {
		// TODO Auto-generated constructor stub
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", email=" + email + ", marks=" + marks + "]";
	}
	



}
