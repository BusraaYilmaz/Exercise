package replit;

import java.util.Scanner;

public class �fSwitchTernaryStringMethod5 {

	public static void main(String[] args) {
		/*
		 Bir aydaki g�n say�s�n� hesaplayan bir Java program� yaz�n�z. 
		 INPUT: Ay Numarasi: 2
		 Yil : 2016 
		 OUTPUT : Subat 2016 29 Gundur.
		 */
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Bir ay numaras� giriniz");
		int ayNo=scan.nextInt();
		
		System.out.println("Bir y�l giriniz");
		int y�l=scan.nextInt();
		
		
		String ay="";
		int gun=0;
		
		
		switch (ayNo) {
		
		case 1:
		 ay="Ocak";
		 gun=31 ;
	
		break;
			
        case 2:
        	ay="�ubat";
			
		break;
			
        case 3:
        	ay="Mart";
        	gun=31;
	
	    break;
	
        case 4:
        	ay="Nisan";
        	gun=30;
	
	    break;
	
        case 5:
        	ay="May�s";
        	gun=31;
        	
	
	    break;
	    
        case 6:
        	ay="Haziran";
        	gun=30;
        	
    	break;
    	    
        case 7:
        	ay="Temmuz";
        	gun=31;
        	
    	break;
    	    
        case 8:
        	ay="A�ustos";
        	gun=31;
        	
    	break;
    	    
        case 9:
        	ay="Eyl�l";
        	gun=30;
        	
    	break;
    	    
        case 10:
        	ay="Ekim";
        	gun=31;
        	
    	break;
    	    
        case 11:
        	ay="Kas�m";
        	gun=30;
        	
    	break;
    	    
        case 12:
        	ay="Aral�k";
        	gun=31;
        	
    	break;

		default:
			System.out.println("Ge�ersiz ay no girdiniz");
			break;
		}
			
		if (ayNo==2) {
			
			if (y�l%4 !=0 ) {
				gun=28;
					
			}else if (y�l%100 !=0) {
				gun=29;
				
			}else if (y�l%400 ==0) {
				gun=29;
				
			}
				
		}
		System.out.println(ay+ " " +y�l+" "+gun+" "+ "G�nd�r.");
		scan.close();
	}

}
