package problem_a;

public class Division {

	public static void main(String[] args) {
		
		float x = d(60,15);
		System.out.println("Resultado: " + x);
			
	}
	
	public static float d(int a, int b) {
		if(b > a) {
			return 0;
		}
		else {
			return 1 + d(a-b, b);
		}
	}
	
}
