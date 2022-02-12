package replit;

import java.util.Scanner;

public class Scanner4 {

	public static void main(String[] args) {
		
		/*
		 Kullanýcýya günde ne kadar çay içtiðini ve ne kadar þeker kullandýðýný sorun. Yýlda kaç kg þeker kullandýðýný hesaplayýn ve yazdýrýn.
		1 þeker = 1.7 gr
		Örnek Çýktý:
		Yýlda 12.41 kg þeker kullanýyor.
		 */
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Bir günde içtiðiniz çay miktarýný ve kullandýðýnýz þeker miktarýný enterleyerek giriniz");
		
		double cay=scan.nextInt();
		double seker=scan.nextInt();
		
		System.out.println("Bir yýlda kullanýlan þeker miktarý : "+ (seker*cay)*360);
		
		
		scan.close();
		
		
	}

}
