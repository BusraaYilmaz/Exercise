package replit;

import java.util.Arrays;

public class Method_Arrays6 {

	public static void main(String[] args) {
		/*
		 Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array
		 Girdi olarak bir tamsay� dizisini kabul eden ve verilen diziden minimum ve maksimum say�lar� yazd�ran bir y�ntem yaz�n
         Input : {3,2,5,4,1,6}
         Output :
         min: 1
         max: 6
		 */
		
		 int sayi [] = {3,2,5,4,1,6};
		 Arrays.sort(sayi);
		 System.out.println("K���kten b�y��e s�ralanm�� hali :"+Arrays.toString(sayi));
		 
		 System.out.println("Max : "+ sayi[0]);
		 System.out.println("Max : "+ sayi[sayi.length-1]);
		 
		 
		
		
		 
		

	}

}
