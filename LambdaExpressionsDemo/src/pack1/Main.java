package pack1;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathOperations add = (a,b) -> a + b;
		
		System.out.println(add.operation(10,20));
		
		MathOperations sub = (int a,int b) -> a - b;
		
		System.out.println(sub.operation(20,10));
		
		
		
		Circle c1 = new Circle("Red",5.6)
		{

			@Override
			public String paint() {
				// TODO Auto-generated method stub
				return ("Circle color is:" + color + " Radius:" + radius);
			}
			
		};
		System.out.println(c1.paint());
		
		
		CircleInterface cif = (c,r) -> 
		 { return ("Circle color is:" + c + " Radius:" + r);
		 };
		
		System.out.println(cif.paint("Red",3.5));

		
		EvenOddInterface eoi = n -> {
			  return (n%2 == 0 ? "Even No" : "Odd No");
		};
		System.out.println(eoi.isEvenOdd(19));
		
		isPrimeInterface ip = (n)-> {
			
			for(int i=2;i<=Math.sqrt(n);i++) {
				
				if(n%i == 0) return false;
			}
			
			return true;
		};
		
		System.out.println(ip.isPrime(6));
		
		
		// Method Reference 
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		
//		for(Integer n : numbers) {
//			System.out.println(n);
//		}
		
//		numbers.forEach((n) ->{
//			System.out.println(n);
//		});
		
		
		Consumer<Integer> func = (n) -> {
			System.out.println(n);
		};
		numbers.forEach(func);
		
		
		//Doesn't work here to find the sum like this
//		 int sum =0;
//		Consumer<Integer> add1 = (n)->{
//			 sum+=n;
//		};
//		numbers.forEach(add1);
//		System.out.println("..........................." + sum);
		
		GenericIF<Integer> gif = (n1,n2)-> n1 + n2;
		System.out.println(gif.add(12,10));
		
		
	}
	
//	public static int operate(int a,int b,MathOperations op) {
//		
//		
//	}
	

	


}
