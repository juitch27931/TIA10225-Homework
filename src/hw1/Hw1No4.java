package hw1;

//題目4，請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長

public class Hw1No4 {
	public static void main(String[] args) {

		final double curcle = 3.1415; // 先設定圓周率為3.1415
		int half = 5; // 先設定半徑為5

		double area = half * half * curcle; // 圓面積=半徑x半徑x圓周率
		double perimeter = (half * 2) * curcle; // 直徑乘以圓周率

		System.out.println("若半徑為5，圓面積為：" + area);
		System.out.println("若半徑為5，圓周長為：" + perimeter);

	}

}
