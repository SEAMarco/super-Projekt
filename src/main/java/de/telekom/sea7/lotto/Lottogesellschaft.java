package de.telekom.sea7.lotto;

public class Lottogesellschaft {

	private int[] ziehungSamstag = { 7, 9, 11, 23, 25, 32, 48 };

	public int getZiehungSamstag(int position) {
		return ziehungSamstag[position];
	}
	
	// noch nicht funktionsfähig
	public void auszahlungGewinn(int gewinn) {
		System.out.println("Du bekommst " + gewinn + " Euro");
		gewinn = gewinn / 200;
		System.out.println("Das entspricht " + (gewinn = gewinn % 200) + "->  2 Euro Münzen");
		System.out.println("Das entspricht " + (gewinn = gewinn/100 % 100) + "->  1 Euro Münzen");
		System.out.println("Das entspricht " + (gewinn = gewinn/50  %  50) + "-> 50 Cent Münzen");
		System.out.println("Das entspricht " + (gewinn = gewinn/20  %  20) + "-> 20 Cent Münzen");
		System.out.println("Das entspricht " + (gewinn = gewinn/10  %  10) + "-> 10 Cent Münzen");
		System.out.println("Das entspricht " + (gewinn = gewinn/5   %   5) + "->  5 Cent Münzen");
		System.out.println("Das entspricht " + (gewinn = gewinn/2   %   2) + "->  2 Cent Münzen");
		System.out.println("Das entspricht " + (gewinn = gewinn/1   %   1) + "->  1 Cent Münzen");
	}

}
