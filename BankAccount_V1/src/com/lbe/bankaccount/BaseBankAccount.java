package com.lbe.bankaccount;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BaseBankAccount {
	private BigDecimal accountBalance = BigDecimal.ZERO;
	private String accountCode  ;

	
	public BaseBankAccount(BigDecimal accountBalance, String code) {
		super();
		this.accountBalance = accountBalance;
		this.accountCode = code;
	}

	public String getAccountCode() {
		return accountCode;
	}
	
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
	
	
	public double deposit (double ammontareDeposito) {
		try {
			return add(ammontareDeposito).doubleValue();
			
		} catch (BankOperationNotPermitted e) {
			System.err.println("CASO IMPOSSIBILE!!!!");
			return accountBalance.doubleValue();
		}
		
	}
	
	

	protected BigDecimal add(double amount)throws BankOperationNotPermitted {
		return add(new BigDecimal(amount));
		
	}
	protected  BigDecimal add(BigDecimal amount) throws BankOperationNotPermitted {
		if (amount == null ) throw new BankOperationNotPermitted("Amount not valid " + amount);
		BigDecimal newBalance = accountBalance.add(amount);
		newBalance .setScale(2, RoundingMode.HALF_UP);
		
		if (newBalance.compareTo(BigDecimal.ZERO) == -1){
			throw new InsufficientFundsToCompleteOperation("Ue te belo ghe n'o' apena " + accountBalance.toString());
			
		}
			

		accountBalance = newBalance;
		return accountBalance;
	}
	
	public double withdraw (double ammontareRichiesta) throws BankOperationNotPermitted {
//		System.out.println("Nome titolare del conto: "+ owner);
		return add(- ammontareRichiesta).doubleValue();
//		if (bilancio>=ammontareRichiesta ){
//			bilancio -= ammontareRichiesta;
//			System.out.println("Operazione effettuata");
//			System.out.println("Importo ritirato: "+ ammontareRichiesta);
//			System.out.println("Saldo attuale: "+ bilancio);
			
//		}
//		if (bilancio<ammontareRichiesta) {
//			System.out.println("Cifra richiesta maggiore della disponibilità corrente");
//		}
//		return bilancio;
			
		
	}
}
