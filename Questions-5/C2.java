package soruCozumu_090821;

public class C2 {

	 /*     Write program as a Student class   that has instance variables name and address.
	     *  Create a constructor that will initialize those variables. 
	     *  Print name & address of given  student by the displayInfo method.
	     *  
	     *  Program�, �rnek de�i�kenlerin (instance variables) ad� ve adresi olan bir Student s�n�f� olarak yaz�n.
	     *   Bu de�i�kenleri ba�latacak bir kurucu --> constructor olu�turun. 
	     *   DisplayInfo methodu  verilen ��rencinin ad�n� ve adresini yazd�r�n.
	     */
	    
	    String name;
	    String address;
	    
	    public C2(String name, String address) {
	        super();
	        this.name = name;
	        this.address = address;
	    }
	    
	    
	    public static void main(String[] args) {
	        C2 ogrnc= new C2("Tolga Demir","b�y�k dut aac�n�n alt�");
	        ogrnc.DisplayInfo();
	        
	    }
	    private void DisplayInfo() {
	        System.out.println(name+ " "+address);
	}

}
