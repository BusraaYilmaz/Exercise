package replit;

import java.util.Scanner;

public class Scanner7 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Double sayý giriniz");
		
		double sayi=scan.nextDouble();
		int sayi1=(int)sayi;
		
		System.out.println("Int çevrilmiþ sayýnýz"+sayi1);
		scan.close();
	}

}
