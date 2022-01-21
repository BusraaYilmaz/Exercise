package soruCozumu_3;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		
		/*
        Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         */
		
		
		Scanner scan= new Scanner(System.in);
		String alfabe="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				
		 System.out.println(alfabe.charAt(0)+" "+alfabe.substring(alfabe.indexOf("L"),alfabe.indexOf("L")+1)+" "
		 +alfabe.toLowerCase().substring(alfabe.indexOf("I"), alfabe.indexOf("I")+1));
		 
		 scan.close();

	}

}
