package replit;


import java.util.Scanner;

public class For_While_2 {

	public static void main(String[] args) {
		
		/*
		 * Kullan�c�dan 2 tamsay� girmesini ve ard�ndan 
		 * GCD (En B�y�k Ortak B�len) ve
		 * LCM'yi (En K���k Ortak Kat) bulmas�n� isteyin. 
		 * Input : 30 40 
		 * Beklenen Cikti: 30 ve 40 icin GCD = 10 || 30 ve 40 icin LCM = 120
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("�ki tam say� giriniz");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int ebob=0;
		int ekok=0;
		
		
		for (int i = 1; i <= sayi1 && i<= sayi2 ; i++) {
			
			if (sayi1%i==0 && sayi2%i==0 ) {
				ebob=i;
				
				ekok=(sayi1*sayi2)/ebob;
				
				
			}
			
		}
		System.out.println(ebob);
		System.out.println(ekok);
		scan.close();
	}

}
