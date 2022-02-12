package replit;

import java.util.Scanner;

public class ÝfSwitchTernaryStringMethod8 {

	public static void main(String[] args) {
		/*
		  Kullanýcýdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasýndan
		  oluþan yeni bir String yazdýrýn Kullanicidan alinan isim uzunluðu en az 2
		  olacaktýr.
		  
		  INPUT : Mustafa OUTPUT : fafafa
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Bir isim giriniz");
		String isim = scan.nextLine();
		String str="";

		if (isim.length() >= 2) {
			
			str=isim.substring(isim.length() - 2, isim.length());
			System.out.println(str+str+str);
			

		}else {
			System.out.println("Ýki harften kýsa isim girdiniz");
		}
scan.close();
	}

}
