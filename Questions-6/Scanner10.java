package replit;

import java.util.Scanner;

public class Scanner10 {

	public static void main(String[] args) {
		
		/*
		 Kullanýcýdan dakika girmesini isteyin, Dakikalarý birkaç yýl ve gün sayýsýna dönüþtürmek için bir Java programý yazýn.
         INPUT:
         Dakika sayýsý: 3456789
         OUTPUT :
         3456789 dakika yaklaþýk 6 yýl 210 gündür
		 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Dakika giriniz");
		
		int dakika=scan.nextInt();
		
		int gün=0;
		int yýl=0;
		
		yýl=dakika/(60*24*365);
		gün=(dakika/(60*24))%365;
		
		System.out.println(dakika +" dakika yaklaþýk "+ yýl+" yýl "+ gün+" gündür");
		
		scan.close();

	}

}
