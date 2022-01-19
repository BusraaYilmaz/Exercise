package soruCozumu_5;

import java.util.Scanner;

public class soru4 {

	public static void main(String[] args) {
		
		
		//Bakiye öğrenme, para çekme, yatırma ve çıkış işlemlerinin olduğu bankamatik pr kodlayınız.
		
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Java bank ATMye hoşgeldiniz");
		System.out.println("1.İşlem: Bakiye sorma \n2.İşlem: Para yatırma \n3.İşlem: Para Çekme \n4.İşlem : Çıkış ");
		
		int bakiye=5000;
		System.out.println("Lütfen yapacağınız işlemi seçiniz");
		
		int secim=scan.nextInt();
		
		switch (secim) {
		case 1:
			System.out.println("Bakiyeniz : " +bakiye);
			break;
			
       case 2: 
    	   System.out.println("Çekeceğiniz miktarı giriniz");
    	   int cekilenMiktar=scan.nextInt();
    	   if(cekilenMiktar>bakiye) {
    		   System.out.println("Bakiyeniz yeterli değil");
    	   
       }else {
    	   bakiye=cekilenMiktar; //Bakiyeden çekilen miktarı çıkardık
    	   System.out.println("Yeni bakiyeniz :" + bakiye);
    	   
       }
			break;
			
      case 3:
    	  System.out.println("Yatıracağınız miktarı giriniz");
    	  int yatırılanMiktar=scan.nextInt();
    	  bakiye+=yatırılanMiktar;
    		System.out.println("Yeni bakiyeniz :" +bakiye);
    	
	  break;
	  
      case 4:
    	  System.out.println("Çıkış yapılıyor");
    	  
	  break;

	  
	  
		default:
			break;
		}
		
		
	scan.close();	

  }
}