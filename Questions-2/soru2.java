package soruCozumu_5;

import java.util.Scanner;

public class soru2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// Kullanýcýdan alýnan üç basamaklý sayýyý yazý ile yazdýrýnýz.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen üç basmaklý bir sayý giriniz");
		int sayi=scan.nextInt();
		
		 // 316 üç yüz on altý
        int yuzler = sayi / 100;//3
        int onlar = (sayi / 10) % 10;//1
        int birler = sayi % 10;//6
        switch (birler) {
        case 1: {
            System.out.println("bir");
            break;
        }
        case 2: {
            System.out.println("iki");
            break;
        }
        case 3: {
            System.out.println("üç");
            break;
        }
        case 4: {
            System.out.println("dört");
            break;
        }
        case 5: {
            System.out.println("beþ");
            break;
        }
        case 6: {
            System.out.println("altý");
            break;
        }
        case 7: {
            System.out.println("yedi");
            break;
        }
        case 8: {
            System.out.println("sekiz");
            break;
        }
        case 9: {
            System.out.println("dokuz");
            break;
        }
        }
        System.out.println("onlar");
        switch (onlar) {
        case 1: {
            System.out.println("on");
            break;
        }
        case 2: {
            System.out.println("yirmi");
            break;
        }
        case 3: {
            System.out.println("otuz");
            break;
        }
        case 4: {
            System.out.println("kýrk");
            break;
        }
        case 5: {
            System.out.println("elli");
            break;
        }
        case 6: {
            System.out.println("atmýþ");
            break;
        }
        case 7: {
            System.out.println("yetmiþ");
            break;
        }
        case 8: {
            System.out.println("seksen");
            break;
        }
        case 9: {
            System.out.println("doksan");
            break;
        }
        }
        switch (birler) {
        case 1: {
            System.out.println("bir");
            break;
        }
        case 2: {
            System.out.println("iki");
            break;
        }
        case 3: {
            System.out.println("üç");
            break;
        }
        case 4: {
            System.out.println("dört");
            break;
        }
        case 5: {
            System.out.println("beþ");
            break;
        }
        case 6: {
            System.out.println("altý");
            break;
        }
        case 7: {
            System.out.println("yedi");
            break;
        }
        case 8: {
            System.out.println("sekiz");
            break;
        }
        case 9: {
            System.out.println("dokuz");
            break;
        }
        }
scan.close();

	}

}
