package cz.expertkom.ju.task;

public class MyException extends Exception {
	private String duvod;
	
	public MyException(String s ) {
		this.duvod = s;
	}

	public String getDuvod() {
		return duvod;
	}
	

}
