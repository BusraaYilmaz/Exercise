package soruCozumu_090821;

public class C1 {

	     /*
	     * Write program as a Book class that will have 2 Constructors. While creating
	     * an object make sure: Instance variables are being initialized Both
	     * Constructors are being executed
	   
	     * Program� 2 Yap�c�ya sahip olacak bir Kitap s�n�f� olarak yaz�n.
	     *  iki kitap creat ederek  disPlay metodu ile kitaplar� yazd�r�n�z
	     */
		
	    String title, author;
	    int publish;
	    static int pages;
	    
	    public C1(String title, String author, int publish) {
	        super();
	        this.title = title;
	        this.author = author;
	        this.publish = publish;
	    }
	    public static void main(String[] args) {
	        C1 kitap1=new C1("suc ve ceza","Dostayevski",2000);
	        C1 kitap2=new C1("calikusu","Resat Nuri",1935);
	        
	        kitap1.disPlay();
	        kitap2.disPlay();
	        
	    }
	    public void disPlay() {
	        System.out.println("kitabiniz : "+title+" yazari : "+author+" yay�n yili :"+publish);
	        

	}

}
