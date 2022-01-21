package soruCozumu_260721;

import java.util.Arrays;


public class C16 {

	public static void main(String[] args) {
		
		// 2 boyutlu bir diziyi kabul eden ve maksimum deðeri bulan bir method yazýnýz
		//input: {{1,2,-3},{41,5},{6,7,18}}
		//Output:41
		
		int arr [][]={{1,2,-3},{41,5},{6,7,18}};
		int uzunluk=0;
		
		
		for (int i = 0; i < arr.length; i++) {
			uzunluk+=arr[i].length;
			
		}int yeniArr[]=new int[uzunluk];
		int sayac=0;
		
        for (int i = 0; i <arr.length; i++) {
        	for (int j = 0; j < arr[i].length; j++) {
        		yeniArr[sayac]=arr[i][j];
        		sayac++;
				
			}
  
}
        Arrays.sort(yeniArr);
        System.out.println("Arrayin max elemaný: "+ yeniArr[yeniArr.length-1]);
	}

}
