package hw1;

/*題目6，請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
5 + 5
5 + ‘5’
5 + “5”
*/

public class Hw1No6 {
	public static void main(String[] args) {

		System.out.println(5 + 5); // 正常加法
		System.out.println(5 + '5'); // 此行char為字元，'5'要對應到unicode
		System.out.println(5 + "5"); // 此行為字串相加，因此結果由2個5組合而成
	}

}
