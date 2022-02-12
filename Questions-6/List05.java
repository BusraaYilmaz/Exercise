package replit;

import java.util.Scanner;

public class List05 {

	public static void main(String[] args) {
		
		/*
		Write a program that accepts an integer as input and prints first 10 prime numbers greater than input Check numbers if they are even or not in a return method.
        Girdi olarak bir tamsayý kabul eden ve girdiden büyük ilk 10 asal sayýyý ekrana yazdýran bir program yazýnýz.
        Input : 5
        Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
		 */

		Scanner scan= new Scanner(System.in);
		
		System.out.println("Bir sayi giriniz");
		int num= scan.nextInt();
		
		int i=2;
		boolean flag= false;
		
		while(i <= num/2) {
			
			if (num%i==0) {
				flag = true;
				break;
			} 
				++i;
		}
			if (!flag)
			      System.out.println(num + " is a prime number.");
			    else
			      System.out.println(num + " is not a prime number.");
			
			
		}
	}


