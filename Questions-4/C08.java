package soruCozumu_260721;

import java.util.Scanner;

public class C08 {

	public static void main(String[] args) {
		
		//Integer olan pin kodunuzu kontrol eden bir kod yaz�n�z.
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Pin kodunuzu giriniz : ");
		int userPin= scan.nextInt();
		
		int pinCode=5202;
		
		while (pinCode!=userPin) {
			System.out.println("�ifre ba�ar�s�z tekrar deneyiniz");
			userPin=scan.nextInt();
			
		}
		System.out.println("Ba�ar�l� giri�");
		
scan.close();
	}

}
