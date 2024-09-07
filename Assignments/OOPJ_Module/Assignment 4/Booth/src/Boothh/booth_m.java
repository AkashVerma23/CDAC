package Boothh;



public class booth_m {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		utility tb = new utility();
		int choice;
		while ( (  choice = utility.menuList( ) ) != 0 ) {
			switch( choice ) {
			case 1:
				tb.acceptRecord();
				tb.setTollRates();
				tb.calculateRevenue();
				break;
			case 2:
				tb.printRecord();
				break;
				
			}
		}

	}

}
