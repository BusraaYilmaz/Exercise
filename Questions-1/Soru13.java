package soruCozumu_2;

import java.util.Scanner;

public class Soru13 {

	public static void main(String[] args) {
		
		 /* Kullanýcý tarafýndan girilen bir sayýnýn 
		  * mutlak deðerini yazdýrmak için bir program yaznýnýz.
		  */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lütfen bir sayý giriniz");
		 int sayi=scan.nextInt();
		 
		System.out.println(sayi<0 ? sayi*-1 : sayi*1);
		 
		 
		 
		 scan.close();
	}
}

