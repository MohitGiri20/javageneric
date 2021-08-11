package mathpack;

public class MathOperation {
	
	
	private int i=0;
	
	
	public synchronized void add(int n) {
		
		this.notify();
		i+=n;
		
		System.out.println("i value in addition: " + i);
	}
	
	public synchronized void subtract(int n) {
		
		if(i<=0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		i-=n;
		System.out.println("i value in subtraction: " + i);
	}
	
	

}
