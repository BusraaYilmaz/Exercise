package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List04 {

	public static void main(String[] args) {
		
		/*
		 Write a program that deletes the letters 'a' from the names in the list given as input.
		 Girdi olarak verilen listedeki isimlerden 'a' harflerini silen bir program yazýnýz.
         INPUT :
         list1={"Ali","Veli","Ayse","Fatma","Omer"}
         OUTPUT :
         [Veli,Omer]
		 */

		List<String> names = new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
		List<String> names2 = new ArrayList<>();
		
		for (int i = 0; i < names.size(); i++) {
			
			if (!names.get(i).toLowerCase().contains("a") ) {
				names2.add(names.get(i));
				
				
				
			}
			
		}
		System.out.println(names2);
		}

}
