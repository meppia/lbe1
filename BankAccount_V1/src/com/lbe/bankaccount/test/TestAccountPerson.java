package com.lbe.bankaccount.test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.lbe.anagrafica.Persona;
import com.lbe.bankaccount.BankAccountExtended;
import com.lbe.bankaccount.BankOperationNotPermitted;
import com.lbe.bankaccount.InsufficientFundsToCompleteOperation;

public class TestAccountPerson {

	public static void main(String[] args) {
		
		Calendar cal = GregorianCalendar.getInstance();
		
		cal.set(Calendar.YEAR, 1995);
		cal.set(Calendar.MONTH, Calendar.MAY);
		cal.set(Calendar.DAY_OF_MONTH, 17);
		
		Persona titolare  = new Persona("Camilla", "Nota", cal.getTime()); 
		BankAccountExtended account = new BankAccountExtended(50d, "1234567890", titolare);
		
		try {
			System.out.println( "Ritirato importo. Nuovo saldo : " + account.withdraw(200d) );
			
		} catch (InsufficientFundsToCompleteOperation ex){
			System.out.println("ATTENZIONE OPERAZIONE NON CONCLUSA: " + ex.getMessage());

		} catch (BankOperationNotPermitted ex ){
			
			System.err.println("ERRORE" + ex.getMessage());
		} 
		
		System.out.println( "Depositato nuovo importo. Nuovo saldo : " + account.deposit(2000d));
		
	}

}
