package replit;


import java.util.Scanner;

public class For_While_9 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýnýn girdiði sayýyý tersine çeviren bir java programý yazýnýz. *(Mulakat Sorusu)*
		 
		 Input :1238
		 Output :Girilen Numananin Tersi: 8321
		 
		 */
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lütfen bir sayý giriniz");
		int sayi=scan.nextInt();
		
		int tersSayi=0;
		
		while (sayi != 0) {
			
			tersSayi = tersSayi * 10;
			tersSayi = tersSayi + sayi%10;
	           sayi = sayi/10;
			}
			 
			System.out.println(tersSayi);
			
			System.out.println("2. sayi gir");
			int a=scan.nextInt();
			
			String str=String.valueOf(a);
			String ters="";
			for (int i = str.length()-1; i >= 0; i--) {
				ters+=str.charAt(i);
			}
					
		System.out.println(ters);
		scan.close();
		
	}

}
