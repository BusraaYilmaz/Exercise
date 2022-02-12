package replit;


import java.util.Scanner;

public class For_While_3 {

	public static void main(String[] args) {

		/*
		 * Bir String icerisinde yinelenen karakterleri döndüren bir kod
		 * yazýnýz.(mülakat Sorusu) 
		 * Input : String str=javaissoeasy” 
		 * Output: a s
		 */

		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		String strKontrol = ""; // yinelenen karakterleri yazmak icin
		
		for (int i = 0; i < str.length(); i++) { // Stringi taramak icin for loop kullanýyoruz
			
			if (str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))) { // ayný karakterleri bulmak icin
				
				if (!strKontrol.contains(Character.toString(str.charAt(i)))) { // ayný karakterler birden fazla
																				// yazýlmasýn diye
					
          //contains String methodu olduðu icin char'la calismaz. o yuzden wrapper class'la Stringe cevirip oyle kullanýyoruz.
					strKontrol += str.charAt(i) + " ";
				}
			}
		}
		System.out.println(strKontrol);

		scan.close();

	}

}
