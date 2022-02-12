package replit;

import java.util.Scanner;

public class IfSwitchTernaryStringMethods1 {

	public static void main(String[] args) {
		
		/*Kullan�c�ya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yaz�n (BMI)
		IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
		BMI 18,5'in alt�ndaysa zay�fs�n�z
		BMI 18,5 ile 25 aras�nda ise kilonuz idealdir
		BMI 25-30 aras�ndaysa �i�mans�n�z
		BMI 30'dan b�y�k veya e�itse, obez
		
		Input:
		Output:
		Agirlik : 71
		Boy : 1,72
		BMI : 23.99945916711736
		Zayifsiniz.
		*/
		
		Scanner scan= new Scanner(System.in);
		System.out.println("L�tfenkilo ve boyunuzu giriniz");
		
		double boy=scan.nextDouble();
		double kilo=scan.nextDouble();
		
		
	    double bmi=kilo/(boy*boy);
	  
	  System.out.println("BMI : "+ bmi);
		
		if (bmi<18.5) {
			System.out.println("Zay�fs�n�z");
			
		}else if (bmi>=18.5 || bmi<25) {
			System.out.println("Kilonuz idealdir");
			
		}else if (bmi>=25 || bmi<30) {
			System.out.println("�i�mans�n�z");
			
		} else {
			System.out.println("Obezsiniz");

		}
scan.close();
	}

}
