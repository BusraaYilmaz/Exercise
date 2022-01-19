package soruCozumu_5;

import java.util.Scanner;

public class soru1 {

	public static void main(String[] args) {
		// Kullanýcýdan notunu alýn ve aþaðýdaki kurallara göre ekrana A, B, C veya D yazdýrýn.
        // 1. 0()dahil ile 50 arasi - D   
        // 2. 50(dahil) ile 60 arasý - C   
        // 3. 60(dahil) ile 80 arasý - B  
        // 4. 80(dahil) ustu- A
        // Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
        // switch() kullanarak yapiniz.
        
        // switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
        // switch() de int, byte, short, char, String kullanilir.
		
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Lütfen notunuzu giriniz : ");
		
		int not=scan.nextInt();
	
		if(not>=0 && not<50) {
			not=1;
		}else if (not>=50 && not<60) {
			not=2;
		}else if( not>=60 && not<80) {
			not=3;
		}else if (not>=80 && not<=100) {
			not=4;			
		}else {
			System.out.println("Geçerli not giriniz");
		}
		
		switch (not) {
		case 1: {
			System.out.println("Notunuz D");
			break;
			
		}
		case 2:{
			System.out.println("Notunuz C");
			break;
		}
		case 3:{
			System.out.println("Notunuz B");
			break;
			
		}
		case 4:{ 
			System.out.println("Notunuz A");
			break;
		}
		default:
			System.out.println("Hatalý not girdiniz");
			
		}
		
		scan.close();
	}

}
