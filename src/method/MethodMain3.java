package method;

public class MethodMain3 {
	int sum3 = 0;
	public static void main(String[] args) {
		add(1, 2);
		add(1, 1, 1);
		add(1.1, 1.1, 1.1);
	}

	public static int add(int a, int b){
		int sum = a + b;
		System.out.println(a + "와 "+ b+"의 합은 " + sum + "입니다.");
		return sum;
	}

	public static int add(double a, double b){
		double sum = a + b;
		System.out.println(a + "와 "+ b+"의 합은 " + sum + "입니다.");
		return (int) sum;
	}

//	public static double add(double a, double b){
//		double sum = a + b;
//		System.out.println(a + "와 "+ b+"의 합은 " + sum + "입니다.");
//		return sum;
//	}

	public static double add(double a, double b, double c){
		double sum = a + b + c;
		System.out.println(a + "와 "+ b+ "와 " + c +"의 합은 " + sum + "입니다.");
		return sum;
	}

	public static int add(int a, int b, int c){
		int sum = a + b + c;
		System.out.println(a + "와 "+ b+ "와 " + c +"의 합은 " + sum + "입니다.");
		return sum;
	}
}
