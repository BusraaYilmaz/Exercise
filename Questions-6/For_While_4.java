package replit;


import java.util.Scanner;

public class For_While_4 {

	public static void main(String[] args) {

		/*
		  Girdi olarak bir tamsayý kabul eden ve faktöriyel hesaplayan programi yazýnýz.
		 
		  Input : 6
		  Output: 6!=6*5*4*3*2*1=720
		
		 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Sayý giriniz");
		
		int sayi=scan.nextInt();
		int faktoriyel=1;
		
		for (int i = 1; i <= sayi; i++) {
			faktoriyel*=i;
		}
		
		String son="";
		for (int i = sayi; i > 1; i--) {
			son+=i +"*";
		}
		
		System.out.println(sayi+"!="+son+"1=" +faktoriyel);
scan.close();
	}

}
