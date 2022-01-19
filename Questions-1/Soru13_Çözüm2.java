package soruCozumu_2;

import java.util.Scanner;

public class Soru13_Çözüm2 {

	public static void main(String[] args) {
		
		
		/*Kullanýcý tarafýndan girilen bir sayýnýn 
		 * mutlak deðerini yazdýrmak için bir program yaznýnýz.
		 */
		
         Scanner scan=new Scanner(System.in);
		
		 System.out.print("Lütfen bir sayý giriniz");
		 int sayi=scan.nextInt();
		 
		 if(sayi<0) {
			 sayi*=(-1); 	 
		}
		 
		System.out.println("Sayýnýzýn mutlak deðeri : " + sayi);
		 
		 scan.close();
		 
	}

}
