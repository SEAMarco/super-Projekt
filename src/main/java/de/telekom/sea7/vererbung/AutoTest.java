package de.telekom.sea7.vererbung;

public class AutoTest {
	
	// Ist die Testklasse für die Beispiele aus dem Unterricht

	public static void main(String[] args) {
		
		Program program = new Program(); // neue Kugel
		program.run(args); // spring in die Kugel rein
		
		
		
		Auto auto = new Auto(null, 1);
		System.out.println(auto.getId());
		auto.setId(7);
		System.out.println(auto.getId());
		System.out.println(auto.toString());
			
	}

}
