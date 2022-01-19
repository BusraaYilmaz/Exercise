package soruCozumu_2;

import java.util.Scanner;

public class Soru10 {

	public static void main(String[] args) {
		
		//C=(F-32)*5/9
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Fahrenheit deðerini yazýnýz");
		
		double f=scan.nextDouble();
		double c=(f-32)*5/9;
		
		System.out.println("Fahrenheit deðerinin Celcus eþiti :"+c);
		
		scan.close();
		
	}

}
