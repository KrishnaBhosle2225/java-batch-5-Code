class ExceptionDemo {

	public static void main(String args[]) {
/*
		//syntax of try catch
		try{
			//code which may raise errors
		}catch() {
			//handling the exception
		}finally {

		}	
*/

		try{
			//int a = 100;
			//int b = 0;
			//int c = a/b;
			//System.out.println("Dividion is : "+ c);

			String name= null;
			int len = name.length();
			System.out.println(len);
		}catch(Exception e) {
			//System.out.println(e.toString() + " Ohh my god this is exception");
			System.out.println("Name is empty");

		}

		System.out.println("Value of a is ");


	}

}