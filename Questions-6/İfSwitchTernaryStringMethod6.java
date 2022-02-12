package replit;

import java.util.Scanner;

public class ÝfSwitchTernaryStringMethod6 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir isim yazmasýný isteyin, adýn uzunluðu 3 olmalýdýr. Ardýndan,
		 * adýn ayný karakterlere sahip olup olmadýðýný kontrol edin. Eger ayný
		 * karakterlere sahipse : "isim ayni karakterlere sahiptir." yazdirin. Eger ayni
		 * kaakterlere sahip degilse : "Dizenin benzersiz karakterleri var" yazdirin.
		 * Ternary kullanin.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Bir 3 harfli isim yazýnýz");
		String isim = scan.nextLine();

		if (isim.length() == 3) {

			if (isim.charAt(0) == isim.charAt(1) || isim.charAt(0) == isim.charAt(2)
					|| isim.charAt(1) == isim.charAt(2)) {
				System.out.println("isim ayni karakterlere sahiptir.");

			} else {
				System.out.println("Dizenin benzersiz karakterleri var");

			}

		} else {
			System.out.println("3 harften uzun isim girdiniz");

		}
		
		/* TERNARY YOLU ÝLE:
		
    1.Yol: Boþ str tanýmlayýp daha sonra atadýk
		
		String str="";
		String str=isim.length() == 3 ? isim.charAt(0) == isim.charAt(1) || isim.charAt(0) == isim.charAt(2)
		           || isim.charAt(1) == isim.charAt(2) ? "isim ayni karakterlere sahiptir.":"Dizenin benzersiz karakterleri var":"3 harften uzun isim girdiniz
		           System.out.println(str);
		 
		 
	2.Yol: Str'a direk atadýk.
		
		str=isim.length() == 3 ? isim.charAt(0) == isim.charAt(1) || isim.charAt(0) == isim.charAt(2)
				|| isim.charAt(1) == isim.charAt(2) ? "isim ayni karakterlere sahiptir.":"Dizenin benzersiz karakterleri var":"3 harften uzun isim girdiniz";
				System.out.println(str);
				
				
	3.Yol: Syso içinde yazdýrdýk.			
	
		System.out.println(isim.length() == 3 ? isim.charAt(0) == isim.charAt(1) || isim.charAt(0) == isim.charAt(2)
				|| isim.charAt(1) == isim.charAt(2) ? "isim ayni karakterlere sahiptir.":"Dizenin benzersiz karakterleri var":"3 harften uzun isim girdiniz");
		
		*/
scan.close();
	}

}
