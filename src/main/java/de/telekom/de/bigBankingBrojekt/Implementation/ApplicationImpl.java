package de.telekom.de.bigBankingBrojekt.Implementation;

import java.io.IOException;

import de.telekom.de.bigBankingBrojekt.Interfaces.Application;
import de.telekom.de.bigBankingBrojekt.Interfaces.MenuView;
import de.telekom.de.bigBankingBrojekt.Interfaces.ZahlungView;
import de.telekom.de.bigBankingBrojekt.Interfaces.Zahlungen;
import de.telekom.de.bigBankingBrojekt.Interfaces.ZahlungenView;

public class ApplicationImpl implements Application {

	private MenuView menuView = new MenuViewImpl();

		public void run(String[] args) throws Exception, IOException {
		menuView.menu();
	}

}
