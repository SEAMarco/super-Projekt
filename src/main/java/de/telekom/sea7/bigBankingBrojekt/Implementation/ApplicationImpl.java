package de.telekom.sea7.bigBankingBrojekt.Implementation;

import java.io.IOException;

import de.telekom.sea7.bigBankingBrojekt.Interfaces.Application;
import de.telekom.sea7.bigBankingBrojekt.Interfaces.MenuView;
import de.telekom.sea7.bigBankingBrojekt.Interfaces.ZahlungView;
import de.telekom.sea7.bigBankingBrojekt.Interfaces.Zahlungen;
import de.telekom.sea7.bigBankingBrojekt.Interfaces.ZahlungenView;

public class ApplicationImpl implements Application {

	private MenuView menuView = new MenuViewImpl();

		public void run(String[] args) throws Exception, IOException {
		menuView.menu();
	}

}
