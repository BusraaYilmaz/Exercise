package soruCozumu_2;

import java.util.Scanner;

public class Soru8 {

	public static void main(String[] args) {
		
		/*
        Kulan�c�dan arac�n�n h�z�n� al�n�z
        Trafik cezas�n�n de�erini hesaplay�n.
            45 h�z s�n�r�d�r.
            E�er h�z�n�z 45-74 aras�nda ise:
            Ceza 100 $'d�r.
            E�er h�z�n�z 75 - 84 aras�nda ise:
            Ceza 150 $'d�r.
            E�er h�z�n�z 85 -94 aras�nda ise:
            Ceza 320 $'d�r.
            E�er h�z�n�z 94'den daha fazla ise:
            Ceza 500 $'d�r.
            ve ayr�ca,
            E�er s�r�c�n�n ehliyeti yoksa cezaya 200 $ eklenir.
            �rn: H�z�n�z 77 iken cezan�z 150$'d�r ama ehliyetiniz yoksa ceza 350 $ olur.
-----------------------------------------
            �rn;
            currentSpeed(H�z�n�z) 87
            ve isDriverLicenceAvailable(Ehliyeti var m�?) = true;
            sonu� 320 olmal�d�r.
            currentSpeed(H�z�n�z) 65
            ve isDriverLicenceAvailable(Ehliyeti var m�?) = false;
            sonu� 300 olmal�d�r.
     */

		Scanner scan=new Scanner(System.in);
		 System.out.print("H�z�n�z� giriniz : ");
	        int hiz=scan.nextInt();
		
		System.out.println("Ehliyetiniz var ise 1 yok ise 0 giriniz: ");
		int ehliyet=scan.nextInt();
		
		if (ehliyet==1) {
            if (hiz>44 && hiz<75) {
                System.out.println("Ceza 100 $ dir.");
            }else if (hiz>74 && hiz <85) {
                System.out.println("Ceza 150 $ dir.");
            }else if (hiz>84 && hiz <95) {
                System.out.println("Ceza 320 $ dir.");
            }else if (hiz >95 && hiz< 1000) {
                System.out.println("Ceza 500 $ dir.");
            }else {
                System.out.println("Cezaniz bulunmamaktadir.");
            }
            
        
        }else if (ehliyet==0) {
            
            if (hiz>44 && hiz<75) {
                System.out.println("Ceza 300 $ dir.");
            }else if (hiz>74 && hiz <85) {
                System.out.println("Ceza 350 $ dir.");
            }else if (hiz>84 && hiz <95) {
                System.out.println("Ceza 520 $ dir.");
            }else if (hiz >95 && hiz< 1000) {
                System.out.println("Ceza 700 $ dir.");
            }else {
                System.out.println("Ceza 1000 $ dir.");
            }
            
            
        }
        
        scan.close();
	}

}
