package lambda;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {
	
	public static void main(String[] args) {
		
		List<Person> personList = ComparatorLambda.createShortList();
		
		// Sort with innet class
		Collections.sort(personList, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getSurName().compareTo(o2.getSurName());
			}
		});
		
		for(Person p : personList){
			p.printName();
		}
		
		// Using lambda instead
		System.out.println("===  Sorted Asc SurName ===");
		Collections.sort(personList, 
			(Person p1, Person p2) -> p1.getSurName().compareTo(p2.getSurName())
		);
		
		for(Person p : personList){
			p.printName();
		}

		// Desc
		System.out.println("===  Sorted Desc SurName ===");
		Collections.sort(personList, (Person p1, Person p2) -> p2.getSurName().compareTo(p1.getSurName()));
		
		for(Person p : personList){
			p.printName();
		}
		
	}
	
	
	public static List<Person> createShortList() {
		return Arrays.asList(new Person("Romildo"), new Person("Camila"), new Person("Guilherme"), new Person("Miguel"));
	}

}
