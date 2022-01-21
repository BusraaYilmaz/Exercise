package soruCozumu_260721;

import java.util.Scanner;

public class C07 {

		//Belirli bir(kullanıcı girecek)  yükseklikten bir top serbest dusme ile bırakilımaktadir.
	    // top serbest bırakıldıktan  sonra sürekli birakildigi yüksekliğin ¾ 75 'İ kadar zeminden yukarı doğru zıplamaktadır
	    // Top zıplama  yüksekliği 1 metrenin altına indiğinde olay sonlandirilmaktadir.
	    // Bu ana kadar topun toplam aldığı yolu ve topun zemine  vurma sayısını bulunuz.
	    
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
            
            
            System.out.println("Topun zemine vurma sayısı : " + count);
            System.out.println("Topun aldıgı toplam yol : " + (mesafe+ilkdeger));
            
            scan.close(); 
            
	        

	}

}
