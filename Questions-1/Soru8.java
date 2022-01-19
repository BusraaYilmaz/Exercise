package soruCozumu_2;

import java.util.Scanner;

public class Soru8 {

	public static void main(String[] args) {
		
		/*
        Kulanýcýdan aracýnýn hýzýný alýnýz
        Trafik cezasýnýn deðerini hesaplayýn.
            45 hýz sýnýrýdýr.
            Eðer hýzýnýz 45-74 arasýnda ise:
            Ceza 100 $'dýr.
            Eðer hýzýnýz 75 - 84 arasýnda ise:
            Ceza 150 $'dýr.
            Eðer hýzýnýz 85 -94 arasýnda ise:
            Ceza 320 $'dýr.
            Eðer hýzýnýz 94'den daha fazla ise:
            Ceza 500 $'dýr.
            ve ayrýca,
            Eðer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.
            Örn: Hýzýnýz 77 iken cezanýz 150$'dýr ama ehliyetiniz yoksa ceza 350 $ olur.
-----------------------------------------
            Örn;
            currentSpeed(Hýzýnýz) 87
            ve isDriverLicenceAvailable(Ehliyeti var mý?) = true;
            sonuç 320 olmalýdýr.
            currentSpeed(Hýzýnýz) 65
            ve isDriverLicenceAvailable(Ehliyeti var mý?) = false;
            sonuç 300 olmalýdýr.
     */

		Scanner scan=new Scanner(System.in);
		 System.out.print("Hýzýnýzý giriniz : ");
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
