package cz.expertkom.ju.task;

import java.util.Date;

public abstract class Item {
	
	private final Date created;	
	
	public Item() {
		super();
		this.created = new Date();
	}
	
	public Item(Date created) {
		super();
		this.created = created;
	}

	public Date getCreated() {
		return created;
	}

	/*
	public void setCreated(Date created) {
		this.created = created;
	}
	
	*/
	
	
	
	

}
