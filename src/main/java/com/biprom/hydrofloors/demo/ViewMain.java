package com.biprom.hydrofloors.demo;


import com.vaadin.event.ItemClickEvent;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.UI;

@SpringView(name = ViewMain.VIEW_NAME)

public class ViewMain extends DesignMain implements View {

	public static final String VIEW_NAME = "mainview";
	
	
    
	
	public ViewMain(SpringViewProvider provider) {
		
	
		
		mainMenu.addItem("Start Menu");
		mainMenu.setChildrenAllowed("Start Menu", false);
		
		mainMenu.addItem("Admin Menu");
		mainMenu.setChildrenAllowed("Admin Menu", false);
		
		mainMenu.addItem("Real Time Menu");
		mainMenu.setChildrenAllowed("Real Time Menu", false);
		
		// Handle selection changes
		mainMenu.addValueChangeListener(event -> { // Java 8
		    if (event.getProperty() != null &&
		        event.getProperty().getValue() != null) {
		        
		        System.out.println("menu selectie = "+event.getProperty().getValue());  
		        
		        Navigator subnavigator = new Navigator(UI.getCurrent(), mainPanel);
	    		subnavigator.addProvider(provider);		
		        
		        if(event.getProperty().getValue() == "Start Menu"){
		        	subnavigator.navigateTo(ViewSubMain.VIEW_NAME);
		        }
		        if(event.getProperty().getValue() == "Admin Menu"){
		        	subnavigator.navigateTo(ViewSubMain.VIEW_NAME);
		        }
		        if(event.getProperty().getValue() == "Real Time Menu"){
		        	subnavigator.navigateTo(ViewSubMain.VIEW_NAME);
		        }
		    }
		});
		
	}



	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}

}
