package soruCozumu_2;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
		 /*  Problem Tan�m�
        Mesafeyi ve h�z� al�p s�reyi hesaplayan bir kod yaz�n�z.
        �rne�in:�stanbul ile Ankara aras� 400km olarak �l��lmektedir. Bu yolu ortalama
        120 km/saat h�zla giden bir ara� ne kadar s�rede hedefe var�r?
        �rnek Ekran ��kt�s�
        Mesafeyi giriniz: 400
        H�z� giriniz: 100
        S�re 4 saattir.
     */

		Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen gitmek istedi�iniz km giriniz");
		int mesafe=scan.nextInt();
		
		System.out.println("L�tfen h�z�n�z� giriniz");
		int h�z= scan.nextInt();
		
		System.out.println("Varaca��n�z s�re :" +mesafe/h�z + " saat");
		
		
		scan.close();	}

}
