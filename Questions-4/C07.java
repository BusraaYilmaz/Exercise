package soruCozumu_260721;

import java.util.Scanner;

public class C07 {

		//Belirli bir(kullan�c� girecek)  y�kseklikten bir top serbest dusme ile b�rakil�maktadir.
	    // top serbest b�rak�ld�ktan  sonra s�rekli birakildigi y�ksekli�in � 75 '� kadar zeminden yukar� do�ru z�plamaktad�r
	    // Top z�plama  y�ksekli�i 1 metrenin alt�na indi�inde olay sonlandirilmaktadir.
	    // Bu ana kadar topun toplam ald��� yolu ve topun zemine  vurma say�s�n� bulunuz.
	    
		public static void main(String[] args) {
	      
			Scanner scan = new Scanner(System.in);
            System.out.print("Topun birakilacagi yuksekligi giriniz : ");
            double ilkdeger=scan.nextDouble();
            
            double yukseklik=ilkdeger;
            double mesafe=0;
            int count=0;
            
            while (yukseklik>=1) {
                
                yukseklik=yukseklik*0.75;
                count++;
                    
                mesafe+=2*yukseklik;
        
            }
            
            
            System.out.println("Topun zemine vurma say�s� : " + count);
            System.out.println("Topun ald�g� toplam yol : " + (mesafe+ilkdeger));
            
            scan.close(); 
            
	        

	}

}
