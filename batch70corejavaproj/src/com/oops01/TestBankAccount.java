package com.oops01;

public class TestBankAccount {

	public static void main(String[] args) {

		BankAccount ba = new BankAccount();
//		ba.balance = 100;
//		System.out.println(ba.balance);

		ba.setBalance(1000);
		System.out.println(ba.getBalance());
	}
}
