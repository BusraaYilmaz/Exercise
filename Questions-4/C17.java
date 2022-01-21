package soruCozumu_260721;

import java.util.Scanner;

public class C17 {

	public static void main(String[] args) {
		
		// Kullanýcýdan aldýðýmýz 8 elemanlý Arrayin içinde
		//kaç tane 3'e bölünen sayý vardýr? (Negatif dahil)
		
		int []arr=new int[8];
		Scanner scan=new Scanner (System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Arrayin "+i+ ". elemanýný giriniz : ");
			arr[i]=scan.nextInt();
		}
    int count=0;
    for (int i = 0; i < arr.length; i++) {
    	if (arr[i]%3==0) {
			count++;
		}
		
	}
    System.out.print("Arraydaki 3  tam bölünen eleman sayýsý : "+count);
    
    
    
    scan.close();
    
	}

}
