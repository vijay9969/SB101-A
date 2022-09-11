package day7.Q2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> list = new ArrayList<>();
		
		list.add(new Student(1,"Vijay",700));
		list.add(new Student(2,"Saurabh",750));
		list.add(new Student(3,"Sumit",800));
		list.add(new Student(4,"Rohit",600));
		list.add(new Student(5,"Akash",900));
		
		Student s = list.stream().max((a,b)->{
			return a.getMarks()>b.getMarks()? +1:-1;
		}).get();
		System.out.println(s);
	}

}
