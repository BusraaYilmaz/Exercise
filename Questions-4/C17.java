package soruCozumu_260721;

import java.util.Scanner;

public class C17 {

	public static void main(String[] args) {
		
		// Kullan�c�dan ald���m�z 8 elemanl� Arrayin i�inde
		//ka� tane 3'e b�l�nen say� vard�r? (Negatif dahil)
		
		int []arr=new int[8];
		Scanner scan=new Scanner (System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Arrayin "+i+ ". eleman�n� giriniz : ");
			arr[i]=scan.nextInt();
		}
    int count=0;
    for (int i = 0; i < arr.length; i++) {
    	if (arr[i]%3==0) {
			count++;
		}
		
	}
    System.out.print("Arraydaki 3  tam b�l�nen eleman say�s� : "+count);
    
    
    
    scan.close();
    
	}

}
