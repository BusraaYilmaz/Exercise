package soruCozumu_2;

public class Soru2 {

	public static void main(String[] args) {
		
	 // Write a Java program to break an integer into a sequence of individual digits.
	// Hint: use / and %
	// ex: input: 12345
//		    output: 1
//		            2
//		            3
//		            4
//		            5
		
		int x=12345;
		int birler=x%10;  //5i verir.
		int onlar=x/10%10;     //4� verir.
		int y�zler=x/100%10;
		int binler=x/1000%10;
		int onbinler=x/10000%10;
	
		System.out.println(onbinler+"\n"+binler+"\n"+y�zler+"\n"+onlar+"\n"+birler);
	




		
		
		
		
		
		
		
	}

}
