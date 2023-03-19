package main.com.java.exception;

public class InitialException extends Exception {

	public InitialException(String msg) {
		super(msg);

	}
	
	/*
	static void validateInitial (String name) throws InitialException {
		String upper_name = name.toUpperCase(); 
		if (name.charAt(0) != upper_name.charAt(0) && !name.isEmpty()) {
			throw new InicialException("the first or last name does not begin with a capital letter;
		}
	}
	*/
}
