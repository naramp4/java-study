package classBasic3;

public class DogMain2 {
    public static void main(String[] args) {
		Dog dog1 = new Dog();
		initDog(dog1, "뽀삐", 1);

		Dog dog2 = new Dog();
		initDog(dog2, "또순이", 6);

		Dog dog3 = new Dog();
		initDog(dog3, "아지", 10);

        // Dog 객체를 저장할 ArrayList 생성
	    Dog[] dogList = {dog1, dog2, dog3};

        // ArrayList를 순회하며 정보 출력
        for (Dog dog : dogList) {
            System.out.println("이름 : " + dog.dogName + ", 나이 : " + dog.dogAge);
        }
    }

	static void initDog(Dog dog, String dogName, int dogAge){
		dog.dogName = dogName;
		dog.dogAge = dogAge;
	}
}
