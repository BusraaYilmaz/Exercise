package soruCozumu_260721;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		// kullan�c�dan al�nan bir sayinin Armstrong sayi olup olmadigini kontrol eden program yazin
        // Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        // 153 = (1*1*1) + (5*5*5) + (3*3*3) gibi
        
                
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen Armstrong oldugunu kontrol edeceginiz tamsayiyi yaziniz : ");
        int sayi =scan.nextInt();
        
        int ilkdeger=sayi;  //�lk de�er atanmaz ise say� de�eri while i�leminden sonra de�i�erek 0 oluyor.
        int rakam;
        int kuplerToplam�=0;
        
        while (sayi!=0) {
        	rakam=sayi%10;
        	sayi/=10;
        	kuplerToplam�+=rakam*rakam*rakam;
        }
if (kuplerToplam�==ilkdeger) { System.out.println("Gayet ba�ar�l� say� Amstrong :)");
	
} else { System.out.println("Ba�ar�s�z say� Amstrong de�il :(");

}
scan.close();
	}

}
