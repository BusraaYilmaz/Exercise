package replit;

import java.util.Scanner;

public class Scanner7 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Double say� giriniz");
		
		double sayi=scan.nextDouble();
		int sayi1=(int)sayi;
		
		System.out.println("Int �evrilmi� say�n�z"+sayi1);
		scan.close();
	}

}
