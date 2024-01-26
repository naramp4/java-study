package classBasic;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dog3 {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.dogName = "뽀삐";
		dog1.dogAge = 1;

		Dog dog2 = new Dog();
		dog2.dogName = "또순이";
		dog2.dogAge = 6;

		Dog dog3 = new Dog();
		dog3.dogName = "아지";
		dog3.dogAge = 10;

		System.out.println("이름 : " + dog1.dogName + ", 나이 : " + dog1.dogAge);
		System.out.println("이름 : " + dog2.dogName + ", 나이 : " + dog2.dogAge);
		System.out.println("이름 : " + dog3.dogName + ", 나이 : " + dog3.dogAge);
	}
}
