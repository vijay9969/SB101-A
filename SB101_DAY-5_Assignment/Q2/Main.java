package day5.Q2;

import java.util.ArrayList;
import java.util.Collections;
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
		cities.add("Hyderabad");
		cities.add("Nashik");

       Collections.sort(cities, (a,b)-> a.compareTo(b));
       
       for(String city:cities) {
       System.out.println(city);
       }
		
	}

}
