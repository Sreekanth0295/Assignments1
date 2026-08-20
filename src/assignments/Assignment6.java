package assignments;

public class Assignment6 {

	public static void main(String[] args) {
		
		String Name = "John Doe";
		int CreditScore = 720;
		int Income = 55000;
		boolean isEmployed = true;
		double debtToInconeRatio = 35.0;
		
		boolean isEligible = false;
		
		//Step1
		if (CreditScore > 750) {
				}
		else if (CreditScore >=650 && CreditScore<=750) {		
		//Step2
		if (Income >=50000) {
		//Step3
		if (isEmployed) {
		//Step4
		if (debtToInconeRatio <40) {
	     isEligible = true;
		}
}
}

	       } else {
	    	   
      	isEligible = false;
       }	
       if (isEligible) {
		System.out.println(Name + "is eligible for the loan."); 
       }else {
    	   System.out.println(Name + "is Not eligible for the loan");
       }
    	   
}   
       }
