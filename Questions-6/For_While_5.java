package replit;

public class For_While_5 {

	public static void main(String[] args) {
		/*
		100'den 0'a kadar �ift say�lar� yazd�r�n, ancak decrement(i--) kullanmay�n.
	    OUTPUT : 100 98 96 94 92 � � � � 2 0
	    
	    for (int i = 0; i <= 100; i++) {
		if (i%2==0) {
		System.out.print(i+" ");
		- D�z yazd�r�yor
		}
	
		 */
		
		int i=100;
	     
		while (i>= 0 && i<= 100) {
			
			System.out.print (i+" ");
			i-=2;
			
			
			
		}
	

	}

}
