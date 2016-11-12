package com.biprom.hydrofloors.demo;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;

@SpringView(name = ViewSubMain.VIEW_NAME)

public class ViewSubMain extends DesignSubMain implements View {
	
	protected static final String VIEW_NAME = "main";
	

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}

}
