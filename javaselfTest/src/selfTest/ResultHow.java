package selfTest;

import java.util.Scanner;

public class ResultHow {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("姓名: ");
		String name = scanner.nextLine();
		System.out.print("上次考试成绩: ");
		int last = scanner.nextInt();
		System.out.print("这次考试成绩: ");
		int thistime = scanner.nextInt();
		double res = thistime - last;
		/*
		
        ((本次成绩-上次成绩) / 上次成绩) * 100

		 */
		if (res >0){
			System.out.printf(name+"这次考试成绩提高了%.2f%%",100 * res / last);
		}else if (res == 0){
			System.out.print(name+"本次成绩未提高");
		}else{
			System.out.printf(name+"这次考试成绩降低了%.2f%%",100*(-res) / last);
		}
		System.out.println();
	}
}
