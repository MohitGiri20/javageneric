package mainpack;

import java.util.ArrayList;

import java.util.Collections;

import comparatorpack.AgeComparator;
import comparatorpack.NameComparator;
import ppack.Person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Person> persons = new ArrayList<Person>();
		
		persons.add(new Person(101,86,"Mg"));
		persons.add(new Person(2,6,"Ag"));
		persons.add(new Person(89,22,"Pg"));
		persons.add(new Person(11,16,"kg"));
		
		Collections.sort(persons,new AgeComparator());
		System.out.println(persons);
		
		Collections.sort(persons,new NameComparator());
		
		System.out.println(persons);
	}

}
