package replit;

import java.util.Arrays;

public class Method_Arrays8 {

	public static void main(String[] args) {
		
		/*Write a return method that accepts 2 integer Arrays as parameters And adds 2 array into a new Array and prints it.
		  2 tamsay� diziyi parametre olarak kabul eden ve yeni bir diziye 2 dizi ekleyen ve yazd�ran bir d�n�� y�ntemi yaz�n
				Input1={1,2,3,4}
				Input2={5,6}
				Output={1,2,3,4,5,6} */
		
		int sayi1[]={1,2,3,4};
		int sayi2[]={5,6};
		
	
		int a=sayi1.length;
		int b=sayi2.length;
		
		int[] toplam= new int [a+b];
		System.out.println(Arrays.toString(toplam));
		
		
		
		
	}

}
