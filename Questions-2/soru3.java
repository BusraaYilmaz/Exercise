package soruCozumu_5;

import java.util.Scanner;

public class soru3 {

	public static void main(String[] args) {
		
		
		//Kullan�c�dan ald���n�z y�l�n ay numaras�na g�re, ay�n ka� g�n oldugunu say� ile yazd�r�n�z 
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("lutfen bulundugunuz ay numars�n� giriniz : ");
        int ay=scan.nextInt();
        
        switch (ay) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            System.out.println("Girilen ay 31 g�n �ekiyor");
            break;
            
        case 4:
        case 6:
        case 9:
        case 11:
            System.out.println("Girilen ay 30 g�n �ekiyor");
            break;
            
        case 2:
            System.out.println("Y�l�n�z� giriniz");
            int yil=scan.nextInt();
            
            if (yil%4==0) {
                System.out.println("Girilen ay 29 g�n �ekiyor");
            }else {
                System.out.println("Girilen ay 28 g�n �ekiyor");
            }
            break;
        default:
            System.out.println("Hatal� giri� yapt�n�z");
            break;
        }
        
        scan.close();











		
	}

}
