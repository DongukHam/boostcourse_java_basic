package AppGenerate;

import javax.swing.JOptionPane;

public class AccountingArrayLoopApp {

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
				
	
		
		// refactor -> extract local variable
		
		System.out.println("Value of supply: " + valueOfSupply);
		
		System.out.println("VAT: "+ VAT);
		System.out.println("Total : " + Total);
		

		System.out.println("Expense: "+ Expense);
		System.out.println("Income: "+ Income);
		
		double[] DividendRates = new double[3];
		DividendRates[0] = 0.5;
		DividendRates[1] = 0.3;
		DividendRates[2] = 0.2;
		
//		double Dividend1 = Income * DividendRates[0];
//		double Dividend2 = Income * DividendRates[1];
//		double Dividend3 = Income * DividendRates[2];
		
		int i = 0;
		while(i < DividendRates.length) {
			System.out.println("Dividend " + (i + 1) + " : " + (Income*DividendRates[i]));
			i = i + 1;
		}
		
		
//		System.out.println("Dividend 1: "+ Dividend1);
//		System.out.println("Dividend 2: "+ Dividend2);
//		System.out.println("Dividend 3: "+ Dividend3);

	}

}
