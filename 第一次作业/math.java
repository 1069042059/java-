package 第一次作业;
import java.util.Scanner;
import java.util.*;

public class math {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while(true){
			init();
		}
	}
	private static void init() {
		System.out.println("请输入算数表达式如:1+1回车即可:");
		String str = sc.nextLine();
		if (!str.matches("[^a-zA-Z()&^#$@!~]+")) {
			System.out.println("输入错误重输:请输入算数表达式如:1+1回车即可:\n");
			str = sc.nextLine();
		}
		double q = 0, h = 0, sum = 0;
		char chs = ' ';
		for (int i = 0; i < str.length(); i++) {
			chs = str.charAt(i);
			if (chs == '+' || chs == '-' || chs == '*' || chs == '/') {
				q = Integer.valueOf(str.substring(0, i));
				h = Integer.valueOf(str.substring(i + 1, str.length()));
				switch (chs) {
				case '+':
					sum = q + h;
					break;
				case '-':
					sum = q - h;
					break;
				case '*':
					sum = q * h;
					break;
				default:
					sum = q / h;
					break;
				}
				break;
			}
		}
		System.out.println("结果="+sum+"\n继续下一轮:");
	}
}
