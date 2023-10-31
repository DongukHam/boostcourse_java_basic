package AppGenerate;

import javax.swing.JOptionPane;

public class AccountingIFApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String value = JOptionPane.showInputDialog("Enter Value of Supply");
		double valueOfSupply = Double.parseDouble(value);
//		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double VAT = valueOfSupply * vatRate;
		double expenseRate = 0.3;
		double Total = valueOfSupply + VAT;
		double Expense = valueOfSupply * expenseRate;
		double Income = valueOfSupply - Expense;
		
		double Dividend1;
		double Dividend2;
		double Dividend3;
		
		if(Income > 10000.0) {
			Dividend1 = Income * 0.5;
			Dividend2 = Income * 0.3;
			Dividend3 = Income * 0.2;
		} else {
			Dividend1 = Income * 1;
			Dividend2 = Income * 0;
			Dividend3 = Income * 0;
		}
		
		// refactor -> extract local variable
		
		System.out.println("Value of supply: " + valueOfSupply);
		
		System.out.println("VAT: "+ VAT);
		System.out.println("Total : " + Total);
		

		System.out.println("Expense: "+ Expense);
		System.out.println("Income: "+ Income);
		
		System.out.println("Dividend: "+ Dividend1);
		System.out.println("Dividend: "+ Dividend2);
		System.out.println("Dividend: "+ Dividend3);

	}

}
