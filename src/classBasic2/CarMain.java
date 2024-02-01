package classBasic2;

public class CarMain {
    public static void main(String[] args) {
		int speed = 0;
		boolean isOn = false;

		//차량 시동 켜기
        isOn = true;
		System.out.println("차동차 시동을 겁니다.");

		//스피드 증가
        speed++;
		System.out.println("차량속도:" + speed);

		//스피드 증가
	    speed++;
		System.out.println("차량속도:" + speed);

		//스피드 감소
        speed--;
		System.out.println("차량속도:" + speed);

		//차량상태 확인
		System.out.println("차량 시동 상태 확인");
		if (isOn) {
			System.out.println("차량 시동 ON, 스피드:" + speed);
        } else {
			System.out.println("차량 시동 OFF");
        }

		//음악 플레이어 끄기
        isOn = false;
		System.out.println("차동차 시동을 끕니다.");
    }

}
