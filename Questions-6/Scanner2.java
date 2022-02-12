package replit;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		
		
		/*
		 Kullanýcýdan karenin kenar uzunluðunu alýn ve karenin alanýný ve çevresini konsola yazdýran bir program yazýn.
		Ornek Cikti :
		Alan: 9
		Cevre: 12
		 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Karenin bir kenar uzunluðunu giriniz");
		
		int kenar=scan.nextInt();
		
		System.out.println("Karenin çevresi : "+ (kenar*4));
		System.out.println("Karenin alaný : " + (kenar*kenar));
		scan.close();
	}

}
