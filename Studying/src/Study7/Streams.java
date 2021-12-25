package Study7;

import java.util.Arrays;
import java.util.List;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Double> list = Arrays.asList(1.1,2.2,5.5,0.6);
		
		for (Double temp: list) {
			System.out.println(temp+  "  ");
		}
		System.out.println("------------------------");
		
		list.forEach(x -> System.out.println(x + ""));
		System.out.println("--------------");
		
		list.stream().sorted().forEach(System.out::print);
		
		System.out.println("-----tream double---sorte stream ");
		
		list.stream().sorted().filter(x -> x > 1).forEach(System.out::println);  //lamda impression will get the numbers greater than 1
		
		
		
		
		

	}

}
