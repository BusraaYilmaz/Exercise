package replit;

import java.util.Scanner;

public class Scanner10 {

	public static void main(String[] args) {
		
		/*
		 Kullan�c�dan dakika girmesini isteyin, Dakikalar� birka� y�l ve g�n say�s�na d�n��t�rmek i�in bir Java program� yaz�n.
         INPUT:
         Dakika say�s�: 3456789
         OUTPUT :
         3456789 dakika yakla��k 6 y�l 210 g�nd�r
		 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Dakika giriniz");
		
		int dakika=scan.nextInt();
		
		int g�n=0;
		int y�l=0;
		
		y�l=dakika/(60*24*365);
		g�n=(dakika/(60*24))%365;
		
		System.out.println(dakika +" dakika yakla��k "+ y�l+" y�l "+ g�n+" g�nd�r");
		
		scan.close();

	}

}
