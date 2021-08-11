package mainpack;

import mathpack.MathOperation;
import threadpack.AddThread;
import threadpack.SubThread;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MathOperation op1 = new MathOperation();
		
		//MathOperation op2 = new MathOperation();
		
		//MathOperation op3 = new MathOperation();
		
		AddThread t1 = new AddThread(op1,"Thread 1");
		AddThread t2 = new AddThread(op1,"Thread 2");
		SubThread t3 = new SubThread(op1,"Thread 3");
		SubThread t4 = new SubThread(op1,"Thread 4");
		SubThread t5 = new SubThread(op1,"Thread 5");
		AddThread t6 = new AddThread(op1,"Thread 6");
		
		
	
	}

}
