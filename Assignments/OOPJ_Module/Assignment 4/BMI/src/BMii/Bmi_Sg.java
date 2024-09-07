package BMii;


public class Bmi_Sg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		BMITracker bm = new BMITracker();
		while ((choice=BMITracker.menuList())!=0) {
			switch(choice) {
				case 1:
					bm.acceptRecord();
					bm.calculateBMI();
					break;
				case 2:
					bm.printRecord();
					bm.classifyBMI();
					break;
			}
		}
	}

}
