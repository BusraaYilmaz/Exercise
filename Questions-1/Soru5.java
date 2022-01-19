package soruCozumu_2;

import java.util.Scanner;

public class Soru5 {

	public static void main(String[] args) {
		
		/*
	      * Kullanicidan alacaginiz vize2 vize2 ve final notlarini 
	      * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
	      */

		Scanner scan=new Scanner(System.in);
		
		System.out.print("Vize1 notunu giriniz : ");
		double vize1= scan.nextDouble();
		
		System.out.print("Vize2 notunuzu giriniz: ");
		double vize2=scan.nextDouble();
		
		System.out.print("Final notunuzu giriniz: ");
		double finalNotu=scan.nextDouble();
		
		double gecmeNotu=(vize1+vize2)/2*0.3+finalNotu*0.7;
		System.out.print("Geçme notunuz :"+ gecmeNotu);
		
		scan.close();
	
	}

}
