package replit;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		
		
		/*
		 Kullan�c�dan karenin kenar uzunlu�unu al�n ve karenin alan�n� ve �evresini konsola yazd�ran bir program yaz�n.
		Ornek Cikti :
		Alan: 9
		Cevre: 12
		 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Karenin bir kenar uzunlu�unu giriniz");
		
		int kenar=scan.nextInt();
		
		System.out.println("Karenin �evresi : "+ (kenar*4));
		System.out.println("Karenin alan� : " + (kenar*kenar));
		scan.close();
	}

}
