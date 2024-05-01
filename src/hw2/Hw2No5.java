package hw2;

//阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。
//請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?

public class Hw2No5 {
	public static void main(String[] args) {

		// 阿文可以選擇的數字有哪些
		// 數量有幾個

		int count = 0;
		
		System.out.print("阿文可以選擇的數字有：");

		for (int i = 1; i < 40; i++) {
			if (i % 10 != 4) {
				System.out.print(i + " "); // 依序印出符合條件的數字
				count++;
			}
		}
		System.out.println("\n" + "總共有" + count + "個");
	}

}
