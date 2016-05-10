import java.util.*;

public class Main {
	public static void main(String[] args){
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(new Person("Kyle", "Tommet"));
		people.add(new Person("John", "Doe"));
		

		
		for(Person p : people){
			System.out.println(p.displayFullName());
		}
	}
}
