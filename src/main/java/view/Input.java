package view;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Input {
	public static boolean inputNum() {
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		String[] numArr = number.split("");

		if (checkLen(number) && isNumber(number)) {
			return true;
		}

		return false;
	}

	static boolean checkLen(String number) {
		if (number.length() == 3) {
			return true;
		}
		return false;
	}

	static boolean isNumber(String number) {
		String regex = "^[1-9]*$";
		boolean result = Pattern.matches(regex, number);

		return result;
	}
}
