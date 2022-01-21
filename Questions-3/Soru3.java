package soruCozumu_3;

import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {
		
		
		// Kullanýcýdan alýnan üç kelime ismi baþ harf yazdýr.
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lütfen 3 Kelimelik ismi giriniz");
		String isim=scan.nextLine();
		
		System.out.println(isim.toUpperCase().substring(0,1)+ "."+ isim.toUpperCase().substring(isim.indexOf(" ")+1, isim.indexOf(" ")+2)+ "."
		+ isim.toUpperCase().substring(isim.lastIndexOf(" ")+1,isim.lastIndexOf(" ")+2));
		
		
		
		scan.close();
		
		

	}

}
