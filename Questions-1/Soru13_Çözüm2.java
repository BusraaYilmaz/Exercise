package soruCozumu_2;

import java.util.Scanner;

public class Soru13_��z�m2 {

	public static void main(String[] args) {
		
		
		/*Kullan�c� taraf�ndan girilen bir say�n�n 
		 * mutlak de�erini yazd�rmak i�in bir program yazn�n�z.
		 */
		
         Scanner scan=new Scanner(System.in);
		
		 System.out.print("L�tfen bir say� giriniz");
		 int sayi=scan.nextInt();
		 
		 if(sayi<0) {
			 sayi*=(-1); 	 
		}
		 
		System.out.println("Say�n�z�n mutlak de�eri : " + sayi);
		 
		 scan.close();
		 
	}

}
