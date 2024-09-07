package CI_q;

public class CI_GS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		CompoundInterestCalculator c = new CompoundInterestCalculator();
		while ((choice = CompoundInterestCalculator.menuList())!=0) {
			switch (choice) {
			case 1:
				c.acceptRecord();
				c.calculateFutureValue();
				break;
			case 2:
				c.printRecord();
				break;
			}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
	}

		
	}
}
