package soruCozumu_2;

import java.util.Scanner;

public class Soru12 {

	public static void main(String[] args) {
		
		 //Kullanýcýdan vize ve final notlarý alýnýz.
		//Kullanýcýnýn istediði oranlarda vize ve final yüzdeleri not ile not ortalamasýný hesaplayýnýz
		//Not ortalamasýný yazdýrýp 50 ve büyük ise "Tebrikler dersi geçtiniz" yazýnýz.
		//Küçük ise "Malesef dersten kaldýnýz" yazýnýz
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen vize notunuzu giriniz");
		double v1=scan.nextDouble();
		
		System.out.println("Lütfen vize1 notunuzu giriniz");
		double v2=scan.nextDouble();
		
		System.out.println("Final notunuzu giriniz");
		double f=scan.nextDouble();
		
		System.out.println("Vize hesaplama oranýný giriniz");
		double v0 =scan.nextDouble();
				
		System.out.println("Final hesaplama oranýný giriniz");
		double f0 =scan.nextDouble();
		
		double ortalama =((v1+v2)/2*(v0/100))+(f*(f0/100));
		
		if(ortalama>50) {
			System.out.println("Tebrikler geçtiniz : " + ortalama);
		}else {
			System.out.println("Dersten kaldýnýz :");
		}
		
		
		
		scan.close();
	}

}
