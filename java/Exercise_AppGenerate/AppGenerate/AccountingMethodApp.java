package AppGenerate;

import javax.swing.JOptionPane;

public class AccountingMethodApp {
	
	public static String value;
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		value = JOptionPane.showInputDialog("Enter Value of Supply");
		valueOfSupply = Double.parseDouble(value);
		
		
//		double valueOfSupply = Double.parseDouble(args[0]);
		vatRate = 0.1;
		expenseRate = 0.3;
		
//		double VAT = getVAT();
//		double Total = getTotal();
//		double Expense = getExpense();
//		double Income = getIncome();
//		double Dividend1 = getDividend1();
//		double Dividend2 = getDividend2();
//		double Dividend3 = getDividend3();
		
		
		// refactor -> extract local variable
		
		print();

	}

	private static void print() {
		System.out.println("Value of supply: " + valueOfSupply);
		
		System.out.println("VAT: "+ getVAT());
		System.out.println("Total : " + getTotal());
		

		System.out.println("Expense: "+ getExpense());
		System.out.println("Income: "+ getIncome());
		
		System.out.println("Dividend: "+ getDividend1());
		System.out.println("Dividend: "+ getDividend2());
		System.out.println("Dividend: "+ getDividend3());
	}

	private static double getDividend3() {
		return getIncome() * 0.2;
	}

	private static double getDividend2() {
		return getIncome() * 0.3;
	}

	private static double getDividend1() {
		return getIncome() * 0.5;
	}

	private static double getIncome() {
		return valueOfSupply - getExpense();
	}

	private static double getExpense() {
		return valueOfSupply * expenseRate;
	}

	private static double getTotal() {
		return valueOfSupply + getVAT();
	}

	private static double getVAT() {
		return valueOfSupply * vatRate;
	}

}
