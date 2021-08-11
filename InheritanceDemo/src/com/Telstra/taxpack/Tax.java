package com.Telstra.taxpack;

import com.Telstra.emppack.*;

public class Tax {
	
	
	public static double calcTax(Employee e) {
		
		if( e instanceof Manager) {
			
			Manager m = (Manager) e;
			return 15000.0;
		}
		else if(e instanceof Programmer) {
			
			Programmer p = (Programmer) e;
			return 10000.0;
		}
		else {
			return 500.0;
		}
	}

}
