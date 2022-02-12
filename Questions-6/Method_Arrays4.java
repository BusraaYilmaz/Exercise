package replit;

import java.util.Arrays;
import java.util.Scanner;

public class Method_Arrays4 {

	public static void main(String[] args) {
		
		/*
		 Create a custom return type method accepts a name as parameter and prints the name as a char array.
		 �zel bir return type olu�tur, bir ad� parametre olarak kabul eder ve ad� bir karakter dizisi olarak yazd�r�r.
		 (do not use toCharArray() method)
		 Input : John
		 Output :[J, o, h, n]
 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Bir kelime giriniz");
		String kelime=scan.nextLine();
		
		arrayYap(kelime);
		scan.close();
	}

	private static String arrayYap(String kelime) {
	
		String arr[]=kelime.split("");
		System.out.println(Arrays.toString(arr));
		
		return kelime;
		
	}

}
