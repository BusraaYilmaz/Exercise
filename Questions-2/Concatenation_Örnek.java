package soruCozumu_1;

public class Concatenation_÷rnek {

	public static void main(String[] args) {
		
		int sayi=14;
		char sembol='*';
		String str= "Suko";
		
		System.out.println(sayi+str+sembol);
				
		String telefonNo="90"; //STR›NG SAYILARDAN OLUﬁUYORSA ›NTE «EV›REB›L›R›Z
		int telefonNo›nt=Integer.parseInt(telefonNo);
		
		System.out.println(telefonNo›nt++); //90 YAZAR 91 OLUR
		System.out.println(++telefonNo›nt); //92
		
		Character basHarf='b';
		System.out.println(basHarf.charValue());
		///////////////////////////////////////////
		
		String str1="Hello";
		String str2="World";
		int sayi1=3;
		int sayi2=4; //5-4
		
		//Hello1 
		//Hello7World 
		//Hello 5 World
		//Hello 34
		//7World
		//34 yaz
		
		System.out.println(str1+(sayi2-sayi1));
		System.out.println(str1+(sayi1+sayi2)+str2);
		System.out.println(str1+ " "+ (++sayi2)+ " "+str2);
		System.out.println(str1+sayi1+(--sayi2));
		System.out.println(sayi1+sayi2+str2);
		System.out.println(sayi1+""+sayi2);

		
		System.out.println(5*2==10);
		
		
				

	}

}
