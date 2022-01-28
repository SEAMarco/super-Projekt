package de.telekom.sea7.klassenUebung;

public class Punkt {
		
	private int x  ;
	private int y  ;
	
	
	/* Die Standard-Methode aus Object.class wird durch unsere Methode ersetzt
	// --------------
	public Object() {}
     // --------------
	*/
	
	// eigener Constructor
	public Punkt() {
		x = 5;
		y = 5;
	}
	
	

	/* Die Standard-Methode aus Object.class wird durch unsere Methode ersetzt
	// --------------
    public boolean equals(Object obj) {
        return (this == obj);
    }
    // --------------
	*/
	

    public boolean equals(Punkt anderePunkt) {
        if (this.x == anderePunkt.x &&
        		this.y == anderePunkt.y) {
        	System.out.println("Der Punkt liegt auf der gleichen Stelle");
        	return true; 
        } else { 
        	System.out.println("Der Punkt liegt auf einer anderen Stelle");
        	return false;
        }
    }
	
    
    /* Die Standard-Methode aus Object.class wird durch unsere Methode ersetzt
	// --------------
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
        }
    // --------------
	*/
	
    public String toString() {
    	return String.format("x %d y %d",x, y);
    }
    
	
    
    
    
    // Get- und Set-Methoden
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
}