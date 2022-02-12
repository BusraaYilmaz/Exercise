package replit;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		
		// Kullanýcýdan bir sayý alýn ve sayýnýn küpünün yarýsýný konsola yazdýran bir program yazýn.
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Bir sayý girin");
		
		double sayi = scan.nextInt();
		System.out.println("Sayýnýn küpünün yarýsý : "+ (sayi*sayi*sayi)/2);
		scan.close();
	}

}
