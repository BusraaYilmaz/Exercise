package soruCozumu_5;

import java.util.Scanner;

public class soru2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// Kullan�c�dan al�nan �� basamakl� say�y� yaz� ile yazd�r�n�z.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen �� basmakl� bir say� giriniz");
		int sayi=scan.nextInt();
		
		 // 316 �� y�z on alt�
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
            System.out.println("��");
            break;
        }
        case 4: {
            System.out.println("d�rt");
            break;
        }
        case 5: {
            System.out.println("be�");
            break;
        }
        case 6: {
            System.out.println("alt�");
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
            System.out.println("k�rk");
            break;
        }
        case 5: {
            System.out.println("elli");
            break;
        }
        case 6: {
            System.out.println("atm��");
            break;
        }
        case 7: {
            System.out.println("yetmi�");
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
            System.out.println("��");
            break;
        }
        case 4: {
            System.out.println("d�rt");
            break;
        }
        case 5: {
            System.out.println("be�");
            break;
        }
        case 6: {
            System.out.println("alt�");
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
