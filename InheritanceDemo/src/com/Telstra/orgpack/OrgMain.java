package com.Telstra.orgpack;

import com.Telstra.emppack.Employee;
import com.Telstra.emppack.Manager;
import com.Telstra.emppack.Programmer;
import com.Telstra.taxpack.Tax;

public class OrgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Employee e1 = new Employee(101,"Nitin",50000);
		
		System.out.println(e1.getDetails());
		
		Manager m1 = new Manager(11,"Manan",100000,"Software Eng.",5);
		
		System.out.println(m1.getDetails());
		
		Programmer p1 = new Programmer(91,"Harshit",80000,5,"Python");
		
		System.out.println(p1.getDetails());
		
		Employee e = new Manager(21,"Manav",100000,"Software Quality Eng.",5);
		
		System.out.println(e.getDetails());
		// To get features of only manager specific functions the employee object 
		// will not work. We  need to downcast this to Manager reference to
		// get access to Manager specific functions.
		
		 Manager m = (Manager)e;
		System.out.println(m.getDepName());
		
		
		
		System.out.println("-----------------------------------------");
		
		// heterogeneous array
		
		Employee [] empArr = new Employee[4];
		
		empArr[0] = new Employee(901,"Rakesh",30000);
		empArr[1] = new Manager(902,"Madan",100000,"Reliability Eng.",5);
		empArr[2] = new Programmer(905,"Harish",80000,5,"Ruby");
		empArr[3] = new Programmer(907,"Hriday",70000,3,"JavaScript");
		
		for(Employee ee : empArr) {
			
			System.out.println(ee.getDetails() + ", Tax Details:" + Tax.calcTax(e));
			
		}
	}

}
