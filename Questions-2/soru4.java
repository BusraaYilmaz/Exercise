package soruCozumu_5;

import java.util.Scanner;

public class soru4 {

	public static void main(String[] args) {
		
		
		//Bakiye ��renme, para �ekme, yat�rma ve ��k�� i�lemlerinin oldu�u bankamatik pr kodlay�n�z.
		
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Java bank ATMye ho�geldiniz");
		System.out.println("1.��lem: Bakiye sorma \n2.��lem: Para yat�rma \n3.��lem: Para �ekme \n4.��lem : ��k�� ");
		
		int bakiye=5000;
		System.out.println("L�tfen yapaca��n�z i�lemi se�iniz");
		
		int secim=scan.nextInt();
		
		switch (secim) {
		case 1:
			System.out.println("Bakiyeniz : " +bakiye);
			break;
			
       case 2: 
    	   System.out.println("�ekece�iniz miktar� giriniz");
    	   int cekilenMiktar=scan.nextInt();
    	   if(cekilenMiktar>bakiye) {
    		   System.out.println("Bakiyeniz yeterli de�il");
    	   
       }else {
    	   bakiye=cekilenMiktar; //Bakiyeden �ekilen miktar� ��kard�k
    	   System.out.println("Yeni bakiyeniz :" + bakiye);
    	   
       }
			break;
			
      case 3:
    	  System.out.println("Yat�raca��n�z miktar� giriniz");
    	  int yat�r�lanMiktar=scan.nextInt();
    	  bakiye+=yat�r�lanMiktar;
    		System.out.println("Yeni bakiyeniz :" +bakiye);
    	
	  break;
	  
      case 4:
    	  System.out.println("��k�� yap�l�yor");
    	  
	  break;

	  
	  
		default:
			break;
		}
		
		
	scan.close();	

  }
}