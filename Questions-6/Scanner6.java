package replit;

import java.util.Scanner;

public class Scanner6 {

	public static void main(String[] args) {
		/*
		 Kullanýcýdan bir Float deðer girmesini isteyin, bu sayýyý short deðiþken tipine dönüþtürün ve konsolda yazdýrýn.
		 */
		
		Scanner scan= new Scanner(System.in);
		System.out.print("Bir float sayý girin : ");
		
		float sayi=scan.nextFloat();
		short sayi1= (short)sayi;
		
		
		System.out.println("Short tipi sayýnýz : "+ sayi1);
		
		scan.close();
		
		
		
		

	}

}
