package soruCozumu_2;

import java.util.Scanner;

public class Soru11 {

	public static void main(String[] args) {
		// Kullan�c�dan 3 pozitif say� al�n�z. Bu �� say�n�n ��gen olu�turmas� durumunu kontrol ediniz.
		//E�er ��gen oluyorsa e� kenar olma durumunu kontrol et
		//a+b>c>a-b
		//a+c>b>a-c
		//b+c>a>b-c
		//a=b=c ise e�kenar ��gen
		
		Scanner scan=new Scanner(System.in);
		System.out.println("a kenar�n� giriniz : ");
		int a=scan.nextInt();
		
		System.out.println("b kenar� giriniz :");
		int b=scan.nextInt();
		
		System.out.println("c kenar�n� giriniz :");
		int c=scan.nextInt();
		
		if (a+b>c && a-b<c && a+c>b && a-c<b && b+c>a && b-c<a) {
			if (a==b && b==c) { //��genin e�kenarl���n� kontrol eder.
				System.out.println("��geniniz e�kenar");
			} else System.out.println("��geniniz e�kenar de�il");	//��gen ama e�kenar olmama durumu
			
		}else System.out.println("girdi�iniz bir ��gen belirtmez");//��gen olmamam durumu
		
		scan.close();
	}

}
