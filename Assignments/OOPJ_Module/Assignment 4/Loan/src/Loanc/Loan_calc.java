package Loanc;

public class Loan_calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		LoanAmortizationCalculatorr  l = new LoanAmortizationCalculatorr();
		while ((choice = LoanAmortizationCalculatorr.menuList())!=0) {
			switch (choice) {
			case 1:
				l.acceptRecord();
				l.calculateMonthlyPayment();
				break;
			case 2:
				l.printRecord();
				break;
				
			}
			
		}
		
		}
		
		
//		l.getPrincipal();
//		l.getRate();
//		l.getTime();
	}


