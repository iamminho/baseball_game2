package view;

import model.Player;

public class Output {
	public void printResult(Player player) {
		int strike = player.getStrike();
		int ball = player.getBall();

		isAnswer(strike, ball);
		isNothing(strike, ball);
		isBall(strike, ball);
		isStrike(strike, ball);
		isStrikeBall(strike, ball);
	}

	public void isAnswer(int strike, int ball) {
		if (strike == 3 && ball == 0) {
			System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
		}
	}

	public void isNothing(int strike, int ball) {
		if (strike == 0 && ball == 0) {
			System.out.println("낫싱");
		}
	}

	public void isBall(int strike, int ball) {
		if (strike == 0 && ball > 0) {
			System.out.println(ball + "볼");
		}
	}

	public void isStrike(int strike, int ball) {
		if (strike > 0 && ball == 0 && strike != 3) {
			System.out.println(strike + "스트라이크");
		}
	}

	public void isStrikeBall(int strike, int ball) {
		if (strike > 0 && ball > 0) {
			System.out.println(ball + "볼" + " " + strike + "스트라이크");
		}
	}

}


