package replit;

import java.util.Scanner;

public class Scanner8 {

	public static void main(String[] args) {
		
		/*
		 Kullanýcýdan üç basamaklý bir sayý girmesini ve bu sayýnýn basamaklarýnýn toplamýný bulmasýný isteyin.
   		Örnek Çýktý:
   		Verilen tamsayýnýn rakamlarý toplamý 10'dur.
		 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Üç basamaklý bir sayý giriniz");
		
		int sayi=scan.nextInt();
		
		int rakamlarTop=0;
		
		rakamlarTop+=sayi%10;
		rakamlarTop+=(sayi/10)%10;
		rakamlarTop+=sayi/100%10;
		
		System.out.println(rakamlarTop);
		
		
		//2.yol:
		int sayýlarTop=0;
		while (sayi>0) {
			sayýlarTop+=sayi%10;
			sayi=sayi/10;
			
		}
		System.out.println("RakamlarTop: "+sayýlarTop);
		
		
		scan.close();
	

	}

}
