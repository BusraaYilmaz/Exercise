package replit;

import java.util.Scanner;

public class Scanner6 {

	public static void main(String[] args) {
		/*
		 Kullan�c�dan bir Float de�er girmesini isteyin, bu say�y� short de�i�ken tipine d�n��t�r�n ve konsolda yazd�r�n.
		 */
		
		Scanner scan= new Scanner(System.in);
		System.out.print("Bir float say� girin : ");
		
		float sayi=scan.nextFloat();
		short sayi1= (short)sayi;
		
		
		System.out.println("Short tipi say�n�z : "+ sayi1);
		
		scan.close();
		
		
		
		

	}

}
