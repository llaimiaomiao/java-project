
public class Age {
	public static void main(String[] args) {
		System.out.println(fun(5));
	}
	public static int fun(int n) {
		if(n==1) { 
			return 10;
		}else {
			return 2 + fun(n-1);
		}
	}
}
	

	


