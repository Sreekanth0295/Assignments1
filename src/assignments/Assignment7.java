package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment7 {

	public static void main(String[] args) {
		
		List<Double> transactions = new ArrayList<>();
		transactions.add(50000.0);
		transactions.add(-2000.0);
		transactions.add(3000.0);
		transactions.add(-15000.0);
		transactions.add(-200.0);
		transactions.add(-300.0);
		transactions.add(4000.0);
		transactions.add(-3000.0);
		
		 int creditCount = 0;
	        int debitCount = 0;
	        double totalCredit = 0;
	        double totalDebit = 0;
	        double balance = 0;
	        int suspiciousCount = 0;
	        
	        for (double amount : transactions) {
	            balance += amount;

	            if (amount > 0) { // Credit
	                creditCount++;
	                totalCredit += amount;
	                if (amount > 10000) {
	                    System.out.println("Suspicious credit transaction with Amount: " + amount);
	                    suspiciousCount++;
	                }
	            } else { // Debit
	                debitCount++;
	                totalDebit += Math.abs(amount);
	                if (amount < -10000) {
	                    System.out.println("Suspicious debit transaction with Amount: " + amount);
	                    suspiciousCount++;
	                }
	            }
	        }
		
		   System.out.println("Total number of credit transactions: " + creditCount);
	        System.out.println("Total number of debit transactions: " + debitCount);
	        System.out.println("Total amount credited: " + totalCredit);
	        System.out.println("Total amount debited: " + totalDebit);
	        System.out.println("Remaining balance in account: " + balance);
	        System.out.println("Total number of suspicious transactions: " + suspiciousCount);
		
		
		
	}

}
