package AppGenerate;

import javax.swing.JOptionPane;

public class AccountingArrayApp {

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
				
		double[] DividendRates = new double[3];
		DividendRates[0] = 0.5;
		DividendRates[1] = 0.3;
		DividendRates[2] = 0.2;
		
		double Dividend1 = Income * DividendRates[0];
		double Dividend2 = Income * DividendRates[1];
		double Dividend3 = Income * DividendRates[2];
		
		
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
