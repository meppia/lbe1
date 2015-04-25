package com.lbe.anagrafica;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Persona {
	
	private String nome;
	private String cognome;
	private Date nascita;
	
	public Persona (String _nome, String _cognome, Date _nascita) {
		this.nome= _nome;
		this.cognome= _cognome;
		this.nascita= _nascita;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		Calendar cal = GregorianCalendar.getInstance();
		cal.setTime(nascita);
		Calendar calNow = GregorianCalendar.getInstance();

		int val = calNow .get(Calendar.YEAR) - cal.get(Calendar.YEAR);
		cal.set(Calendar.YEAR, calNow .get(Calendar.YEAR) );
		
		return cal.after(calNow) ? val -1 : val; 
	}
	public Date getNascita() {
		return nascita;
	}
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("nome: " ).append(nome).append("\ncognome: ").append(cognome).append("\ndata di nascita: ").append(nascita);
		return sb.toString();
	}
	
	public void EqualsPersona (String nome, String cognome, String nascita) {
		
	}
}

