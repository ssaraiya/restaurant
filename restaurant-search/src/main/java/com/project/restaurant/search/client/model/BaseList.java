package com.project.restaurant.search.client.model;

public abstract class BaseList {
	
	private int start;
	private int size;
	
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	
	public abstract int getSize() ;
	
	
	

}
