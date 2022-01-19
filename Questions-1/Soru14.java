package soruCozumu_2;

import java.util.Scanner;

public class Soru14 {

	public static void main(String[] args) {
		// üç sayý al
		//üçgenin dik olup olmasdýðýna bak
		
		
		Scanner scan =new Scanner(System.in);
		
		System.out.print("a kenarýný giriniz");
		int a=scan.nextInt();
		
		System.out.print("b kenarýný giriniz");
		int b=scan.nextInt();
		
		System.out.print("c kenarýný giriniz");
		int c=scan.nextInt();
		
		if(a<=0 || b<=0 || c<=0) {  // NEGATÝF SAYI KONTROLÜ
			System.out.println("Hatalý giriþ yapýlmýþtýr");
		}
				
	if((a*a)+(b*b) == c*c) { // Hipotenüs c
		System.out.println("Dik üçgen oluþturur");
		
	}else if ((a*a)+(c*c) ==b*b) { //Hipotenüs b
		System.out.println("Dik üçgen oluþturur");
		
	}else if ((b*b)+(c*c)== a*a) {	//Hipotenüs a
	System.out.println("Dik üçgen oluþturur.");
	
	}else System.out.println("Dik üçgen oluþturmaz");

		
		scan.close();
	}

}
