package soruCozumu_4;

import java.util.Scanner;

public class Soru8 {

	public static void main(String[] args) {
		
		
		//Soru3:Kullaniciya yasini sorun, eger yas 65�den kucuk ise �emekli olamazsin, 
		//calismalisin�, 65�den buyukse �Emekli olabilirsin� yazdirin

		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen ya��n�z giriniz");
		
		int yas = scan.nextInt();
		
		if(yas>100) {
			System.out.println("Miras �ocuklara kald���");
			
		}else if (yas>65) {
			System.out.println("Emeklisin sevin");
			
		}else if (yas<0) {
			System.out.println("Do�mam��s�n aq");
			
		}else if (yas<20) {
			System.out.println("Oku evlad�m baban gibi olma");
			
		}else if (yas<65) {
			System.out.println("�al�� k�pek");
			
			scan.close();
		
		
		
		}
	}
}

