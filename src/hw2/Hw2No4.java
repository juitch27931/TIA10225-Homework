package hw2; 

//請設計一隻Java程式,輸出結果為以下:1 4 9 16 25 36 49 64 81 100

public class Hw2No4 {
	public static void main(String[] args) {
		
		int i = 1;
		
		for(int j = 1; j <= 10 ; j++) {
			i = j * j;
			System.out.print(i + " ");
		}
	}

}
