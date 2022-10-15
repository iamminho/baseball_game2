package view;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Input {
	static Scanner sc = new Scanner(System.in);

	public static void inputNum() {
		String number = inputNumber();
		String[] numArr = number.split("");

		try {
			checkNumber(number);
		} catch (IllegalAccessException e) {
			System.out.println("[Error] 올바르지 않는 형식입니다.");
			System.out.println(e);
		}
	}

	public static void checkNumber(String number) throws IllegalAccessException {
		if (!checkLen(number) || !isNumber(number)) {
			throw new IllegalAccessException();
		}
	}

	public static String inputNumber() {
		System.out.print("숫자를 입력해주세요 : ");
		String number = sc.nextLine();
		System.out.println("");

		return number;
	}

	public static boolean checkLen(String number) {
		if (number.length() == 3) {
			return true;
		}
		return false;
	}

	public static boolean isNumber(String number) {
		String regex = "^[1-9]*$";
		boolean result = Pattern.matches(regex, number);

		return result;
	}
}
