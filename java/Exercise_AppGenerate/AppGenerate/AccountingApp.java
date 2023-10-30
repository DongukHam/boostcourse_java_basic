package AppGenerate;

import javax.swing.JOptionPane;

public class AccountingApp implements vatRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String valueOfSupply = JOptionPane.showInputDialog("Enter Value of Supply");
		double s = Double.parseDouble(valueOfSupply);
		double vatRate = 0.1;
		double VAT = s * vatRate;
		double expenseRate = 0.3;
		double Total = s + VAT;
		double Expense = s * expenseRate;
		double Income = s - Expense;
		double dividend1 = 0.5;
		double dividend2 = 0.3;
		double dividend3 = 0.2;
		double Dividend1 = Income * dividend1;
		double Dividend2 = Income * dividend2;
		double Dividend3 = Income * dividend3;
		
		
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
