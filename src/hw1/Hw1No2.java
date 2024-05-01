package hw1;

//題目2，請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)

public class Hw1No2 {
	public static void main(String[] args) {

		int eggs = 200; // 不確定要用long還是int(考慮不能整除的餘數長度)

		int count1 = eggs / 12; // 使用除法計算200顆蛋有幾打
		int count2 = eggs % 12; // 使用餘數計算200顆蛋剩下幾顆無法湊成1打

		System.out.println("200顆蛋共是" + count1 + "打" + count2 + "顆"); // 印出
	}

}
