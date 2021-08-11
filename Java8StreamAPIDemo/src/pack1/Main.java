package pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(1,2,4,5);
		
		// Map operation using streams
		
		// Map
		List<Integer> sqNumbers = numbers.stream().map(i->i*i).collect(Collectors.toList());
		
		System.out.println(sqNumbers);
		
		// Filter on String list
		List<String> nameList = Arrays.asList("Mg","Kg","Pg","Mk","Madan","Mohan","Ag","Tg","Dg","Cg");
		
		List<String> mNames = nameList.stream().filter(s-> s.startsWith("M")).collect(Collectors.toList());
		
		System.out.println(mNames);
		
		// Sort 
		List<String> sortedList = nameList.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedList);
		
		List<Integer> dupNumbers = Arrays.asList(1,2,4,5,2,2,2,1,1,5,4,5,4,1,2,5,4);
		
		Set<Integer> uniqueSquareNumbers = dupNumbers.stream().map(i-> i*i).collect(Collectors.toSet());
		
		System.out.println(uniqueSquareNumbers);
		
		//forEach
		dupNumbers.stream().forEach(x -> System.out.print(x + " "));
		
		System.out.println();
		
		// reduce 
		int sum = dupNumbers.stream().reduce(0,(ans,i)->ans+i);
		
		// for summing odd values only
		int oddSum = dupNumbers.stream().filter(x-> x%2!=0).reduce(0,(ans,i)->ans+i);
        
		System.out.println(sum);
		System.out.println(oddSum);
		
		
		List<Person> persons = new ArrayList<Person>();
		
		persons.add(new Person(101,20,"Mahesh","male"));
		persons.add(new Person(101,19,"Monika","female"));
		persons.add(new Person(103,25,"Mohan","male"));
		
		boolean isAllMale = persons.stream().allMatch(p-> p.getGender().equalsIgnoreCase("male"));
		System.out.println(isAllMale);
		
		boolean isAnyFemale = persons.stream().anyMatch(p-> p.getGender().equalsIgnoreCase("female"));
		System.out.println(isAnyFemale);
		boolean isTeen = persons.stream().anyMatch(p-> p.getAge() < 20);
		System.out.println(isTeen);
		
		boolean isMatch = persons.stream().noneMatch(p-> p.getpName().endsWith("hit"));
		System.out.println(isMatch);
		
		
//	Set<String> sortedNames = persons.stream().map(p-> p.getpName()).collect(Collectors.toCollection(TreeSet::new));
//		System.out.println(sortedNames);
		List<String> names = Arrays.asList("mg","","kg","pg","lg","");
		
		int count = (int) names.stream().filter(str -> str.isEmpty()).count();
		System.out.println(count);
		
		int count1 = (int) names.stream().filter(str -> !str.isEmpty()).count();
		System.out.println(count1);
		
		Random rand = new Random();
		rand.ints().limit(5).sorted().forEach(System.out :: println);
		
		List<Integer> numbers1 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		IntSummaryStatistics stats = numbers1.stream().mapToInt((x)->x).summaryStatistics();
        
		
		
		System.out.println("Highest number in List : " + stats.getMax());
		
		
	}

}
