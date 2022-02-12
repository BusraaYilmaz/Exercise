package replit;

import java.util.Scanner;

public class Scanner8 {

	public static void main(String[] args) {
		
		/*
		 Kullan�c�dan �� basamakl� bir say� girmesini ve bu say�n�n basamaklar�n�n toplam�n� bulmas�n� isteyin.
   		�rnek ��kt�:
   		Verilen tamsay�n�n rakamlar� toplam� 10'dur.
		 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("�� basamakl� bir say� giriniz");
		
		int sayi=scan.nextInt();
		
		int rakamlarTop=0;
		
		rakamlarTop+=sayi%10;
		rakamlarTop+=(sayi/10)%10;
		rakamlarTop+=sayi/100%10;
		
		System.out.println(rakamlarTop);
		
		
		//2.yol:
		int say�larTop=0;
		while (sayi>0) {
			say�larTop+=sayi%10;
			sayi=sayi/10;
			
		}
		System.out.println("RakamlarTop: "+say�larTop);
		
		
		scan.close();
	

	}

}
