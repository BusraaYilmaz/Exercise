package soruCozumu_4;

import java.util.Scanner;

public class Soru8 {

	public static void main(String[] args) {
		
		
		//Soru3:Kullaniciya yasini sorun, eger yas 65’den kucuk ise “emekli olamazsin, 
		//calismalisin”, 65’den buyukse “Emekli olabilirsin” yazdirin

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen yaşınız giriniz");
		
		int yas = scan.nextInt();
		
		if(yas>100) {
			System.out.println("Miras çocuklara kaldııı");
			
		}else if (yas>65) {
			System.out.println("Emeklisin sevin");
			
		}else if (yas<0) {
			System.out.println("Doğmamışsın aq");
			
		}else if (yas<20) {
			System.out.println("Oku evladım baban gibi olma");
			
		}else if (yas<65) {
			System.out.println("Çalış köpek");
			
			scan.close();
		
		
		
		}
	}
}

