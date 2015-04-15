package com.lbe.bankaccount;

import java.math.BigDecimal;

import com.lbe.anagrafica.Persona;

public class BankAccountExtended extends BaseBankAccount {
	
	
	public BankAccountExtended(double accountBalance , String accountCode, Persona persona ) {
		this(new BigDecimal(accountBalance) , accountCode , persona);
	}
	public BankAccountExtended(BigDecimal accountBalance , String accountCode, Persona persona ) {
		super(accountBalance, accountCode);
		this.titolare = persona;
	}

	private Persona titolare;
	public Persona getTitolare() {
		return titolare;
	}
	 
	public void setTitolare(Persona titolare) {
		this.titolare = titolare;
	}
	
}
