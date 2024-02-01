package classBasic2;

public class CarMain3 {
    public static void main(String[] args) {

		CarData data = new CarData();

		//차량 시동 켜기
        on(data);

		//스피드 증가
        speedUp(data);

		//스피드 증가
		speedUp(data);

		//스피드 감소
		speedDown(data);

		//차량 상태 확인
	    showStatus(data);

		//차량 시동 끄기
        off(data);

    }

	static void on(CarData data){
		data.isOn = true;
		System.out.println("자동차 시동을 겁니다.");
	}

	static void off(CarData data){
		data.isOn = false;
		System.out.println("자동차 시동을 끕니다.");
	}

	static void speedUp(CarData data){
		data.speed++;
		System.out.println("차량속도:" + data.speed);
	}

	static void speedDown(CarData data){
		data.speed--;
		System.out.println("차량속도:" + data.speed);
	}

	static void showStatus(CarData data){
		System.out.println("차량 시동 상태 확인");
		if (data.isOn) {
			System.out.println("차량 시동 ON, 스피드:" + data.speed);
        } else {
			System.out.println("차동차 시동을 끕니다.");
        }
	}
}
