package soruCozumu_5;

import java.util.Scanner;

public class Soru5 {

	public static void main(String[] args) {
		
		/* StringMethods
        String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
        Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
       ORNEK:
        INPUT      :  goat
                      photo
                      ghost
                      kalem
        OUTPUT :      gat
                      hoto
                      ghost
                      lem
      */
		
		Scanner scan=new Scanner (System.in);
        System.out.print("lutfen bbir kelime giriniz : ");
        String kelime=scan.nextLine();
        
        if (kelime.startsWith("gh")) {
            System.out.println(kelime);
        }else if (kelime.startsWith("g")) {
            System.out.println(kelime.substring(0, 1) + kelime.substring(2));
            
        }else if (kelime.charAt(1)=='h') {
            System.out.println(kelime.substring(1));
        }else {
            System.out.println(kelime.substring(2));
        }
        scan.close();

	}

}
