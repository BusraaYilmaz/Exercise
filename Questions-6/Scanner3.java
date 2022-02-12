package replit;

import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
		
		/*Kullanýcýdan dikdörtgenin kenar uzunluklarýný alýn ve dikdörtgenin alanýný ve çevresini konsola yazdýran bir program yazýn.
		Örnek Çýktý:
		Alan: 32
		Çevre: 24
		*/
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Dikdörtgenin iki kenar uzunluðunu entere basýp giriniz");
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		System.out.println("Dikdörtgenin alaný : "+ (a*b));
		System.out.println("Dikdörtgenin çevresi : "+ (2*(a+b)));
		scan.close();
	}

}
