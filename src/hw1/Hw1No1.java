package hw1;

//題目1，請設計一隻Java程式,計算12,6這兩個數值的和與積

public class Hw1No1 {
	public static void main(String[] args) {

		int x = 12, y = 6; // 先設定兩個數值分別為x跟y

		int A = x + y; // 做兩數值的和
		int M = x * y; // 做兩數值的積

		System.out.println("12,6的和為：" + A); // 前面先計算好答案再直接帶入此行印出，才不會被系統誤會為字元
		System.out.println("12,6的積為：" + M);

	}

}
