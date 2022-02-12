package soruCozumu_090821;

import java.util.Scanner;

public class C3Main {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Adýnýzý giriniz : ");
		String name=scan.nextLine();
		
		System.out.print("Yaþýnýzý giriniz : ");
		int age =scan.nextInt();
		
		
		C3 student1= new C3();
		
		student1.setName(name);
		student1.setAge(age);
		
		System.out.println("Student name is "+ student1.getName().substring(0,1).toUpperCase()+
				student1.getName().substring(1).toLowerCase()+"\nAge :"+student1.getAge());
		
scan.close();
	}

}
