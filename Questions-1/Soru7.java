package soruCozumu_2;

import java.util.Scanner;

public class Soru7 {

	public static void main(String[] args) {
		
		/*
        Kullanicidan kilosunu ve boyunu alip
        Vucut kitle indeksini hesaplayan bir program yaziniz.
        Ipucu : Vucut 
        Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi cm.)
        ORNEK:
        INPUT      : Kilo: 71
                   :Boy: 1,72
        OUTPUT  : Vucut Kitle Indeksiniz : 23
            */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Kilonuzu giriniz");
		
		double kilo=scan.nextDouble();
		
		System.out.println("Boyunuzu cm cinsinden giriniz");
		double boy= scan.nextDouble();
		boy/=100;
		
		double indeks=kilo/(boy*boy);
		System.out.println("Ýndeksiniz :" + indeks);
		
		scan.close();
	}

}
