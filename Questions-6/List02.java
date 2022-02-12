package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List02 {

	public static void main(String[] args) {
		
/*
   Create a 10-element list. Swap the 8th element with the 3rd element.
   10 elemanlý bir liste oluþturun. 8. öðeyi 3. öðeyle deðiþtirin.
   INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
   Output:
   [Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
 */
		
	List<String> names = new ArrayList<>(Arrays.asList("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
	
	String temp=names.get(7);
	names.set(7, names.get(2));
	names.set(2, temp);
	
	System.out.println(names);
		
		
		

	}

}
