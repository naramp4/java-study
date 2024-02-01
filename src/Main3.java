import classBasic.Dog;

public class Main3 {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		Dog dog2 = dog1;
		dog1.dogName = "hi";
		System.out.println("dog1name = " + dog1.dogName);
		System.out.println("dog2name = " + dog2.dogName);
		System.out.println("-------");
		dog1.dogName = "hi2";
		System.out.println("dog1name = " + dog1.dogName);
		System.out.println("dog2name = " + dog2.dogName);
	}
}
