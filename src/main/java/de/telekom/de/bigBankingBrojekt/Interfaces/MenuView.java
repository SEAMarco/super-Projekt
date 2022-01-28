package de.telekom.de.bigBankingBrojekt.Interfaces;

import java.io.IOException;

public interface MenuView {
	/** Methode um das Menü auszugeben, Menüauswahl des Useres auszuwerten 
	*   und die entsp. Methoden hinter der Auswahl zu sarten
	*/
	void menu() throws IOException, Exception;
	
}
