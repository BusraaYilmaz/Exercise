package soruCozumu_260721;

public class C14 {

	public static void main(String[] args) {
		
		
		// Dizi elemanlar�n�n ortalama de�erini hesaplayan ve
		//ortalamadan b�y�k olan elemanlar� yazd�ran bir java program� yaz�n�z.
		//input[]: {1,2,3,4,5,6,7}
		//output[]:4
		
		double toplam=0;
		int arr[]={1,2,3,4,5,6,7};
		
		for (int w : arr) {
			toplam+=w;
			
		}
		double ortalama=toplam/arr.length;
		System.out.println("Arraydaki elemanlar�n ortalamas� : "+ ortalama); //4.0
		
		for (int k : arr) {
			if (k>ortalama) {
				System.out.println("Arrayin ortalamadan b�y�k elemanlar� : " +k);
				
			}
			
		}

	}

}
