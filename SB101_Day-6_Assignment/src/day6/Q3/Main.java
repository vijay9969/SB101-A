package day6.Q3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import java.util.TreeSet;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Student> hm = new HashMap<>();
		hm.put("Delhi", new Student(1,"Sumit","sumitshide@gmail.com",780));
		hm.put("Pune", new Student(2,"Vijay","handalvijay@gmail.com",770));
		hm.put("Bangalore", new Student(3,"Saurabh","saurabhsuryawanshi@gmail.com",870));
		hm.put("Chennai", new Student(1,"Rohit","rohitkamthe@gmail.com",700));
		hm.put("kolkata", new Student(1,"Akash","akshkamthe@gmail.com",800));
		
		
		Sort output = map ->{
//			Comparator<Map.Entry<String, Student>> com = (a1,a2)->{
//				return a1.getValue().name.compareTo(a2.getValue().name);
//			};
//			
//			Set<Map.Entry<String,Student>> set = map.entrySet();
//			
//			Set<Map.Entry<String,Student>> tset = new TreeSet<>(com);
//			tset.addAll(set);
//			
//			LinkedHashMap<String, Student> link = new LinkedHashMap<>();
//			
//			for(Map.Entry<String, Student> m: tset) {
//				link.put(m.getKey(), m.getValue());
//			}
//			
//			return link;
			
			Comparator<Map.Entry<String, Student>> com = (a,b)->{
				return a.getValue().name.compareTo(b.getValue().name);
			};
			
			Set<Map.Entry<String, Student>> eset = map.entrySet();
			
			Set<Map.Entry<String, Student>> Tree = new TreeSet<>(com);
			Tree.addAll(eset);
			
			LinkedHashMap<String, Student> link = new LinkedHashMap<>();
			
			for(Map.Entry<String, Student> T:Tree) {
				  link.put(T.getKey(), T.getValue());
			}
			return link;
		};

		Map<String,Student> out = output.sortMapUsingStudentName(hm);
//		ArrayList<String> keyList = new ArrayList<String>(out.keySet());
//		
//		ArrayList<Student> valueList = new ArrayList<Student>(out.values());
//		
//		for(int i=0;i<keyList.size();i++) {
//		System.out.println(keyList.get(i)+" "+valueList.get(i));
//		}
		
		Sort print = map ->{
			ArrayList<String> keyList = new ArrayList<String>(map.keySet());
			
			ArrayList<Student> valueList = new ArrayList<Student>(map.values());
			
			for(int i=0;i<keyList.size();i++) {
			System.out.println(keyList.get(i)+" "+valueList.get(i));
			}
			return map;
		};
		print.sortMapUsingStudentName(out);
		
	}

}
