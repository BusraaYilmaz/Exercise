package soruCozumu_260721;

public class C10 {

	public static void main(String[] args) {
		
		// Check your arrays first and last elements are sama
		//Dizisinin ilk ve son elemanlar�n�n ayn� olup olmad���n� kontrol eden kod yaz�n�z
		//int[]arr= {2,6,4,8,2,6,2}
		
		int[]arr= {2,6,4,8,2,6,2};
		arr[0]=2;
		arr[arr.length-1]=2;
		
		if (arr[0]==arr[arr.length-1]) {
			System.out.println("Dizinin ilk ve son eleman� e�it");
			
		}else {
			System.out.println("Dizinin ilk ve son eleman� e�it de�il");
		}
		
		
		
		
	}

}
