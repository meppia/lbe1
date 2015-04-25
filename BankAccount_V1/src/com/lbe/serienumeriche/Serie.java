package com.lbe.serienumeriche;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntToDoubleFunction;



public class Serie {
	//dato n, memorizza elementi della serie, 1/n^2
	private List<Double> risultati = new ArrayList<Double>();
	final private IntToDoubleFunction formula;
	
	public Serie(IntToDoubleFunction formula) {
		super();
		this.formula = formula;
	}
	
	public void calcolaNextValoreSerie (int n) {
		for (int counter=0;counter<n;counter++) {
			this.calcolaNextValoreSerie();
		}
	}
	public double calcolaNextValoreSerie () {
		double risultatoParziale = 0d;
		if(!risultati.isEmpty()){
			risultatoParziale =  risultati.get(risultati.size()-1);
		} 
		
		risultatoParziale += formula.applyAsDouble(risultati.size()+1);
		risultati.add(risultatoParziale);
		return risultatoParziale;
	}
	
	
	public double calcolaNextValoreSerie (IntToDoubleFunction f) {
		double risultatoParziale = 0d;
		if(!risultati.isEmpty()){
			risultatoParziale =  risultati.get(risultati.size()-1);
		} 
		
		risultatoParziale += f.applyAsDouble(risultati.size()+1);
		risultati.add(risultatoParziale);
		return risultatoParziale;
	}
	
	@Override
	public String toString() {
		int i=0;
		StringBuffer sb = new StringBuffer();
		for (Double double1 : risultati) {
			sb.append("Indice: ").append(++i).append(" Valore: ").append(double1).append("\n");
			
		} 
		
		return sb.toString();
	}
	public double getValoreCorrente () {
		return risultati.isEmpty() ? 0 : risultati.get(risultati.size()-1);
	}
	
	
	
	

}
