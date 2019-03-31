package com.test;

public class FactorialIterator implements IFactorial{

	@Override
	public long calcular(int numero) {
		
		int i;
		long acum = 1;
		System.out.println("Estas utilizando la implementacion iterada!!");
		
		for (i = 1; i <= numero; i++) {
			acum = acum * i;			
		}
		
		return acum;
	}
	
	public String descripcion() {
		return "lalala";
	}
	
}
