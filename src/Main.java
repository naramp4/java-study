import classBasic.Dog;

public class Main {

    public static void main(String args[]) {
		int a = 1;
		int b = a;

	    System.out.println(a);
	    System.out.println(b);

		a = 10;
	    System.out.println(a);
	    System.out.println(b);

		Dog dog1 = new Dog();
	    Dog dog2 = dog1;
	    dog1.dogName = "hi";

	    System.out.println(dog1.dogName);
	    System.out.println(dog2.dogName);

		dog1.dogName = "hi2";

		System.out.println(dog1.dogName);
	    System.out.println(dog2.dogName);


		String str1 = new String("hi");
		String str2 = str1;

	    System.out.println(str1);
	    System.out.println(str2);

		str1 = "hi2";

		System.out.println(str1);
	    System.out.println(str2);

	    System.out.println("------");




    }
}
