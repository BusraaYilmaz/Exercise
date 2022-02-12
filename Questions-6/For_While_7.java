package replit;

import java.util.Scanner;

public class For_While_7 {

	public static void main(String[] args) {
		/*
		 Sayinin M�kemmel say� olup olmad���n� kontrol eden Java kodunu yaz�n.
		 Say�n�n kendisi hari� pozitif b�lenlerinin toplam� o say�ya e�itse, herhangi
		 bir say� M�kemmel Say� olarak bilinir.
		 Input: 6
		 Output: 6 Mukemmel Sayidir.
		 ======================
		 Input: 7
		 Output: 7 Mukemmel Sayidir degildir.
		  
		 */
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Bir say� giriniz");
		int sayi=scan.nextInt();
		
		int b�len=0;
		
		for (int i = 1; i < sayi ; i++) {
			
	    if (sayi%i==0) {
			b�len+= i;
	   }
	
		}
		
	    if (sayi==b�len) {
			System.out.println(sayi+" M�kemmel say�d�r.");
		
		} else {
			System.out.println(sayi+" M�kemmel say� degildir.");
		}

		scan.close();
		}
	}
