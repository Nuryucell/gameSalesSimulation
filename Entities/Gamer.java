package Entities;

import Abstract.Entity;

public class Gamer implements Entity {
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String yearOfBirth;
	private String nationalityId;
	
	public Gamer(int id, String firstName, String lastName, String email, String yearOfBirth, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.yearOfBirth = yearOfBirth;
		this.nationalityId = nationalityId;
	}


	public Gamer() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBÝrth) {
        this.yearOfBirth = yearOfBÝrth;
    }

	public String getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

}
