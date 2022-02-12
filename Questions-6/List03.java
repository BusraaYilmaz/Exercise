package replit;

import java.util.Scanner;

public class List03 {

	public static void main(String[] args) {

		/*
		 Get a sentence from the user. Accept the sentence received from the user as a
		 parameter, Invert sentence using Array and write a Method that returns the
		 result as a String to the main method. Note: Upper and lower case letters,
		 spaces and special characters will not be changed.
		 * Kullanıcıdan bir cümle alın. Kullanıcıdan alınan cümleyi parametre olarak kabul edin, Array kullanarak cümleyi ters çevirin
		   ve sonucu ana metoda String olarak döndüren bir Method yazın.
           Not: Büyük ve küçük harfler, boşluklar ve özel karakterler değiştirilmeyecektir.
		Input : It is very nice to write code. 
		Output : .edoc etirw ot ecin yrev si tI
		 */
		
		Scanner scan= new Scanner(System.in);
		
		 System.out.println("Bir cumle giriniz");
		 String cumle= scan.nextLine();
		 
		 System.out.println(tersCumle(cumle));
		 scan.close();
		}
	
	
	private static String tersCumle(String cumle) {
		
		String str="";
		
	    String cumleArray[]= cumle.split("");
		 
		 for (int i = cumleArray.length-1 ; i>=0 ; i--) {
			 
			 str+=cumleArray[i];
			 
	}	return str;
	}

}
