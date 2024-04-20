package recursion;

public class TestREcursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(10);

	}
	
	public static void  print(int n) {
		
		if(n==0) {
			System.out.print(n);
			
		}else {
			print(n-1);
			System.out.print(n);
		}
	}

}
