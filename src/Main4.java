import classBasic.Dog;

public class Main4 {
	public static void main(String[] args) {
		String str1 = new String("hi");
		String str2 = str1;

		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("-----");

		str1 = "hi2";

		System.out.println(str1);
		System.out.println(str2);
	}
}
