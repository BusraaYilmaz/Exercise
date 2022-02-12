package replit;

import java.util.Scanner;

public class Method_Arrays3 {

	public static void main(String[] args) {
		
		/*
		Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.
		Bir String'i parametre olarak kabul eden ve verilen String'de bulunan rakamlarýn toplamýný yazdýran bir method yazýn.
		input : ade1r4d3
		output : 8
		Hint : Use Character.isDigit()
		       Integer.valueOf()
		*/
		
       Scanner scan=new Scanner (System.in);
        
        System.out.println("Bir String giriniz (Ýcinde harf ve kelime olsun)");
        String str=scan.next();
        
        System.out.println(rakamMi(str));
        scan.close();
        
        /*  ALTERNATÝF YOL
        String str= "ade1r4d3";
        int sum=0;
        
        String arr[]= str.split("");
        
        System.out.println(Arrays.toString(arr));
        
        for (String each : arr) {
            
            if(Character.isDigit(Integer.valueOf(each.charAt(0)))) {
           
            sum+=Integer.valueOf(each);
            } else {
                continue;
            }
        }
        System.out.println(sum);
         */
    }
    private static int rakamMi(String str) {
        int toplam =0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='0' && str.charAt(i)<='9') {
                toplam+=Integer.valueOf(str.substring(i, i+1));
            }
        }
        return toplam;
	}

}
