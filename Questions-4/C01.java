package soruCozumu_260721;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		// kullanýcýdan alýnan bir sayinin Armstrong sayi olup olmadigini kontrol eden program yazin
        // Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        // 153 = (1*1*1) + (5*5*5) + (3*3*3) gibi
        
                
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen Armstrong oldugunu kontrol edeceginiz tamsayiyi yaziniz : ");
        int sayi =scan.nextInt();
        
        int ilkdeger=sayi;  //Ýlk deðer atanmaz ise sayý deðeri while iþleminden sonra deðiþerek 0 oluyor.
        int rakam;
        int kuplerToplamý=0;
        
        while (sayi!=0) {
        	rakam=sayi%10;
        	sayi/=10;
        	kuplerToplamý+=rakam*rakam*rakam;
        }
if (kuplerToplamý==ilkdeger) { System.out.println("Gayet baþarýlý sayý Amstrong :)");
	
} else { System.out.println("Baþarýsýz sayý Amstrong deðil :(");

}
scan.close();
	}

}
