package soruCozumu_260721;

import java.util.Arrays;

public class C15 {

	public static void main(String[] args) {
		
		// Arrayin iç arraylerindeki tüm elemanlarýn toplamýný birer birer bulan
		//Ve her bir sonucu yeni bir arrayin elemaný yapan ve yeni arrayi ekrana yadýran programý yazýnýz
		//input: {{10,20,30},{4},{6,7,20}} --->Output:{60,4,33}
		
		//0.Kat:{10,20,30}
		//1.Kat:{4}
		//2.Kat:{6,7,20}

		
		int apt[][]={{10,20,30},{4},{6,7,20}};
		
		int sonuc[] = new int[apt.length];
		
		for (int kat = 0; kat < apt.length; kat++) { //Katlara girme döngüsü
			
			for (int daire = 0; daire < apt[kat].length; daire++) { //Dairelere girme döngüsü
			sonuc[kat]+=apt[kat][daire];
			}
			System.out.println(Arrays.toString(sonuc));
			
		}
		
		
		
		
		
		
		
		
		
	}

}
