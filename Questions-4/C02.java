package soruCozumu_260721;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		
		// kullan�c�dan al�nan bir stringdeki indexi tek  olan karakterleri yazdiriniz.
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir metin giriniz : ");
        
        String str=scan.nextLine();
        
        int i=0;
        
        do {
        	if (i%2==1) {
				System.out.print(str.charAt(i)+", "); //�ndexi char yazd�rd�k
			}
        	i++;
			
		} while (i<str.length());
scan.close();
	}

}
