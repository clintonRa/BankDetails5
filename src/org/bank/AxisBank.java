package org.bank;

public class AxisBank extends BankInfo {
	@Override
	public void deposit() {
		System.out.println("Deposit: 5%");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank b = new AxisBank();

		b.saving();
		b.fixed();
		b.deposit();
	}

}
