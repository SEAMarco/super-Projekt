package de.telekom.sea7.bigBankingBrojekt.Implementation;

import java.io.IOException;
import java.util.Scanner;

import de.telekom.sea7.bigBankingBrojekt.Interfaces.MenuView;
import de.telekom.sea7.bigBankingBrojekt.Interfaces.ZahlungView;
import de.telekom.sea7.bigBankingBrojekt.Interfaces.Zahlungen;
import de.telekom.sea7.bigBankingBrojekt.Interfaces.ZahlungenView;
import de.telekom.sea7.bigBankingBrojekt.repository.IbansRepository;
import de.telekom.sea7.bigBankingBrojekt.repository.ZahlungenRepository;

public class MenuViewImpl implements MenuView {

	private ZahlungView zahlungView = new ZahlungViewImpl();
	private ZahlungenView zahlungenView = new ZahlungenViewImpl();
	private Zahlungen zahlungen = new ZahlungenImpl();

	public void menu() throws Exception {
		String eingabe = "";
		Scanner scanner = new Scanner(System.in);
		/** Scanner für Eingabe geöffnet */

		while (!eingabe.equals("exit")) {
			System.out.println("");
			System.out.println(
					"Bitte gib eine Aktion ein (z.B. show, showAll, exportAll, importAll, DBauslesen, DBeinfuegen, ibanDBeinfuegen, mariaDB, exit)");
			eingabe = scanner.nextLine();

			switch (eingabe) {
			case "show":
				System.out.println(
						"Du hast dich für die Anzeige einer Überweisung entschieden. gib bitte die Position an: \n ");
				int input = scanner.nextInt();
				System.out.println(zahlungView.detailOutput(zahlungen, input));
				break;
			case "showAll":
				System.out.println("Du hast dich für die Übersicht aller Überweisung entschieden. Hier bitte: \n ");
				zahlungenView.multiOutput(zahlungen);
				break;
			case "exportAll":
				System.out.println("Ihre Daten wurden erfolgreich in einer externen Datei gespeichert.  \n ");
				zahlungen.multiExport(zahlungen);
				break;
			case "importAll":
				System.out.println("Deine Daten wurden aus einer Datei importiert. \n ");
				zahlungen.multiImport();
				break;
			case "ibanDBeinfuegen":
				System.out.println("einen neuen Datensatz in der DB anlegen: \n ");
				IbansRepository ibanRepository1 = new IbansRepository(null);
				ibanRepository1.ibansDBeinfügen();
				break;
			case "DBeinfuegen":
				System.out.println("einen neuen Datensatz in der DB anlegen: \n ");
				ZahlungenRepository zahlRepository1 = new ZahlungenRepository(null);
				zahlRepository1.zahlungenDBeinfügen();
				break;
			case "DBauslesen":
				System.out.println("Hier wird dir der Inhalt der Datenbank angezeigt: \n ");
				ZahlungenRepository zahlRepository = new ZahlungenRepository(null);
				zahlRepository.auslesen(3);
				break;
			case "ibanDBauslesen":
				System.out.println("Hier wird dir der Inhalt der Datenbank angezeigt: \n ");
				IbansRepository ibansRepository = new IbansRepository(null);
				ibansRepository.auslesen(3);
				break;
			/*
			 * case "Datensatz loeschen": System.out.
			 * println("Hier wird der Datensatz zu einer bestimmten id_zahlung geloescht. \n "
			 * ); IbansRepository ibansRepository = new IbansRepository(null);
			 * ZahlungenRepository zahlRepository2 = new ZahlungenRepository(null);
			 * zahlRepository2.zahlungenDBauslesen(7);
			 * zahlRepository2.zahlungenDBloeschen(7); break;
			 */
			case "exit":
				System.out.println("Schön, dass du da warst. Tschüss \n ");
				scanner.close(); /** !!!Scanner für Eingabe bis zum Neustart des Programms geschlossen */
			}
		}
	}

}
