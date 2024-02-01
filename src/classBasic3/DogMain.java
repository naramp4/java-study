package classBasic3;

import java.util.ArrayList;

public class DogMain {
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

        // Dog 객체를 저장할 ArrayList 생성
	    Dog[] dogList = {dog1, dog2, dog3};

        // ArrayList를 순회하며 정보 출력
        for (Dog dog : dogList) {
            System.out.println("이름 : " + dog.dogName + ", 나이 : " + dog.dogAge);
        }
    }

}
