package soruCozumu_2;

import java.util.Scanner;

public class Soru11 {

	public static void main(String[] args) {
		// Kullanýcýdan 3 pozitif sayý alýnýz. Bu üç sayýnýn üçgen oluþturmasý durumunu kontrol ediniz.
		//Eðer üçgen oluyorsa eþ kenar olma durumunu kontrol et
		//a+b>c>a-b
		//a+c>b>a-c
		//b+c>a>b-c
		//a=b=c ise eþkenar üçgen
		
		Scanner scan=new Scanner(System.in);
		System.out.println("a kenarýný giriniz : ");
		int a=scan.nextInt();
		
		System.out.println("b kenarý giriniz :");
		int b=scan.nextInt();
		
		System.out.println("c kenarýný giriniz :");
		int c=scan.nextInt();
		
		if (a+b>c && a-b<c && a+c>b && a-c<b && b+c>a && b-c<a) {
			if (a==b && b==c) { //Üçgenin eþkenarlýðýný kontrol eder.
				System.out.println("Üçgeniniz eþkenar");
			} else System.out.println("Üçgeniniz eþkenar deðil");	//Üçgen ama eþkenar olmama durumu
			
		}else System.out.println("girdiðiniz bir üçgen belirtmez");//Üçgen olmamam durumu
		
		scan.close();
	}

}
