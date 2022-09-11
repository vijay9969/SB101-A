package day7.Q2;

public class Student implements Comparable<Student> {
	
	private int StudentId;
	private String studentName;
	private int marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int marks) {
		// TODO Auto-generated constructor stub
		this.setStudentId(id);;
		this.setStudentName(name);
		this.setMarks(marks);
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", studentName=" + studentName + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
//		System.out.println("compareTO---------------");
		
		int m1 = s.getMarks();
		int m2 = this.getMarks();
		String n1 = s.getStudentName();
		String n2 = this.getStudentName();
		int i1 = s.getStudentId();
		int i2 = this.getStudentId();
		if(m1==m2&&i2==i1&&n1.equals(n2)) {
			return 0;
		}else {
			if(m1>m2) {
				return +1;
			}else if(m1<m2){
				return -1;
			}else {
				if(i1>i2) {
					return +1;
				}else if(i1<i2) {
					return -1;
				}else {
					return n1.compareTo(n2);
				}
			}
		}
		
	}
	
	
	
	

}

