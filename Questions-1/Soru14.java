package soruCozumu_2;

import java.util.Scanner;

public class Soru14 {

	public static void main(String[] args) {
		// �� say� al
		//��genin dik olup olmasd���na bak
		
		
		Scanner scan =new Scanner(System.in);
		
		System.out.print("a kenar�n� giriniz");
		int a=scan.nextInt();
		
		System.out.print("b kenar�n� giriniz");
		int b=scan.nextInt();
		
		System.out.print("c kenar�n� giriniz");
		int c=scan.nextInt();
		
		if(a<=0 || b<=0 || c<=0) {  // NEGAT�F SAYI KONTROL�
			System.out.println("Hatal� giri� yap�lm��t�r");
		}
				
	if((a*a)+(b*b) == c*c) { // Hipoten�s c
		System.out.println("Dik ��gen olu�turur");
		
	}else if ((a*a)+(c*c) ==b*b) { //Hipoten�s b
		System.out.println("Dik ��gen olu�turur");
		
	}else if ((b*b)+(c*c)== a*a) {	//Hipoten�s a
	System.out.println("Dik ��gen olu�turur.");
	
	}else System.out.println("Dik ��gen olu�turmaz");

		
		scan.close();
	}

}
