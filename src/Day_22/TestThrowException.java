class TestThrowException {
	
	public static void main(String ar[]) {

	
		int age = 13;
		if(age < 18) {
			throw new ArithmeticException("Age is not valid");
		}else {
			System.out.println("You can vote");
		}
		System.out.println("Thanks for votting");
	}
}