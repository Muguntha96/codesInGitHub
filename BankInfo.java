package org.bank;

public class BankInfo extends AxisBank {
	public void saving() {
		system.out.println("Axis Bank Savings");
		System.out.println("Savings:8%");

	}
	public void fixed() {
		System.out.println("fixed:6%");

	}
	public static void main(String[] args) {
		BankInfo b=new BankInfo();
		b.fixed();
		b.saving();
		b.deposit();
	}

}
