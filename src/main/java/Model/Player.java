package Model;

public class Player {
	private int number;
	private int strike = 0;
	private int ball = 0;

	public int getNumber() {
		return this.number;
	}

	public int getStrike() {
		return this.strike;
	}

	public int getBall() {
		return this.ball;
	}

	public void setNumber(String input) {
		this.number = Integer.parseInt(input);
	}

	public void setStrike(int strikeNun) {
		this.strike = strikeNun;
	}

	public void setBall(int ballNum) {
		this.ball = ballNum;
	}

}
