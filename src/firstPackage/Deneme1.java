package firstPackage;

public class Deneme1 {
	
	
	String name;
	String streetName;
	String city;
	int zipcode1;
	
	
//	public  void getAddress() {
//	 System.out.println(name+" lives "+streetName+" street in "+city);
//		
//	}
	
	public int findAddres(int zipcode) {
		System.out.println(name+" looking  for "+streetName);

		return zipcode;
		
	}
	
	
	public static void main(String[] args) {
		
		Deneme1 den= new Deneme1();
		
		
		den.name= "Matt";
		den.streetName= "Golf rd";
		den.city= "Rosemont";
		den.zipcode1=60045;
		
		
		System.out.println(den.name);
		
		int str= den.findAddres(60005);
		System.out.println(str);
		
	}

}
