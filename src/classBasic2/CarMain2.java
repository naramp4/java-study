package classBasic2;

public class CarMain2 {

    public static void main(String[] args) {
		CarData data = new CarData();

		//차량 시동 켜기
        data.isOn = true;
		System.out.println("차동차에 시동을 겁니다.");

		//스피드 증가
        data.speed++;
		System.out.println("차량속도:" + data.speed);

		//스피드 증가
	    data.speed++;
		System.out.println("차량속도:" + data.speed);

		//스피드 감소
        data.speed--;
		System.out.println("차량속도:" + data.speed);

		//차량상태 확인
		System.out.println("차량 시동 상태 확인");
		if (data.isOn) {
			System.out.println("차량 시동 ON, 스피드:" + data.speed);
        } else {
			System.out.println("차량 시동 OFF");
        }

		//차량 시동 끄기
        data.isOn = false;
		System.out.println("차동차 시동을 끕니다.");
    }

}
