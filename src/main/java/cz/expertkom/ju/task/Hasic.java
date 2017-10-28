package cz.expertkom.ju.task;

import java.util.Date;

public class Hasic extends Person {

	private Date datumNastupu;
	
	public Hasic() {
		super();
		System.out.println("Hasič je beze jména");
		this.setDatumNastupu(new Date());
	}

	public Hasic(String firstname, String surname) {
		super(firstname, surname);
		// TODO Auto-generated constructor stub
	}

	public Date getDatumNastupu() {
		return datumNastupu;
	}

	public void setDatumNastupu(Date datumNastupu) {
		this.datumNastupu = datumNastupu;
	}

	
}
