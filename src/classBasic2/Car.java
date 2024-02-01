package classBasic2;

public class Car {
	int speed = 0;
	boolean isOn = false;

	void on(){
		isOn = true;
		System.out.println("자동차 시동을 겁니다.");
	}

	void off(){
		isOn = false;
		System.out.println("자동차 시동을 끕니다.");
	}

	void speedUp(){
		speed++;
		System.out.println("차량속도:" + speed);
	}

	void speedDown(){
		speed--;
		System.out.println("차량속도:" + speed);
	}

	void showStatus(){
		System.out.println("차량 시동 상태 확인");
		if (isOn) {
			System.out.println("차량 시동 ON, 스피드:" + speed);
        } else {
			System.out.println("차동차 시동을 끕니다.");
        }
	}
}
