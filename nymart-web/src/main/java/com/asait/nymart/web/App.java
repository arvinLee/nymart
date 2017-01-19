package com.asait.nymart.web;

import org.springframework.beans.factory.ObjectFactory;

import com.asait.nymart.web.preference.UserPreferences;

/**
 * Hello world!
 *
 */
public class App {
	
	private UserPreferences userPreferences;
	
	private ObjectFactory<UserPreferences> userPreferencesFactory;
	
	public App(){
		System.out.println("instance app!!!!");
	}
   
	public void sayHi(String name){
		System.out.println("hi,"+name);
		System.out.println("hi,session id is "+userPreferences.getSessionId());
		System.out.println("hi,session id is "+userPreferencesFactory.getObject().getSessionId());
	}

	public void setUserPreferences(UserPreferences userPreferences) {
		this.userPreferences = userPreferences;
	}

	public void setUserPreferencesFactory(ObjectFactory<UserPreferences> userPreferencesFactory) {
		this.userPreferencesFactory = userPreferencesFactory;
	}
	
}
