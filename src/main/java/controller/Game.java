package controller;

import java.util.ArrayList;

import model.Player;
import view.Input;
import view.Output;
import view.ReGame;

public class Game {
	static Input input = new Input();
	static Output output = new Output();
	static ReGame regame = new ReGame();
	static boolean oneGameFlag = true;
	static boolean regameFlag = true;

	public void playGame() {
		while (regameFlag) {
			RandomNum random = new RandomNum();
			printArr(random);

			oneGame(random);
			if (!oneGameFlag) {
				break;
			}

			isRegame(regame);
		}
	}

	public void printArr(RandomNum random) {
		ArrayList<String> a = random.getRandomNum();
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i));
		}
		System.out.println("");
	}

	void oneGame(RandomNum random) {
		Player player = new Player();

		if (!input.inputNum()) {
			oneGameFlag = false;
			return;
		}
		player.setNumber(input.num);
		gameResult(player, random);
		output.printResult(player);

		if (player.getStrike() != 3) {
			oneGame(random);
		}
	}

	void isRegame(ReGame regame) {
		if (!regame.inputNum() || regame.num.equals("2")) {
			regameFlag = false;
		}
	}

	void gameResult(Player player, RandomNum random) {
		String[] playerNumArr = player.getNumber().split("");
		ArrayList<String> randomNumArr = random.getRandomNum();

		for (int i = 0; i < 3; i++) {
			setStrikeOrBall(player, i, playerNumArr, randomNumArr);
		}
	}

	void setStrikeOrBall(Player player, int index, String[] playerNumArr, ArrayList<String> randomNumArr) {
		if (playerNumArr[index].equals(randomNumArr.get(index))) {
			player.setStrike(player.getStrike() + 1);
		} else if (randomNumArr.contains(playerNumArr[index])) {
			player.setBall(player.getBall() + 1);
		}
	}
}
