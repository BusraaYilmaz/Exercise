package soruCozumu_2;

import java.util.Scanner;

public class Soru13 {

	public static void main(String[] args) {
		
		 /* Kullan�c� taraf�ndan girilen bir say�n�n 
		  * mutlak de�erini yazd�rmak i�in bir program yazn�n�z.
		  */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("L�tfen bir say� giriniz");
		 int sayi=scan.nextInt();
		 
		System.out.println(sayi<0 ? sayi*-1 : sayi*1);
		 
		 
		 
		 scan.close();
	}
}

