package de.telekom.sea7.javaLangObjectQuest;

public class TestPersonClass {

	public static void main(String[] args) {
		
		// Creating 3 Test Person with own public static counter int
		Person person1 = new Person("Oliver", "Mustermann", 12, 10, 1970);
		Person person2 = new Person("Oliver", "Mustermann", 12, 10, 1970);
		Person person3 = new Person("Markus", "Mustermann", 11, 11, 1980);

		// Output of the 3 Test Person with use of my own toString Method
		System.out.println(" ");
		System.out.println("Existing person:");
		System.out.println("------------------------");
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		System.out.println("The next person you will create is Person: " + Person.counter);
		System.out.println("------------------------");
		System.out.println(" ");
		
		// Out of using of my own equalsMethod
		System.out.println("Some Checks of equals firstname:");
		System.out.println("------------------------");
		System.out.println(person1.equals(person2) + " -> Check person1 vs. person2");
		System.out.println("------------------------");
		System.out.println(person1.equals(person3) + " -> Check person1 vs. person3");
		System.out.println("------------------------");
		System.out.println(person2.equals(person3) + " -> Check person2 vs. person3");
		System.out.println("------------------------");
		System.out.println(" ");
		
		// Generating HashCodes for Persons along her Birthdate with own HashLogic
		int hashPerson1 = person1.myHashCode(1,12,10,1970);
		int hashPerson2 = person2.myHashCode(1,12,10,1970);
		int hashPerson3 = person3.myHashCode(1,11,11,1980);
		
		System.out.println("Generated Hashcodes for Persons with own logic");
		System.out.println("------------------------");
		System.out.println(hashPerson1);
		System.out.println(hashPerson2);
		System.out.println(hashPerson3);
		System.out.println("------------------------");
		System.out.println(" ");
		
		
		// Generating HashCodes with Standard Hashable
		int hashStandardPerson1 = person1.hashCode;
		int hashStandardPerson2 = person2.hashCode;
		int hashStandardPerson3 = person3.hashCode;
		
		System.out.println("Generated Hashcodes for Persons with Standard-Hash logic");
		System.out.println("------------------------");
		System.out.println(hashStandardPerson1);
		System.out.println(hashStandardPerson2);
		System.out.println(hashStandardPerson3);
		System.out.println("------------------------");
		System.out.println(" ");
		
	}

}
