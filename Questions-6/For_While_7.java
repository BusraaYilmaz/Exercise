package replit;

import java.util.Scanner;

public class For_While_7 {

	public static void main(String[] args) {
		/*
		 Sayinin Mükemmel sayý olup olmadýðýný kontrol eden Java kodunu yazýn.
		 Sayýnýn kendisi hariç pozitif bölenlerinin toplamý o sayýya eþitse, herhangi
		 bir sayý Mükemmel Sayý olarak bilinir.
		 Input: 6
		 Output: 6 Mukemmel Sayidir.
		 ======================
		 Input: 7
		 Output: 7 Mukemmel Sayidir degildir.
		  
		 */
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Bir sayý giriniz");
		int sayi=scan.nextInt();
		
		int bölen=0;
		
		for (int i = 1; i < sayi ; i++) {
			
	    if (sayi%i==0) {
			bölen+= i;
	   }
	
		}
		
	    if (sayi==bölen) {
			System.out.println(sayi+" Mükemmel sayýdýr.");
		
		} else {
			System.out.println(sayi+" Mükemmel sayý degildir.");
		}

		scan.close();
		}
	}
