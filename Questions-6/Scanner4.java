package replit;

import java.util.Scanner;

public class Scanner4 {

	public static void main(String[] args) {
		
		/*
		 Kullan�c�ya g�nde ne kadar �ay i�ti�ini ve ne kadar �eker kulland���n� sorun. Y�lda ka� kg �eker kulland���n� hesaplay�n ve yazd�r�n.
		1 �eker = 1.7 gr
		�rnek ��kt�:
		Y�lda 12.41 kg �eker kullan�yor.
		 */
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Bir g�nde i�ti�iniz �ay miktar�n� ve kulland���n�z �eker miktar�n� enterleyerek giriniz");
		
		double cay=scan.nextInt();
		double seker=scan.nextInt();
		
		System.out.println("Bir y�lda kullan�lan �eker miktar� : "+ (seker*cay)*360);
		
		
		scan.close();
		
		
	}

}
