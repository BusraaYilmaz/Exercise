package soruCozumu_3;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		
		//Kullan�c�dan tek seferde alaca��n�z 2 kelimelik ad soyad� 2 ayr� kelimeye ay�r�n�z.
		// ad soyad ayr� �ekilde ekrana yazd�r�n�z.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Ad�n�z� soyad�n�z� giriniz : ");
		
		String adSoyad=scan.nextLine();
		
		String ad=(adSoyad.toUpperCase().substring(0,adSoyad.indexOf(" ")));
		String soyad=adSoyad.toUpperCase().substring(adSoyad.indexOf(" ")+1);
		
		 System.out.println("Ad�n�z :"+ad+ "\nSoyad�n�z :"+soyad);



scan.close();


	}

}
