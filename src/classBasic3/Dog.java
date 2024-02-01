package classBasic3;

public class Dog {
	public String dogName;
	public int dogAge;

	public Dog() {
	}

	//추가
	Dog(String dogName, int dogAge){
		this.dogName = dogName;
		this.dogAge = dogAge;
	}

	Dog(int dogAge){
		this.dogName = "댕댕이";
		this.dogAge = dogAge;
	}
	//추가
	void initDog(String dogName, int dogAge){
		this.dogName = dogName;
		this.dogAge = dogAge;
	}
}
