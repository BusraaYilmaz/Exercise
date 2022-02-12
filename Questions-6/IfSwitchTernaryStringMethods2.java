package replit;

import java.util.Scanner;

public class IfSwitchTernaryStringMethods2 {

	public static void main(String[] args) {

		/*
		 * Kullanýcýya Adý, Soyadý ve kredi kartý numaralarýný sorarak verilen formata
		 * ceviren java kodunu yaziniz. 
		 * Input : John White 1234234534561478 
		 * Output :
		 * Name : J*** W**** CCN : **** **** **** 1478
		 * Ilk Harfler Buyuk harf ile
		 * baslamalidir.
		 */
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Adýnýzý giriniz");
		String isim=scan.nextLine();
		
		System.out.println("Soyadýnýzý giriniz");
		String soyisim=scan.nextLine();
		
		System.out.println("KKNo giriniz");
		String kkNo=scan.nextLine();
		
		String isimDüzenlenmis=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w", "*");
		
		String soyisimDüzenlenmis=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w", "*");
		
	    String kkNoDüzenlenmis =kkNo.substring(0,4).replaceAll("\\d", "*")+" "+kkNo.substring(4,8).replaceAll("\\d", "*")+" "
		+kkNo.substring(8,12).replaceAll("\\d", "*")+" " +kkNo.substring(12);
	    
	    System.out.println("Ýsim :" +isimDüzenlenmis + "\nSoyisim : "+soyisimDüzenlenmis+ "\nCCN :"+kkNoDüzenlenmis);
		
		
		
		
		
		scan.close();
		
		

	}

}
