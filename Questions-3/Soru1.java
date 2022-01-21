package soruCozumu_3;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		
		//Kullanýcýdan tek seferde alacaðýnýz 2 kelimelik ad soyadý 2 ayrý kelimeye ayýrýnýz.
		// ad soyad ayrý þekilde ekrana yazdýrýnýz.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Adýnýzý soyadýnýzý giriniz : ");
		
		String adSoyad=scan.nextLine();
		
		String ad=(adSoyad.toUpperCase().substring(0,adSoyad.indexOf(" ")));
		String soyad=adSoyad.toUpperCase().substring(adSoyad.indexOf(" ")+1);
		
		 System.out.println("Adýnýz :"+ad+ "\nSoyadýnýz :"+soyad);



scan.close();


	}

}
