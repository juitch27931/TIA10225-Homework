package hw1;

//題目5，某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,
//請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)

public class Hw1No5 {
	public static void main(String[] args) {

		double p = 1500000; // 先輸入本金的值
		double r = 0.02; // 先輸入利率的值
		// 公式：本利和=本金*(1+年利率)*年數的次方
		// 現在要先做的事：(1+r)*10次

		double y = 1; // 年數的次方
		for (int i = 1; i < 11; i++) {
			y = (1 + r) * y;
		}

		System.out.println("10年後本金+利息共有" + y * p + "元"); // 補乘上本金後印出
	}

}
