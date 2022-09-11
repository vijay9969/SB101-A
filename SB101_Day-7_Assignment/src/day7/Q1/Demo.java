package day7.Q1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product(1,"Nike",5000,10));
		list.add(new Product(2,"Adidas",3000,5));
		list.add(new Product(3,"Reebok",4000,50));
		list.add(new Product(4,"Puma",2000,75));
		list.add(new Product(5,"Fila",10000,15));
		
		List<Product> p  = list.stream().filter(Prod ->{
			return Prod.getQuantity()>10;
		}).sorted((p1,p2)->p1.getPrice()>p2.getPrice()? +1:-1)
				.collect(Collectors.toList());
		
		
		
		list.forEach(l->{System.out.println(l);});
		System.out.println("-----------------------------------");
		
		
		p.forEach(P->{System.out.println(P);});
		
		
	}

}
