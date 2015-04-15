package com.lbe.bankaccount;

import java.math.BigDecimal;

public class BankAccount extends BaseBankAccount{

	private String owner;
	
	public BankAccount (double _bilancio,String _owner ){
		super(new BigDecimal(_bilancio), _owner);
		this.owner=_owner;
	}
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	
	
	
	
}
