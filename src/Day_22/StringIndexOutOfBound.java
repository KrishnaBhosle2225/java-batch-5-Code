class StringIndexOutOfBound {

	public static void main(String args[]) {
		
		try{
			String str = "Hello Ascii education";
			char ch = str.charAt(18);
			System.out.println(ch);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound");
			e.printStackTrace();
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("String index out of bound");
			e.printStackTrace();

		}catch(ArithmeticException e) {
			System.out.println("Arithmetic exception");
			e.printStackTrace();

		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("I am in Finally block");
		}
	}

}