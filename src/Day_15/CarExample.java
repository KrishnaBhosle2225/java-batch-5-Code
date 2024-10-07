class CarExample {
	
	String brand_name = "BMW";
	
	int price = 1200000;

	void getInfo() {
		System.out.println("Brand name is : "+brand_name + " price is: " + price);
	}
	
	public static void main(String ar[]) {
		
		CarExample c1 = new CarExample();
		c1.getInfo();
	}

}