package replit;

import java.util.Scanner;

public class List03 {

	public static void main(String[] args) {

		/*
		 Get a sentence from the user. Accept the sentence received from the user as a
		 parameter, Invert sentence using Array and write a Method that returns the
		 result as a String to the main method. Note: Upper and lower case letters,
		 spaces and special characters will not be changed.
		 * Kullan�c�dan bir c�mle al�n. Kullan�c�dan al�nan c�mleyi parametre olarak kabul edin, Array kullanarak c�mleyi ters �evirin
		   ve sonucu ana metoda String olarak d�nd�ren bir Method yaz�n.
           Not: B�y�k ve k���k harfler, bo�luklar ve �zel karakterler de�i�tirilmeyecektir.
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
