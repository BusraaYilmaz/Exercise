package replit;

import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
		
		/*Kullan�c�dan dikd�rtgenin kenar uzunluklar�n� al�n ve dikd�rtgenin alan�n� ve �evresini konsola yazd�ran bir program yaz�n.
		�rnek ��kt�:
		Alan: 32
		�evre: 24
		*/
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Dikd�rtgenin iki kenar uzunlu�unu entere bas�p giriniz");
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		System.out.println("Dikd�rtgenin alan� : "+ (a*b));
		System.out.println("Dikd�rtgenin �evresi : "+ (2*(a+b)));
		scan.close();
	}

}
