package soruCozumu_2;

import java.util.Scanner;

public class Soru12 {

	public static void main(String[] args) {
		
		 //Kullan�c�dan vize ve final notlar� al�n�z.
		//Kullan�c�n�n istedi�i oranlarda vize ve final y�zdeleri not ile not ortalamas�n� hesaplay�n�z
		//Not ortalamas�n� yazd�r�p 50 ve b�y�k ise "Tebrikler dersi ge�tiniz" yaz�n�z.
		//K���k ise "Malesef dersten kald�n�z" yaz�n�z
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen vize notunuzu giriniz");
		double v1=scan.nextDouble();
		
		System.out.println("L�tfen vize1 notunuzu giriniz");
		double v2=scan.nextDouble();
		
		System.out.println("Final notunuzu giriniz");
		double f=scan.nextDouble();
		
		System.out.println("Vize hesaplama oran�n� giriniz");
		double v0 =scan.nextDouble();
				
		System.out.println("Final hesaplama oran�n� giriniz");
		double f0 =scan.nextDouble();
		
		double ortalama =((v1+v2)/2*(v0/100))+(f*(f0/100));
		
		if(ortalama>50) {
			System.out.println("Tebrikler ge�tiniz : " + ortalama);
		}else {
			System.out.println("Dersten kald�n�z :");
		}
		
		
		
		scan.close();
	}

}
