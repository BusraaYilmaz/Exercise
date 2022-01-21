package soruCozumu_3;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
		
		/*
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz.
         * 
         * input : ali 
         * output: girdi�iniz kelime 3 harfli ve unique karaktere sahip
         * 
         * input : ece
         * output: girdi�iniz kelime 3 harfli ve unique karaktere sahip de�il
         */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Ad�n�z� giriniz");
		String name=scan.nextLine();
		
		char c1=name.charAt(0);
		char c2=name.charAt(1);
		char c3=name.charAt(2);
		
		String result=name.length()==3 ? ((c1!=c2 && c1!=c3 && c2!=c3) ?
				"girdi�iniz kelime 3 harfli ve unique karaktere sahip" : "girdi�iniz kelime 3 harfli fakat unique karaktere sahip de�il") : "3 karakterden farkl� bir isim girdiniz";
		
		System.out.println(result);
		
		scan.close();
		
		
		
		
		

  }
}