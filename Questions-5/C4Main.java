package soruCozumu_090821;

import java.util.Scanner;

public class C4Main {
	
	public static void main(String[] args) {
	
	/*
    1 ) BMI ve MainBMI class'lar� creat ediniz +
    2 ) BMI class'� i�in field'lar� name(String), age(int), weight(double) ve height(double) olan veriable'lar olu�turup t�m veriableleri encapsule ediniz. +
    3 ) t�m  field'lar� setter getter ve  constructor creat ediniz. +
    4 ) bmi=weight/(height*height) formul�ne g�re bmi hesaplayan bir method creat ediniz. +
    5 ) bmi 18.5 ten kucukse zayif, 25 ten kucukse normal, 30 dan kucukse kilolu, 30 ustu obez durumunu veren method creat ediniz. +
)   6 ) MainBMI de  bu de�ereli yazd�r�n�z.
      */
		
	Scanner scan= new Scanner(System.in);	
		
	System.out.print("Ad�n�z� giriniz : ");
	String name=scan.nextLine();
		
	System.out.print("Ya��n�z� giriniz : ");
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
	
	
	//Syso kullanmadan yazd�rmam�z�n sebebi C4 class�nda indexHesapla methodunun void olmas�d�r.
	
scan.close();

 }
}