package classBasic2;

public class CarMain4 {
    public static void main(String[] args) {
		Car car = new Car();

		//차량 시동 켜기
        car.on();

		//스피드 증가
        car.speedUp();

		//스피드 증가
		car.speedUp();

		//스피드 감소
		car.speedDown();

		//차량 상태 확인
	    car.showStatus();

		//차량 시동 끄기
        car.off();
    }

}
