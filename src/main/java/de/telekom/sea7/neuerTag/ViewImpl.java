package de.telekom.sea7.neuerTag;

import java.util.List;

public class ViewImpl implements View {

	@Override
	public void show(List model) {
		for(Object object : model) {
			System.out.println(object);
		}
		
	}

}
