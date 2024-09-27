package prac;

public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is a sample line of text\r\n"
				+ "\r\n"
				+ "  This is another line of text\r\n"
				+ "\r\n"
				+ "    This line is the 3rd line\r\n"
				+ "\r\n"
				+ "  This junk line contains 989902 99dsaWjJ8    015\r\n"
				+ "\r\n"
				+ "This is the fifth and the last line of input";
		int count = 0;
		
		for(int i=0; i<=str.length()-1; i++ ) {
			if (str.charAt(i)==' ' && Character.isLetter(str.charAt(i+1)) && (i > 0)) { 
				count+=1;
			}
		}
		System.out.println(count+1);
				
	}

}
