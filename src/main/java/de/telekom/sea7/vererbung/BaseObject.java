package de.telekom.sea7.vererbung;

public class BaseObject {

	private int id;
	private Object parent;
	
	// eigenerConstructor 
	public BaseObject(Object parent, int id ) {
		this.parent = parent;
		this.id = id;
		
	} 
		
	// Soll den Namen der aktuellen Klasse (BaseObject) zurückgeben und 
	// die Klasse in der nächsten Ebene aufrufen, 
	// da die Object.class aber den Namen nicht hat, 
	// ist es deshalb fest ausgeschrieben
	
	public String classnameList() {
		return "BaseObject.class -> " + "Object.class" /* super.getClass() */;
	}
		
	
	// GetParent-Methode
	public Object getParent() {
		return parent;
	}
	
		
	// GetId-/SetId-Methoden
	public void setId( int id ) {
		// setzt ID in der BaseObject Klasse
		this.id = id;
	}
	
	public int getId() {
		// Rückgabe der ID aus der BaseObject-Klasse
		return this.id;
	}
			
}
