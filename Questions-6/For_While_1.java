package replit;

import java.util.Scanner;

public class For_While_1 {

	public static void main(String[] args) {

		/*
		 * Kullanýcýdan bir isim ve bir karakter girmesini isteyin, ardýndan döngüleri
		 * kullanarak karakterin isimde kaç kez tekrarlandýðýný kontrol edin.
		 *  char ch1='a' ; 
		 *  String name =“John came late"
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
