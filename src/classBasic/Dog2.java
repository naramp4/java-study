package classBasic;

public class Dog2 {
	public static void main(String[] args) {
		String[] dogNameList = {"뽀삐", "또순이", "아지"};
		int[] dogAgeList = {1, 6, 10};

		for (int i = 0; i < dogNameList.length; i++) {
			System.out.println("이름 : " + dogNameList[i] + ", 나이 : " + dogAgeList[i]);
		}
	}
}
