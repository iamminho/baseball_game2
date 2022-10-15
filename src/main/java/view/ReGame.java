package view;

public class ReGame extends Input {

	@Override
	public String inputNumber() {
		System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
		String number = sc.nextLine();

		return number;
	}

	@Override
	public void checkNumber(String number) throws IllegalAccessException {
		if (!isOneOrTwo(number)) {
			throw new IllegalAccessException();
		}
	}

	public boolean isOneOrTwo(String number) {
		if (number.equals("1") || number.equals("2")) {
			return true;
		}
		return false;
	}
}
