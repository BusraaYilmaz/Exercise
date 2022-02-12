package replit;

import java.util.Scanner;

public class ÝfSwitchTernaryStringMethod4 {

	public static void main(String[] args) {
		
		/*  Char deðiþken yanýtýnýn deðerini test eden ve aþaðýdaki iþlemleri gerçekleþtiren bir switch ifadesi yazýn:
			yanýt a ise,
			"Talebiniz iþleniyor" mesajý yazdýrýlýr
			yanýt b ise,
			"yine de ilgilendiðiniz için teþekkür ederiz" mesajý yazdýrýlýr
			yanýt c ise,
			"Üzgünüz, þu anda herhangi bir yardým yok" mesajý yazdýrýlýr
			baþka herhangi bir yanýt deðeri için,
			"Geçersiz giriþ, lütfen tekrar deneyin!" yazdýrýlýr
			*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Yanýtýnýzý giriniz");
		
		char yanýt=scan.next().charAt(0);
		
		switch(yanýt) {
 
	   case 'a':
		System.out.println("Talebiniz iþleniyor");
		break;
	   case 'b':
		System.out.println("yine de ilgilendiðiniz için teþekkür ederiz");
		break;
	   case 'c':
		System.out.println("Üzgünüz, þu anda herhangi bir yardým yok");
		break;
		
		default :
			System.out.println("Geçersiz giriþ, lütfen tekrar deneyin!");
		}
		scan.close();
	}

}
