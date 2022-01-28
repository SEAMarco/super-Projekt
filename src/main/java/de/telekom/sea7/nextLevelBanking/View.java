package de.telekom.sea7.nextLevelBanking;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
	// CONTENTS
	// - menu
	// - output methods
	// - methods to create a new transaction
	// - ArrayList for saving multiple single transactions
	
	ArrayList<Object> banking = new ArrayList<>();

	private VorlageUeberweisung vorlageUeberweisung;

	// menu
	public void menu() {
		String eingabe = "";
		Scanner scanner = new Scanner(System.in);

		while (!eingabe.equals("exit")) {
			System.out.println("");
			System.out.println("Bitte gib eine Aktion ein (z.B. show, showAll, exit, input, testDataGen)");
			eingabe = scanner.nextLine();

			switch (eingabe) {
			case "show":
				System.out.println("Du hast dich für die Anzeige einer Überweisung entschieden. Hier bitte: \n ");
				ausgeben();
				break;
			case "input":
				eingeben();
				break;
			case "showAll":
				allesAusgeben();
				break;
			case "testDataGen":
				testDatenHinzufuegen();
				break;	
			case "exit":
				System.out.println("Schön, dass du da warst. Tschüss \n ");
				scanner.close();
			}

		}

	}

	// menu added methods
	public void ausgeben() {
		System.out.println("Empfänger: " + vorlageUeberweisung.getEmpfaenger() + "\nIBAN Empfänger: "
				+ vorlageUeberweisung.getEmpfaengerIban() + "\nBIC Empfänger: " + vorlageUeberweisung.getEmpfaengerBic()
				+ "\nBetrag: " + vorlageUeberweisung.getBetrag() + " " + vorlageUeberweisung.getWaehrung()
				+ "\nVerwendungszweck: " + vorlageUeberweisung.getVerwendungszweck());
	}

	public void eingeben() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bitte gib einen Empfänger an:");
		String eingabeEmpfaenger = scanner.nextLine();

		System.out.println("Bitte gib eine IBAN an:");
		String eingabeIban = scanner.nextLine();

		System.out.println("Bitte gib eine BIC an:");
		String eingabeBic = scanner.nextLine();

		System.out.println("Bitte gib einen Betrag an:");
		String eingabeBetrag1 = scanner.nextLine();
		double eingabeBetrag = Double.parseDouble(eingabeBetrag1);

		System.out.println("Bitte gib die Währung an:");
		String eingabeWaehrung = scanner.nextLine();

		System.out.println("Bitte gib den Verwendungszweck an:");
		String eingabeZweck = scanner.nextLine();

		VorlageUeberweisung sTm = new VorlageUeberweisung(eingabeEmpfaenger, eingabeIban, eingabeBic, eingabeBetrag,
				eingabeWaehrung, eingabeZweck);
		banking.add(sTm); // Hinzufügen der neu erzeugten Transaktion in die ArrayList

		System.out.println("");
		System.out.println("Zur Kontrolle, hier deine eigegebenen Daten:");

		System.out.println("Empfänger: " + sTm.getEmpfaenger() + "\nIBAN Empfänger: " + sTm.getEmpfaengerIban()
				+ "\nBIC Empfänger: " + sTm.getEmpfaengerBic() + "\nBetrag: " + sTm.getBetrag() + " "
				+ sTm.getWaehrung() + "\nVerwendungszweck: " + sTm.getVerwendungszweck());
		scanner.close();
	}

	// Ausgabe aller vom User erstellten Transaktionen die sich in der ArrayList
	// befinden
	public void allesAusgeben() {
		for (Object ausgabe : banking) {
			System.out.println(ausgabe);
		}
	}

	public void testDatenHinzufuegen() {
		VorlageUeberweisung testdaten1 = new VorlageUeberweisung("Empfaenger_1", "DE12TESTIBAN111", "BIC111", 10.5, "€", "Verwendung_1");
		banking.add(testdaten1);
		VorlageUeberweisung testdaten2 = new VorlageUeberweisung("Empfaenger_2", "DE12TESTIBAN222", "BIC222", 11.5, "€", "Verwendung_2");
		banking.add(testdaten2);
		VorlageUeberweisung testdaten3 = new VorlageUeberweisung("Empfaenger_3", "DE12TESTIBAN333", "BIC333", 12.5, "€", "Verwendung_3");
		banking.add(testdaten3);
	}
	
	public VorlageUeberweisung getsT() {
		return vorlageUeberweisung;
	}

	public void setsT(VorlageUeberweisung vorlageUeberweisung) {
		this.vorlageUeberweisung = vorlageUeberweisung;
	}

}
