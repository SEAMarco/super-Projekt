package de.telekom.de.bigBankingBrojekt.Interfaces;

import java.util.Iterator;

import de.telekom.de.bigBankingBrojekt.OutOfRangeException;

public interface GenericList<T> extends Iterable<T> {
	
	void add (T placeholder);
	
	T get (int position)throws OutOfRangeException;
	
	int size();
	
	Iterator<T> iterator();
	
	
	
	
	
}
