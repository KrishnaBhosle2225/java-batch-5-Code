import java.util.Scanner;
class ArrayBasics {

	public static void main(String args[]) {
		//int array
		int arr[] = new int[10];

		/*arr[0] = 10;
		arr[1] = 20; 
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;*/	
		//System.out.println(arr[0]);
		//System.out.println(arr[4]);
		//System.out.println(arr[7]);

		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Input done");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}	



}