package soruCozumu_4;

import java.util.Scanner;

public class Soru7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
        Scanner scan=new Scanner (System.in);
        
        System.out.print("Lutfen bir kelime giriniz : ");
        String kelime=scan.next().toLowerCase();
        
        System.out.print("Lutfen bir cumle giriniz : ");
        String cumle=scan.nextLine().toLowerCase();
        
        
        if (cumle.indexOf(kelime)==-1) {
            System.out.println("Girilen kelime cumlede kullanilmamis.");
            
        }else if (cumle.indexOf(kelime)!=cumle.lastIndexOf(kelime)) {
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
        }else if (cumle.indexOf(kelime)==cumle.lastIndexOf(kelime)) {
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
	}
scan.close();
}
}