package replit;

import java.util.Scanner;

public class For_While_1 {

	public static void main(String[] args) {

		/*
		 * Kullan�c�dan bir isim ve bir karakter girmesini isteyin, ard�ndan d�ng�leri
		 * kullanarak karakterin isimde ka� kez tekrarland���n� kontrol edin.
		 *  char ch1='a' ; 
		 *  String name =�John came late"
		 *  Expected Output: Number of a = 2
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir isim ve bir karakter giriniz");

		String name = scan.nextLine();
		char ch1 = scan.next().charAt(0);
		int count = 0;

		
		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) == ch1) {

				count++;
			}

		}
		System.out.println(count);
		
		scan.close();
	}
}
