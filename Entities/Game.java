package Entities;

import Abstract.Entity;

public class Game implements Entity {
	
	private int id;
	private String nameOfTheGame;
	private double unitPrice;
	
	public Game(int id, String nameOfTheGame, double unitPrice) {
		super();
		this.id = id;
		this.nameOfTheGame = nameOfTheGame;
		this.unitPrice = unitPrice;
	}
	

	public Game() {
		
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameOfTheGame() {
		return nameOfTheGame;
	}

	public void setNameOfTheGame(String nameOfTheGame) {
		this.nameOfTheGame = nameOfTheGame;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
}
