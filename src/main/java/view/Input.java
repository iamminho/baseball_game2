package view;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Input {
	static Scanner sc = new Scanner(System.in);
	public String num;

	public boolean inputNum() {
		String number = inputNumber();

		try {
			checkNumber(number);
			num = number;
			return true;
		} catch (IllegalAccessException e) {
			System.out.println("[Error] 올바르지 않는 형식입니다.");
			System.out.println(e);
			return false;
		}
	}

	public String inputNumber() {
		System.out.print("숫자를 입력해주세요 : ");
		String number = sc.nextLine();

		return number;
	}

	public void checkNumber(String number) throws IllegalAccessException {
		if (!checkLen(number) || !isNumber(number) || !isOverlap(number)) {
			throw new IllegalAccessException();
		}
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

	public boolean isOverlap(String number) {
		Stream<String> stream = Arrays.stream(number.split(""));
		int cnt = (int)stream.distinct().count();

		if (cnt == number.length())
			return true;
		return false;
	}
}


