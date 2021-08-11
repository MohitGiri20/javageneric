
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// boxing
		int i = 1;
		Integer iob = new Integer(i);
        
		System.out.println(iob);
		
		int str =new Integer("767");
		System.out.println(str);
		
		// unboxing
		
		int uob = iob;
		System.out.println(uob);
		
		//Autoboxing
		
		int ig = Integer.parseInt("765");
		System.out.println(ig);
		
		String str1 = Integer.toString(8989);
		System.out.println(str1);
	}

}
