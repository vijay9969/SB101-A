package day7.Q3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(9);
		list.add(7);
		list.add(28);
		list.add(34);
		list.add(3);
		
		List<Integer> newlist = list.stream().map(a ->{
			return a*a;
		}).collect(Collectors.toList());
		
		newlist.forEach(a->System.out.println(a));
	}

}
