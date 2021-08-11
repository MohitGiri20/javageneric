package comparatorpack;

import java.util.Comparator;

import ppack.Person;

public class NameComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		
	// Descending Order	
		
//	return o2.getName().compareToIgnoreCase(o1.getName());
	
	// Increasing Order
	
	return o1.getName().compareToIgnoreCase(o2.getName());
	
	}
	
	

}
