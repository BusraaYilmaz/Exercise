package replit;

import java.util.Scanner;

public class �fSwitchTernaryStringMethod8 {

	public static void main(String[] args) {
		/*
		  Kullan�c�dan bir isim girmesini isteyin ve son 2 harfinin 3 kopyas�ndan
		  olu�an yeni bir String yazd�r�n Kullanicidan alinan isim uzunlu�u en az 2
		  olacakt�r.
		  
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
			System.out.println("�ki harften k�sa isim girdiniz");
		}
scan.close();
	}

}
