public class Main {
	public static void main(String[]args) {
		System.out.println(loneSum(1,2,3));
		System.out.println(loneSum(3,2,3));
		System.out.println(loneSum(3,3,3));
	}
	public static int loneSum(int a, int b, int c) {
		int sum=0;
		if(a==b && b==c && a==c)  {
			sum = 0;
		}
		else if(b==c) {
			sum = a;
		}
		else if(a==c) {
			sum = b;
		}
		else if(a==b) {
			sum = c;
		}
		else {
			sum = a+b+c;
		}
		return sum;
	}
}