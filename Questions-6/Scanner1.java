package replit;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		
		// Kullan�c�dan bir say� al�n ve say�n�n k�p�n�n yar�s�n� konsola yazd�ran bir program yaz�n.
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Bir say� girin");
		
		double sayi = scan.nextInt();
		System.out.println("Say�n�n k�p�n�n yar�s� : "+ (sayi*sayi*sayi)/2);
		scan.close();
	}

}
