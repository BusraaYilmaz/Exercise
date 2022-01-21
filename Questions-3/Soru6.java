package soruCozumu_3;

import java.util.Scanner;

public class Soru6 {

	public static void main(String[] args) {
		
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
        // Bu methodu main methodun disinda olusturup main methodun
        // icinden cagiriniz.
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Deðiþtireceðiniz birimin deðerlerini giriniz");
		String birim=scan.next();
		
		System.out.println("Deðiþtireceðiniz biriminin miktarýný giriniz");
		double miktar=scan.nextDouble();
		
		cevirici(birim,miktar);
		
		scan.close();
		
	}
		
	
	private static void cevirici(String birim, double miktar) {
		 switch (birim) {
		case "saat":
			System.out.println(miktar*60*60);
			break;
			
		case "mil":
			System.out.println(miktar*1.609);
			break;
			
		case "kg":
			System.out.println(miktar*1000);
			break;


		default:
			break;
		}
	}

}
