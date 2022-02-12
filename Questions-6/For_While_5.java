package replit;

public class For_While_5 {

	public static void main(String[] args) {
		/*
		100'den 0'a kadar çift sayýlarý yazdýrýn, ancak decrement(i--) kullanmayýn.
	    OUTPUT : 100 98 96 94 92 … … … … 2 0
	    
	    for (int i = 0; i <= 100; i++) {
		if (i%2==0) {
		System.out.print(i+" ");
		- Düz yazdýrýyor
		}
	
		 */
		
		int i=100;
	     
		while (i>= 0 && i<= 100) {
			
			System.out.print (i+" ");
			i-=2;
			
			
			
		}
	

	}

}
