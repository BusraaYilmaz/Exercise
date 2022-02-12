package replit;


import java.util.Scanner;

public class For_While_3 {

	public static void main(String[] args) {

		/*
		 * Bir String icerisinde yinelenen karakterleri d�nd�ren bir kod
		 * yaz�n�z.(m�lakat Sorusu) 
		 * Input : String str=javaissoeasy� 
		 * Output: a s
		 */

		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		String strKontrol = ""; // yinelenen karakterleri yazmak icin
		
		for (int i = 0; i < str.length(); i++) { // Stringi taramak icin for loop kullan�yoruz
			
			if (str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))) { // ayn� karakterleri bulmak icin
				
				if (!strKontrol.contains(Character.toString(str.charAt(i)))) { // ayn� karakterler birden fazla
																				// yaz�lmas�n diye
					
          //contains String methodu oldu�u icin char'la calismaz. o yuzden wrapper class'la Stringe cevirip oyle kullan�yoruz.
					strKontrol += str.charAt(i) + " ";
				}
			}
		}
		System.out.println(strKontrol);

		scan.close();

	}

}
