package soruCozumu_2;

import java.util.Scanner;

public class Soru6 {

	public static void main(String[] args) {
		
		//Kullan�c�dan alaca��n�z 5 basamakl� say�n�n ilk iki ve son iki basama��ndaki rakamlar�n toplam�n� yazn�z
		
		/*Ex:
		 * *input:12345
		 * *output:12
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("5 basamakl� bir say� giriniz :");
		int sayi=scan.nextInt();
		
		int ilkIkiSayi=sayi/1000;  //12
		
		int sonIkiSayi=sayi%100;  //45
		
		int ilkIkiSayiTop=ilkIkiSayi/10+ilkIkiSayi%10; //1-2    /10 b�l�m�nden 1 ve 12'nin  %10 kalan 2 elde edilir --->3
		int sonIkiSayiTop=sonIkiSayi/10+sonIkiSayi%10;  //4-5    /10 b�l�m�nden elde edilen b�l�m=4 %18 10 b�l�m�nden kalan 5 elde edilir --->4+5=9
	
		System.out.println("5 basamakl� say�n�n ilk iki ve son iki basama��ndaki rakamlar�n toplam�: "+ (ilkIkiSayiTop+sonIkiSayiTop));
		
		scan.close();
	}
}
