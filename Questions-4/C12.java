package soruCozumu_260721;

import java.util.Arrays;

@SuppressWarnings("unused")
public class C12 {

	public static void main(String[] args) {
		
		// Bir int Array elemanlarýnýn iþaretini (+-) deðiþtiren bir method yazýnýz.
		//input: 1,2,-3,4,-5,-6
		//output: -1,-2,3,-4,5,6
		
		int []arr= {1, 2, -3, 4, -5 ,-6};
		
		for (int w : arr) { //arr'nin her bir elemaný - ile çarpýlmasý sýra gerektirmediði için kodun hýzlý çalýþmasý için for-each kullandýk
			w*=-1;
			System.out.print(w + ",");
		}
		
sayininTersi(arr);

System.out.println();

	}

	private static int[] sayininTersi(int[] arr) {
		
		for (int w : arr) { 
			w*=-1;
			System.out.print(w + ",");
		}
		return arr;
		
	}

}
