package replit;

import java.util.Scanner;

public class ÝfSwitchTernaryStringMethod5 {

	public static void main(String[] args) {
		/*
		 Bir aydaki gün sayýsýný hesaplayan bir Java programý yazýnýz. 
		 INPUT: Ay Numarasi: 2
		 Yil : 2016 
		 OUTPUT : Subat 2016 29 Gundur.
		 */
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Bir ay numarasý giriniz");
		int ayNo=scan.nextInt();
		
		System.out.println("Bir yýl giriniz");
		int yýl=scan.nextInt();
		
		
		String ay="";
		int gun=0;
		
		
		switch (ayNo) {
		
		case 1:
		 ay="Ocak";
		 gun=31 ;
	
		break;
			
        case 2:
        	ay="Þubat";
			
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
        	ay="Mayýs";
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
        	ay="Aðustos";
        	gun=31;
        	
    	break;
    	    
        case 9:
        	ay="Eylül";
        	gun=30;
        	
    	break;
    	    
        case 10:
        	ay="Ekim";
        	gun=31;
        	
    	break;
    	    
        case 11:
        	ay="Kasým";
        	gun=30;
        	
    	break;
    	    
        case 12:
        	ay="Aralýk";
        	gun=31;
        	
    	break;

		default:
			System.out.println("Geçersiz ay no girdiniz");
			break;
		}
			
		if (ayNo==2) {
			
			if (yýl%4 !=0 ) {
				gun=28;
					
			}else if (yýl%100 !=0) {
				gun=29;
				
			}else if (yýl%400 ==0) {
				gun=29;
				
			}
				
		}
		System.out.println(ay+ " " +yýl+" "+gun+" "+ "Gündür.");
		scan.close();
	}

}
