package day7.Q4;


import java.util.TreeSet;
import java.util.stream.Stream;

import day7.Q2.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s1 = new Student(1,"vijay",100);

		TreeSet<Student> list = new TreeSet<>();
		
		list.add(new Student(1,"Vijay",400));
		list.add(new Student(2,"Saurabh",750));
		list.add(new Student(1,"Vijay",400));
		list.add(new Student(3,"Sumit",450));
		list.add(new Student(4,"Rohit",300));
		list.add(new Student(5,"Akash",450));

		for(Student s: list) {
			System.out.println(s);
		}
		System.out.println("-----------------------------");
		Stream<Student> out = list.stream().filter((a)->{
			return a.getMarks()<500;
		});
		
		out.forEach(a->System.out.println(a));
	}

}
