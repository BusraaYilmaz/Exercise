package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class List01 {

	public static void main(String[] args) {
		
	 /* Write a Java program to get a String from user as input and find the maximum occurring character in that string. (Ignore case sensitivity)
	  
		input : Learning java is easy
		output: maximum occurring character is : a  */

        
        String str="Learning java is easy";
        String str2=str.replaceAll("\\W", "" );
        System.out.println(str2);
        
        char harf[]=str2.toCharArray();
        System.out.println(Arrays.toString(harf));
        
        int[] sayac = new int[str2.length()];
        
        for(int i=0; i < str2.length(); i++) {  
            sayac[i] = 1;  
            
            for(int j = i+1; j < str2.length(); j++) {  
                
                if(harf[i] == harf[j] && harf[i] != '0') {  
                    sayac[i]++;  
                    harf[j] =  '0';  
                }  
            }  
        }  
        
        
        int max = sayac[0]; 
        char maxChar= harf[0];
        
        for(int i = 0; i <sayac.length; i++) {  
             if(max < sayac[i]) {  
                    max = sayac[i];  
                    maxChar = harf[i];  
                }  
            }  
        
        System.out.println("Maximum occurring character: " + maxChar +"\nand this char repeat " +max+ " times.") ;   
			
		}
		
		}

		
		
/*List <String> harf = new ArrayList<>();
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Bir cumle giriniz : ");
		String cumle=scan.nextLine().replaceAll("\\W", "");
	
		String cumleArray[]= cumle.split("");
		
		System.out.println(Arrays.toString(cumleArray));
		
		int count = 0;
		String tekrarEdenHarf="";

		for (int i = 0; i < cumleArray.length; i++) {

			
			
			count++;  */