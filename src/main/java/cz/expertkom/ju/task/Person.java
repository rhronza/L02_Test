package cz.expertkom.ju.task;

import java.util.ArrayList;
import java.util.List;

public /*abstract */ class Person implements Nameable {
	
	public Person() {
		super();
		this.firstname = "Neznámé";
		this.surname = "Neznámé";
		
	}
	public Person(String firstname, String surname) {
		super();
		this.firstname = firstname;
		this.surname = surname;
	}
	
	
	
	private String firstname;
	private String surname;
	private List<Item> items = new ArrayList<Item>();
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	/* implemetace getName z Nameable */
	public String getName() {
		return this.firstname+ " "+this.surname;
	}
	
	//public abstract void narodilSe();
	
	
	
	

}
