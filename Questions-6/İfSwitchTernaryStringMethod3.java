package replit;

import java.util.Scanner;

public class ÝfSwitchTernaryStringMethod3 {

	public static void main(String[] args) {
		/*Verilen iki sayýnýn (sýfýrdan büyük veya sýfýra eþit) toplamýný hesaplayan ve yazdýran bir Java programý yazýn.
		Verilen tamsayýlar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdýrýn.
		Ornek:
		INPUT  : 25   46
		OUTPUT :
		Numaralarin Toplami: 71
		*/
		
		Scanner scan= new Scanner(System.in);
		System.out.println("s");
		
		long sayi1;
		sayi1=scan.nextLong();
		
		long sayi2;
		sayi2=scan.nextLong();
		
		long toplam= sayi1+sayi2;
		
		if (toplam >= 0 && toplam<1000000000) {
			System.out.println("Numaralarin Toplami: "+sayi1+sayi2);
			
		} else if (sayi1>1000000000 || sayi2>1000000000 || toplam>1000000000) {
			System.out.println("OverFlow");

		}

		/* 2. Yol: 
		 * 
		Scanner scan= new Scanner(System.in);
		
        long sayi1=scan.nextLong();
		long sayi2=scan.nextLong();
		
		long toplam= sayi1+sayi2;
		String degisenToplam= String.valueOf(toplam);
		
		if (toplam >= 0 && uzunluk.length() <= 10 ) {
			System.out.println("Numaralarýn toplamý : "+ toplam);
			
		} else {
			System.out.println("OverFlow");

		 */
		scan.close();
	}

}
