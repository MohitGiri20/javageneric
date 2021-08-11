package comparatorpack;

import java.util.Comparator;

import ppack.Person;

public class AgeComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		
		if(o1.getAge() < o2.getAge()) return -1;
		
		if(o1.getAge() == o2.getAge())
		
		return 0;
		
		else return 1;
	}
	
	
	

}
