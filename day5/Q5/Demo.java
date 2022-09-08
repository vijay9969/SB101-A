package day5.Q5;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> pr = new ArrayList<>();
		pr.add(new Product(1,"Iphone12",2,130000));
		pr.add(new Product(2,"Fold2",1,120000));
		pr.add(new Product(3,"Iphone14",3,140000));
		pr.add(new Product(4,"Note20",5,110000));
		pr.add(new Product(5,"One+6",10,70000));
		
		Intrs X = (a,b) -> a.getPrice()>b.getPrice();
		for(Product product:pr) {
		System.out.println(product);
		}

	}

}
