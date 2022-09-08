package day5.Q4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> cities = new ArrayList<>();
		cities.add("Pune");
		cities.add("Mumbai");
		cities.add("Chennai");
		cities.add("Delhi");
		cities.add("Bangalore");

		PrintList p = City ->{
			for(String city:City) {
				System.out.println(city);
			}
		};
		p.display(cities);
	}

}
