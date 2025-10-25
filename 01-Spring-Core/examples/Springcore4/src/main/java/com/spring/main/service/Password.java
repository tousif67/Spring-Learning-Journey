package com.spring.main.service;

public class Password {
	String algo;
	public Password(String algo) {
		this.algo = algo;
		System.out.println("Passwrod Bean Created");
	}
	
	public void passwordAlgoUsed() {
		System.out.println("The algo used in password is " + algo);
	}

}
