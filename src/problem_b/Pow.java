package problem_b;

public class Pow {

	public static void main(String[] args) {
		
		String x = p(2,3);
		System.out.println("Resultado: " + x);
			
	}
	
	public static String p(int a, int b) {
		String pow = null;
		int account = b;
		for(int i=0; i<account; i++) {
			if(i == 0) {
			pow = String.valueOf(a);
			}
			else if((i != 0)&&(i<(account-1))) {
			pow = pow + " * " + String.valueOf(a);
			}
			else if(i==(account-1)){
			pow = pow + " * " + String.valueOf(a) + " = " + String.valueOf(Math.pow(a, b));
			}
		}
		return pow;
	}

}
