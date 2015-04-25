package com.lbe.bankaccount.test;

import com.lbe.bankaccount.BankAccount;



public class TestAccount {

	public static void main(String[] args) {
		BankAccount bankVar = new BankAccount ( 50 , "Camilla Nota");
		
		bankVar.deposit(20);
		
		
		bankVar.withdraw(30);
		}

}

