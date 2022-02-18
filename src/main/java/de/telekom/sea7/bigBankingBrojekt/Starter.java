package de.telekom.sea7.bigBankingBrojekt;

import java.io.IOException;

import de.telekom.sea7.bigBankingBrojekt.Implementation.ApplicationImpl;
import de.telekom.sea7.bigBankingBrojekt.Interfaces.Application;

/** Klasse ist vergleich mit einer .exe, sie startet das Programm
*   Zwecck: Direkter Einstieg in die Objektorientierung
*/
public class Starter {

	
	public static void main(String[] args) throws Exception, IOException {
		
		Application application = new ApplicationImpl();
		/** nach Ausführung der Methode run, befinden wir uns in der Objektorientierung */
		application.run(args);
	}

}