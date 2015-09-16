package com.jesuswalk.jwService.model;

import java.util.List;

public class Parent extends BaseRole  {
	
	private List<Person> children;
	
	
	Parent() {
		role = "Parent";
	}

}
