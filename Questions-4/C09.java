package soruCozumu_260721;

import java.util.Scanner;

public class C09 {

	
		/*
        Girilen pozitif bir say�n�n tam kare olup olmad���n� bulunuz,
        tamkare ise true  de�ilse false yazd�r�n�z.
         
         Example 1:
         Input: 16
         Output: true
         Not: bu say� tam kare ��nk� 4*4 = 16
         Example 2:
         Input: 25
         Output: true
         Note: bu say� tamkare ��nk� 5*5=25
         Example 3:
         Input: 14
         Output: false
      */
	
     public static void main(String[] args) {
    	 
     Scanner scan = new Scanner(System.in);
     System.out.print("bir say� giriniz : ");
     
     int sayi = scan.nextInt();
     int count=1;
     
     boolean b=false;
     while (count*count<=sayi) {
    	 if (count*count==sayi) {
    		 b=true;
			System.out.println(b);
		
		}
    	 count++;
    	
	} if(b==false) System.out.println("False");
     
  
scan.close();
	}

}