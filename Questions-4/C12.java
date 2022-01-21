package soruCozumu_260721;

import java.util.Arrays;

@SuppressWarnings("unused")
public class C12 {

	public static void main(String[] args) {
		
		// Bir int Array elemanlar�n�n i�aretini (+-) de�i�tiren bir method yaz�n�z.
		//input: 1,2,-3,4,-5,-6
		//output: -1,-2,3,-4,5,6
		
		int []arr= {1, 2, -3, 4, -5 ,-6};
		
		for (int w : arr) { //arr'nin her bir eleman� - ile �arp�lmas� s�ra gerektirmedi�i i�in kodun h�zl� �al��mas� i�in for-each kulland�k
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
