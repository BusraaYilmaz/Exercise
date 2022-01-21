package soruCozumu_260721;

public class C13 {

	public static void main(String[] args) {
		
		// Verilen bir int Arrayde toplamlarý istenen deðere eþit olan sayý çiftlerini
		//yazdýran bir method yazýnýz.
		//int [] arr= {5,7,-6,4,2,15,3,8,1}

		int [] arr= {5,7,-6,4,2,15,3,8,1};
		int istenenToplam=9;
		
		for (int i = 0; i < arr.length; i++) { //Ýlk toplanacak sayý tekrarý -->5
			
			for (int j = i+1; j < arr.length; j++) { //Ýkinci toplanacak sayý tekrarý -->7 (5'in yanýna gelecek sayý)
				
			if	(arr[i]+arr[j]==9) {
				System.out.println(arr[i]+" ile "+arr[j]+" toplamý : "+ istenenToplam);
			}
			}
			
		}		
		
	}

}
