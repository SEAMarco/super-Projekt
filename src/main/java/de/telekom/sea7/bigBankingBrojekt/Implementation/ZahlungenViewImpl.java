package de.telekom.sea7.bigBankingBrojekt.Implementation;

import de.telekom.sea7.bigBankingBrojekt.Interfaces.Zahlung;
import de.telekom.sea7.bigBankingBrojekt.Interfaces.Zahlungen;
import de.telekom.sea7.bigBankingBrojekt.Interfaces.ZahlungenView;

public class ZahlungenViewImpl implements ZahlungenView {
	
	public void multiOutput(Zahlungen zahlungen) throws Exception {
		for (Object multiPayment : zahlungen) {
			Zahlung tempZahlung = (Zahlung) multiPayment;
			System.out.println(tempZahlung.getCounter() + " " + tempZahlung.getEmpfaenger() +
						      " " + tempZahlung.getBetrag() + tempZahlung.getWaehrung());
		}
	}

	/** abmanagen!!!!!
	 * 
	 
	public Zahlungen testZahlungen() {
		ZahlungImpl test1 = new ZahlungImpl("Test1", "DE1", "BIC1234", 100, "€", "Hundefutter", 0);
		ZahlungImpl test2 = new ZahlungImpl("Test2", "DE2", "BIC1234", 200, "€", "Hundefutter", 0);
		ZahlungImpl test3 = new ZahlungImpl("Test3", "DE3", "BIC1234", 300, "€", "Hundefutter", 0);
		Zahlungen zahlungen = new ZahlungenImpl();
		zahlungen.add(test1);
		zahlungen.add(test2);
		zahlungen.add(test3);
		return zahlungen;
	}
	*/

}
