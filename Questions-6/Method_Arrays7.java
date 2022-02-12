package replit;


public class Method_Arrays7 {

	public static void main(String[] args) {
		
		/*Write a method that accepts an array as parameter and returns sum off all elements in the array Then print the result in the main method.
		  Bir diziyi parametre olarak kabul eden ve dizideki tüm öðelerin toplamýný döndüren bir yöntem yazýn. Ardýndan sonucu ana yöntemde yazdýrýn.
		Eg :
		input : {1,2,3,4,5,6,7,8};
		output: 36 */
		
		int sayi[]={1,2,3,4,5,6,7,8};
		int toplam=0;
		
		for (int i = 0; i < sayi.length; i++) {
			toplam+=sayi[i];
			
		}System.out.println(toplam);
	}

}
