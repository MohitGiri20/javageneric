package threadpack;



import mathpack.MathOperation;

public class AddThread implements Runnable{
	
	
	private MathOperation op ;
	private Thread t;
	
//
//	ThreadClass1 tob1= new ThreadClass1();
//	
//	Thread t1 = new Thread(tob1);
//	t1.setName("Thread 1");

	public AddThread(MathOperation op, String threadName) {
		super();
		this.op = op;
		this.t = new Thread(this);
		this.t.setName(threadName);
		this.t.start();
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		op.add(5);
		//System.out.println(Thread.currentThread().getName());
		
	}

}
