package replit;

public class Method_Arrays1 {

	public static void main(String[] args) {
		
		/* Write a return method to reverse number.
		 * Sayıyı tersine çevirmek için bir method yazın.
				Input  : 12345
				Output : 54321
        */
		
		int sayi=12345;
		tersCevir(sayi);
		
	}

	private static void tersCevir(int sayi) {
		
	int tersSayi=0;
	
	while(sayi != 0) {
		
		tersSayi=tersSayi*10;
		tersSayi=tersSayi+sayi%10;
		sayi=sayi/10;
		
	}
	System.out.println(tersSayi);	
		
	}
	
	/*
	 int num=12345;
        
        System.out.println(reserve(num));
        System.out.println(num+reserve(num));
        
    }
    private static int reserve(int num) {
        
        String[] arr=Integer.toString(num).split("");
        
        System.out.println(Arrays.toString(arr));
        String[] arr2=new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(arr2));
        String out="";
        for (int i = 0; i < arr2.length; i++) {
            out+=arr2[i];
        }
        int bus= Integer.parseInt(out);
        return bus;
    }
	 */
}
