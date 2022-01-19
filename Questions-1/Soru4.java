package soruCozumu_2;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
		 /*  Problem Tanýmý
        Mesafeyi ve hýzý alýp süreyi hesaplayan bir kod yazýnýz.
        Örneðin:Ýstanbul ile Ankara arasý 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hýzla giden bir araç ne kadar sürede hedefe varýr?
        Örnek Ekran Çýktýsý
        Mesafeyi giriniz: 400
        Hýzý giriniz: 100
        Süre 4 saattir.
     */

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen gitmek istediðiniz km giriniz");
		int mesafe=scan.nextInt();
		
		System.out.println("Lütfen hýzýnýzý giriniz");
		int hýz= scan.nextInt();
		
		System.out.println("Varacaðýnýz süre :" +mesafe/hýz + " saat");
		
		
		scan.close();	}

}
