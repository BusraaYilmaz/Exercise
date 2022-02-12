package replit;

public class For_While_10 {

	public static void main(String[] args) {
		
		/*
		 1'den 100'e kadar olan doðal sayýlarýn toplamýný bulan programý yazýnýz.
		 OutPut: Sayilarin Toplami : 5050
		 */
		
		int toplam=0;
		
		for (int i = 1; i <= 100; i++) {
			toplam+=i;
			
		}
		System.out.println("Sayýlarýn Toplamý : "+toplam);
		
		int sayi=100;
		int toplam2=0;
		
		while (sayi>=1) {
			toplam2+=sayi;
			sayi--;
		}
		System.out.println("Sayýlarýn Toplamýýýý : "+toplam2);
	}

}
