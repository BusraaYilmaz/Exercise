package replit;

import java.util.Scanner;

public class �fSwitchTernaryStringMethod6 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir isim yazmas�n� isteyin, ad�n uzunlu�u 3 olmal�d�r. Ard�ndan,
		 * ad�n ayn� karakterlere sahip olup olmad���n� kontrol edin. Eger ayn�
		 * karakterlere sahipse : "isim ayni karakterlere sahiptir." yazdirin. Eger ayni
		 * kaakterlere sahip degilse : "Dizenin benzersiz karakterleri var" yazdirin.
		 * Ternary kullanin.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Bir 3 harfli isim yaz�n�z");
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
		
		/* TERNARY YOLU �LE:
		
    1.Yol: Bo� str tan�mlay�p daha sonra atad�k
		
		String str="";
		String str=isim.length() == 3 ? isim.charAt(0) == isim.charAt(1) || isim.charAt(0) == isim.charAt(2)
		           || isim.charAt(1) == isim.charAt(2) ? "isim ayni karakterlere sahiptir.":"Dizenin benzersiz karakterleri var":"3 harften uzun isim girdiniz
		           System.out.println(str);
		 
		 
	2.Yol: Str'a direk atad�k.
		
		str=isim.length() == 3 ? isim.charAt(0) == isim.charAt(1) || isim.charAt(0) == isim.charAt(2)
				|| isim.charAt(1) == isim.charAt(2) ? "isim ayni karakterlere sahiptir.":"Dizenin benzersiz karakterleri var":"3 harften uzun isim girdiniz";
				System.out.println(str);
				
				
	3.Yol: Syso i�inde yazd�rd�k.			
	
		System.out.println(isim.length() == 3 ? isim.charAt(0) == isim.charAt(1) || isim.charAt(0) == isim.charAt(2)
				|| isim.charAt(1) == isim.charAt(2) ? "isim ayni karakterlere sahiptir.":"Dizenin benzersiz karakterleri var":"3 harften uzun isim girdiniz");
		
		*/
scan.close();
	}

}
