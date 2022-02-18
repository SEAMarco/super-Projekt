package de.telekom.sea7.bigBankingBrojekt.Interfaces;

import java.util.Iterator;

import de.telekom.sea7.bigBankingBrojekt.OutOfRangeException;

public interface GenericList<T> extends Iterable<T> {
	
	void add (T placeholder);
	
	T get (int position)throws OutOfRangeException;
	
	int size();
	
	Iterator<T> iterator();
	
	
	
	
	
}
