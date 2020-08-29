package problem_c;

public class Factorial {

	public static void main(String[] args) {
		
		String x = f(5);
		System.out.println("Resultado: " + x);

	}
	
	public static String f(int a) {
		String fact = null;
		
		int account = a;
		for(int i=0; i<account; i++) {
			if(i == 0) {
			fact = String.valueOf(a);
			}
			else if((i != 0)&&(i<(account-1))) {
			a--;	
			fact = fact + " * " + String.valueOf(a);
			}
			else if(i==(account-1)){
			a--;
			fact = fact + " * " + String.valueOf(a) + " = " + String.valueOf(5*4*3*2*1);
			}
		}
		return fact;
	}

}
