package soruCozumu_260721;

public class C13 {

	public static void main(String[] args) {
		
		// Verilen bir int Arrayde toplamlar� istenen de�ere e�it olan say� �iftlerini
		//yazd�ran bir method yaz�n�z.
		//int [] arr= {5,7,-6,4,2,15,3,8,1}

		int [] arr= {5,7,-6,4,2,15,3,8,1};
		int istenenToplam=9;
		
		for (int i = 0; i < arr.length; i++) { //�lk toplanacak say� tekrar� -->5
			
			for (int j = i+1; j < arr.length; j++) { //�kinci toplanacak say� tekrar� -->7 (5'in yan�na gelecek say�)
				
			if	(arr[i]+arr[j]==9) {
				System.out.println(arr[i]+" ile "+arr[j]+" toplam� : "+ istenenToplam);
			}
			}
			
		}		
		
	}

}
