package Entities;

import Abstract.Entity;

public class Sale implements Entity {

	private int id;
	

	public Sale(int id) {
		super();
		this.id = id;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	

}
