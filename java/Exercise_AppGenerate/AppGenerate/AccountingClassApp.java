package AppGenerate;

class Accounting {
//	public String value;
	public double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	public void print() {
		System.out.println("Value of supply: " + valueOfSupply);
		
		System.out.println("VAT: "+ getVAT());
		System.out.println("Total : " + getTotal());
		

		System.out.println("Expense: "+ getExpense());
		System.out.println("Income: "+ getIncome());
		
		System.out.println("Dividend: "+ getDividend1());
		System.out.println("Dividend: "+ getDividend2());
		System.out.println("Dividend: "+ getDividend3());
	}

	private double getDividend3() {
		return getIncome() * 0.2;
	}

	private double getDividend2() {
		return getIncome() * 0.3;
	}

	private double getDividend1() {
		return getIncome() * 0.5;
	}

	private double getIncome() {
		return valueOfSupply - getExpense();
	}

	private double getExpense() {
		return valueOfSupply * expenseRate;
	}

	private double getTotal() {
		return valueOfSupply + getVAT();
	}

	private double getVAT() {
		return valueOfSupply * vatRate;
	}

}


public class AccountingClassApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Accounting1.value = JOptionPane.showInputDialog("Enter Value of Supply");
//		Accounting1.valueOfSupply = Double.parseDouble(Accounting.value);
		
		
//		double valueOfSupply = Double.parseDouble(args[0]);
//		Accounting1.vatRate = 0.1;
//		Accounting1.expenseRate = 0.3;

//		double VAT = getVAT();
//		double Total = getTotal();
//		double Expense = getExpense();
//		double Income = getIncome();
//		double Dividend1 = getDividend1();
//		double Dividend2 = getDividend2();
//		double Dividend3 = getDividend3();
		
		
		// refactor -> extract local variable
		
//		Accounting1.print();
		
		// another Variable = ...;
		// another method = ...;
		
//		Accounting2.value = JOptionPane.showInputDialog("Enter Value of Supply");
//		Accounting2.valueOfSupply = Double.parseDouble(Accounting2.value);
//		Accounting2.vatRate = 0.1;
//		Accounting2.expenseRate = 0.3;
//		Accounting2.print();
		
		Accounting a1 = new Accounting();  // a1에 accounting 복제본만 들어올 수 있다는 의미
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
		Accounting a2 = new Accounting();  // a1에 accounting 복제본만 들어올 수 있다는 의미
		a2.valueOfSupply = 20000.0;
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();
		
		

	}

	
}
