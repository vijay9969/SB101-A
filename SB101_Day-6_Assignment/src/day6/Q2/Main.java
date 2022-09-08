package day6.Q2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<String> c1 = s ->System.out.println(s);
		c1.accept("This is Consumer");
		
		Function<String, Integer> number = num -> Integer.parseInt(num);
		System.out.println(number.apply("100")+100);
		
		Predicate<Integer> age = Age -> Age>=18&&Age<=60;
		System.out.println(age.test(30));
		
		Supplier<String> data = () -> "Hello I am Supplier";
		
		System.out.println(data.get());
	}

}
