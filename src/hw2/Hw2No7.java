package hw2;

//請設計一隻Java程式,輸出結果為以下:
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF

public class Hw2No7 {
	public static void main(String[] args) {

// A在Unicode的編號是：\u0040

		for (char i = 65; i <= 70; i++) {
			for (int j = 65; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
