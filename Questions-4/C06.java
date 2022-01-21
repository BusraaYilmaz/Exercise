package soruCozumu_260721;

import java.util.Scanner;

public class C06 {

	public static void main(String[] args) {
		
		/*
		 * 123=1+2+3=6
 Kullanýcýdan alýnan bir sayinin basamaktaki degerlerinin toplamini while loop ile
  hesaplayan bbir method yazýnýz.
	     */
	    	
	  
   Scanner scan = new Scanner(System.in);
   System.out.print("Lutfen bir sayi giriniz : ");
   int sayi = scan.nextInt();
   
  rakamTopla(sayi);
		
  scan.close();
	}

	private static int rakamTopla(int sayi) {
		int toplam=0;
		
		do {
			toplam+=sayi%10;
			sayi/=10;
			
		} while (sayi>0);
		System.out.println("Girdiðiniz sayýnýn rakamlar toplamý : "+ toplam);
		
		return toplam;
		
	
		
			
	}

}
