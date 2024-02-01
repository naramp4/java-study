package method;

public class MethodMain2 {
	public static void main(String[] args) {
		int sum1 = add(1, 2);
		System.out.println("a와 b의 합은 " + sum1 + "입니다.");

		int sum2 = add(5, 7);
		System.out.println("c와 d의 합은 " + sum2 + "입니다.");
	}

	public static int add(int a, int b){
		int sum = a + b;
		return sum;
	}
}
