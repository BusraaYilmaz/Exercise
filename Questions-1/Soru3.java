package soruCozumu_2;

import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {
		
	 /*
        * Kullanicidan uc basamakli bir sayi alin 
        * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
        * 
        * 
        * Ornek : Inputs : 853 
        * Output : Girdiginiz sayinin birler basamagi : 3
        *          Girdiginiz sayinin onlar basamagi : 5 
        *          Girdiginiz sayinin yuzler basamagi : 8
        
        */
		
		Scanner scan= new Scanner(System.in);
		System.out.print("L?tfen 3 basamakl? bir say? giriniz :");
		
		int sayi = scan.nextInt();
		
		
		int birler=sayi%10;  
		int onlar=sayi/10%10;     
		int y?zler=sayi/100%10;
		
		System.out.println("Girdi?iniz say?n?n birler basama?? : "+birler);
		System.out.println("Girdi?iniz say?n?n onlar basama?? :" +onlar);
		System.out.println("Girdi?iniz say?n?n y?zler basama?? :"+y?zler);
		
		System.out.println("Girdi?iniz say?n?n birler basama?? : "+birler+"\n"+"Girdi?iniz say?n?n onlar basama?? :" +onlar+"\n"+"Girdi?iniz say?n?n y?zler basama?? :"+y?zler);
		
		
		scan.close();
	}

}
