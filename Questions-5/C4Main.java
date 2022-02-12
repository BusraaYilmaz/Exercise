package soruCozumu_090821;

import java.util.Scanner;

public class C4Main {
	
	public static void main(String[] args) {
	
	/*
    1 ) BMI ve MainBMI class'larý creat ediniz +
    2 ) BMI class'ý için field'larý name(String), age(int), weight(double) ve height(double) olan veriable'lar oluþturup tüm veriableleri encapsule ediniz. +
    3 ) tüm  field'larý setter getter ve  constructor creat ediniz. +
    4 ) bmi=weight/(height*height) formulüne göre bmi hesaplayan bir method creat ediniz. +
    5 ) bmi 18.5 ten kucukse zayif, 25 ten kucukse normal, 30 dan kucukse kilolu, 30 ustu obez durumunu veren method creat ediniz. +
)   6 ) MainBMI de  bu deðereli yazdýrýnýz.
      */
		
	Scanner scan= new Scanner(System.in);	
		
	System.out.print("Adýnýzý giriniz : ");
	String name=scan.nextLine();
		
	System.out.print("Yaþýnýzý giriniz : ");
	int age =scan.nextInt();
	
	System.out.print("Boyunuzu giriniz : ");
	double boy=scan.nextDouble();
		
	System.out.print("Kilonuzu giriniz : ");
	double kilo =scan.nextDouble();
	
		
	C4 index= new C4();
	
	index.setName(name);
	index.setAge(age);
	index.setHeight(boy);
	index.setWeight(kilo);
	
	System.out.println(index.bmiHesapla(index.getHeight(), index.getWeight()));
	System.out.println(index.indexHesapla(index.bmiHesapla(index.getHeight(), index.getWeight())));
	
	
	//Syso kullanmadan yazdýrmamýzýn sebebi C4 classýnda indexHesapla methodunun void olmasýdýr.
	
scan.close();

 }
}