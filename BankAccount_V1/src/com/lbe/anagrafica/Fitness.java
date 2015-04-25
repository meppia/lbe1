package com.lbe.anagrafica;

public class Fitness {
	private double pesoInKg;
	private double altezza;
	private static final double LIBBRE_PER_CHILO = 2.2d;
	
	
	public Fitness() {
		super();
	}
	public Fitness(double peso, double altezza) {
		super();
		this.pesoInKg = peso;
		this.altezza = altezza;
	}
	
	
	public double getPeso() {
		return pesoInKg;
	}

	public void setPeso(double peso) {
		this.pesoInKg = peso;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	
	public double indiceMassaCorporea () {
		 return pesoInKg/(altezza*altezza);
		  
	}
	
	public double calorieGiornaliere () {
		return 19*LIBBRE_PER_CHILO*pesoInKg;
	}
	
	public static void main(String[] args) {
		Fitness test = new Fitness ();
		test.setAltezza(1.75);
		test.setPeso(64.0);
		System.out.println("Calorie giornaliere: " + test.calorieGiornaliere());
		System.out.println("Indice massa corporea: " + test.indiceMassaCorporea());
	}

}
