package soruCozumu_090821;

public class C4 {
	
	
        private String name;
		private int age;
		private double weight;
		private double height;
		
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public double getWeight() {
			return weight;
		}
		public void setWeight(double weight) {
			this.weight = weight;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		
	
		public double bmiHesapla(double height, double weight) {
			
		double bmi=weight/(height*height);
		
		return bmi;
		
		}
		
		
		public String indexHesapla(double bmi) {
			
			if (bmi<18.5) {
				return "Zayýfsýnýz";
				
			}else if (bmi>=18.5 && bmi<25) {
				return "Kilonuz idealdir";
				
			}else if (bmi>=25 && bmi<30) {
			return "Þiþmansýnýz";
				
			} else {
				return "Obezsiniz";

			}
		
	}

}
