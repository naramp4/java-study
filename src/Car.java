public class Car {
	String company;

	Car (){

	}
	// company를 입력받는 생성자
	Car(String company) {
		this.company = company;
	}

	public static void main(String[] args) {
		Car car = new Car("현대자동차");  // 새로운 객체 생성시 입력인수 입력하여 객체 생성
		System.out.println(car.company);

		Car car2 = new Car();
  }
}
