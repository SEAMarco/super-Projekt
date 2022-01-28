package de.telekom.sea7.neuerTag;

import java.util.ArrayList;
import java.util.List;

public class ApplicationImpl implements Application {
	
	private	List model = new ArrayList(); // da eine Schnittstelle ist die Initialisierung notwendig
	
	// Ich kann beide Ipmplementierungs Views schnell auswechseln
	private View viewImpl = new ViewImpl2withPrefix();
	// private View viewImpl = new ViewImpl();
	
	public void run(String [] args) {
		
		model.add(new Zahlung());
		model.add(new Zahlung());
		model.add(new Zahlung());
		
		viewImpl.show(model);
		
		System.out.println("Erstes objektorientiertes Programm");
	}
}
