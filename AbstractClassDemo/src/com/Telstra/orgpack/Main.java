package com.Telstra.orgpack;

import com.Telstra.emppack.Employee;
import com.Telstra.emppack.Manager;
import com.Telstra.emppack.Programmer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		  Manager m1 = new Manager(200,"Harish",60000,"Finance",5);
		 System.out.println(m1.getDetails()+"  Net Salary "+m1.caclNetSal());
		 
		 Programmer p1 = new Programmer(300,"Girish",50000,3,"Java");
		 System.out.println(p1.getDetails()+"   Net Salary  "+p1.caclNetSal());
		 
	     Employee em = new Manager(300,"Karish",50000,"Tech",5);
		 
		 System.out.println(em.getDetails());
	      
		 Manager m = new Manager(300,"Karish",50000,"Tech",5);
		 
		 System.out.println(m.getDetails());

		 Employee[]  emparr = new Employee[4];
			emparr[0] = new Programmer(101,"Dileep",40000,5,"JS");
			emparr[1] = new Manager(201,"Kamal",50000,"RD",5);
			emparr[2]=  new Programmer(301,"Ravi",50000,4,".NET");
			emparr[3]=  new Manager(201,"Vinay",60000,"HR",5);
			
			System.out.println("Printing the details of the employees");
			
			 for (Employee e:emparr)
			 {
				 System.out.print(e.getDetails());
				 if (e instanceof Programmer)
				 {
					 Programmer p = (Programmer)e;
					 System.out.println("   "+p.caclNetSal());
				 }
				 
				 System.out.println();
				 
			 }
	}

}
