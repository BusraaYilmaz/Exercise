package soruCozumu_5;

import java.util.Scanner;

public class soru3 {

	public static void main(String[] args) {
		
		
		//Kullanýcýdan aldýðýnýz yýlýn ay numarasýna göre, ayýn kaç gün oldugunu sayý ile yazdýrýnýz 
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("lutfen bulundugunuz ay numarsýný giriniz : ");
        int ay=scan.nextInt();
        
        switch (ay) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            System.out.println("Girilen ay 31 gün çekiyor");
            break;
            
        case 4:
        case 6:
        case 9:
        case 11:
            System.out.println("Girilen ay 30 gün çekiyor");
            break;
            
        case 2:
            System.out.println("Yýlýnýzý giriniz");
            int yil=scan.nextInt();
            
            if (yil%4==0) {
                System.out.println("Girilen ay 29 gün çekiyor");
            }else {
                System.out.println("Girilen ay 28 gün çekiyor");
            }
            break;
        default:
            System.out.println("Hatalý giriþ yaptýnýz");
            break;
        }
        
        scan.close();











		
	}

}
