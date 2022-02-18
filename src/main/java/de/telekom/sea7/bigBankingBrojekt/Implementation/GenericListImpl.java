package de.telekom.sea7.bigBankingBrojekt.Implementation;

import java.util.ArrayList;
import java.util.Iterator;

import de.telekom.sea7.bigBankingBrojekt.OutOfRangeException;
import de.telekom.sea7.bigBankingBrojekt.Interfaces.GenericList;

/** die Klasse bildet ein Template für Listen und dazugehörigen Methoden
*   <T> = Typ der generisch beim instanzieren der Klasse angegeben werden muss
*/
public class GenericListImpl<T> implements GenericList<T>, Iterable<T> {
	
	
	ArrayList<T> universalList = new ArrayList<T>();
	
	
	public void add(T placeholder) {
		universalList.add(placeholder);
	}
	

	public T get(int position) throws OutOfRangeException {
		if (universalList.size() < 0) {
			throw new OutOfRangeException("Das ist nicht möglich!");
		} else {
			return universalList.get(position);
		}
	}
			
	public int size() {
		return universalList.size();
	}
	
	public Iterator<T> iterator() {
		return universalList.iterator();
	}


	



		
	
	}

	
	


