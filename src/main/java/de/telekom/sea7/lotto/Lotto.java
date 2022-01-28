package de.telekom.sea7.lotto;

import java.util.Arrays;

public class Lotto {
	private int speicherposition = 0;
	private int[] lottozahlen = new int[7];

	public int getLottozahl(int position) {
		if (position > 6 || position <= 0) {
			System.out.println("Es können nur die Positionen von 1 - 7 abgerufen werden!");
		} else {
			position = position -1;
			System.out.println("ausgegebene Zahl: " + lottozahlen[position]);
			return lottozahlen[position];
		}
		return 0;
	}

	public void setLottozahlen(int lottozahl) {
		if (lottozahl < 1 || lottozahl > 49) {
			System.out.println("Nur Werte zwischen 1 und 49 sind gueltig");
		} else {
			if (speicherposition > 6) {
				System.out.println("Es duerfen nur 7 Zahlen angekreuzt werden!");
			} else {
				this.lottozahlen[speicherposition] = lottozahl;
				speicherposition++;
			}
		}
	}

	//Methode zum Ausgeben der Länge des Arrays
		public void ausgebenLaenge () {
		System.out.println("Die Länge des Arrays ist: " + lottozahlen.length);
		}
	
		// Methode um herauszufinden ob die Zahl gerade oder ungerade ist
		public void geradeUngerade () {
			for (int i = 0; i < lottozahlen.length; i++) {
			if ((lottozahlen[i] % 2)== 0) {
			System.out.println("Ich bin eine gerade Zahl!");
			}else {
			System.out.println("Ich bin eine ungerade Zahl!");
			}
		}
		}
		
		
	public void ausgabeLottoschein() {
		for (int i = 0; i < lottozahlen.length; i++) {
			System.out.println(lottozahlen[i]);
		}
	}


	public void auswertungLottoschein() {
    	
		Lottogesellschaft lottogesellschaft = new Lottogesellschaft();
		int richtigeZahlen = 0;
    	
		
        for (int i = 0; i < lottozahlen.length; i++) {
        	if (lottozahlen[i] == lottogesellschaft.getZiehungSamstag(0)) {
        		richtigeZahlen = richtigeZahlen + 1;
        		System.out.println("Deine " + (i+1) + ". Zahl war ein Treffer.");
        	} else {
        		// keine Aktivität notwendig
        	}    		
    		
    	}
        for (int i = 0; i < lottozahlen.length; i++) {
        	if (lottozahlen[i] == lottogesellschaft.getZiehungSamstag(1)) {
        		richtigeZahlen = richtigeZahlen + 1;
        		System.out.println("Deine " + (i+1) + ". Zahl war ein Treffer.");
        	} else {
        		// keine Aktivität notwendig
        	}    		
    		
    	}
        for (int i = 0; i < lottozahlen.length; i++) {
        	if (lottozahlen[i] == lottogesellschaft.getZiehungSamstag(2)) {
        		richtigeZahlen = richtigeZahlen + 1;
        		System.out.println("Deine " + (i+1) + ". Zahl war ein Treffer.");
        	} else {
        		// keine Aktivität notwendig
        	}    		
    		
    	}
        
        for (int i = 0; i < lottozahlen.length; i++) {
        	if (lottozahlen[i] == lottogesellschaft.getZiehungSamstag(3)) {
        		richtigeZahlen = richtigeZahlen + 1;
        		System.out.println("Deine " + (i+1) + ". Zahl war ein Treffer.");
        	} else {
        		// keine Aktivität notwendig
        	}    		
    		
    	}
        
        for (int i = 0; i < lottozahlen.length; i++) {
        	if (lottozahlen[i] == lottogesellschaft.getZiehungSamstag(4)) {
        		richtigeZahlen = richtigeZahlen + 1;
        		System.out.println("Deine " + (i+1) + ". Zahl war ein Treffer.");
        	} else {
        		// keine Aktivität notwendig
        	}    		
    		
    	}
        
        for (int i = 0; i < lottozahlen.length; i++) {
        	if (lottozahlen[i] == lottogesellschaft.getZiehungSamstag(5)) {
        		richtigeZahlen = richtigeZahlen + 1;
        		System.out.println("Deine " + (i+1) + ". Zahl war ein Treffer.");
        	} else {
        		// keine Aktivität notwendig
        	}    		
    		
    	}
        
        for (int i = 0; i < lottozahlen.length; i++) {
        	if (lottozahlen[i] == lottogesellschaft.getZiehungSamstag(6)) {
        		richtigeZahlen = richtigeZahlen + 1;
        		System.out.println("Deine " + (i+1) + ". Zahl war ein Treffer.");
        	} else {
        		// keine Aktivität notwendig
        	}    		
    		
    	}
        
        System.out.println("Insgesamt hast du " + richtigeZahlen + " Übereinstimmungen");
                
    }
	

	
	
}
