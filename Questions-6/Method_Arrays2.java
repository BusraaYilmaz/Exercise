package replit;

import java.util.Arrays;
import java.util.Scanner;

public class Method_Arrays2 {

	public static void main(String[] args) {
		
		/*
		 Write a Java program that reverse a sentence by using Array (with all spaces and special characters).
		 Array (tüm boþluklar ve özel karakterlerle) kullanarak bir cümleyi tersine çeviren bir Java programý yazýn.
		 Input  : Coding is greate.
		 Output : .etaerg si gnidoC
        */
		Scanner scan= new Scanner(System.in);
		System.out.println("Bir cümle giriniz");
		String cumle=scan.nextLine();
		
		String arr[]=cumle.split("");
		System.out.println(Arrays.toString(arr));
		
		
		for (int i = arr.length-1; i >= 0; i--) {
			
			System.out.print(arr[i]);
			
		}
		
		
		
	scan.close();	
		
		
	}

}
