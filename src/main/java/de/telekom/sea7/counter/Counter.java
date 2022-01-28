package de.telekom.sea7.counter;

public class Counter {
	
	private static int count;
	
	public Counter() {
		
		System.out.println( this.getClass() + " -- Du hast die ID " + count + " bekommen");
		count ++;
		
	}

}
