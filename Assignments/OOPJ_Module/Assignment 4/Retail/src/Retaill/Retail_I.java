package Retaill;
public class Retail_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		EmployeeUtil util = new EmployeeUtil();
		while ( (  choice = EmployeeUtil.menuList( ) ) != 0 ) {
			switch( choice ) {
			case 1:
				util.acceptRecord();
				util.calculateDiscount();
				break;
			case 2:
				util.printRecord();
				break;
				
			}
		}
	}

}
