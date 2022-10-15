package controller;

import java.util.ArrayList;

import model.Player;
import view.Input;

public class Game {
	static Input input = new Input();

	public void playGame() {
		RandomNum random = new RandomNum();

		oneGame(random);
	}

	static void oneGame(RandomNum random) {
		Player player = new Player();

		if (input.inputNum()) {
			player.setNumber(input.num);
			gameResult(player, random);

			if (player.getStrike() != 3) {
				oneGame(random);
			}
		}
	}

	static void gameResult(Player player, RandomNum random) {
		String[] playerNumArr = player.getNumber().split("");
		ArrayList<String> randomNumArr = random.getRandomNum();

		for (int i = 0; i < 3; i++) {
			setStrikeOrBall(player, i, playerNumArr, randomNumArr);
		}
	}

	static void setStrikeOrBall(Player player, int index, String[] playerNumArr, ArrayList<String> randomNumArr) {
		if (playerNumArr[index].equals(randomNumArr.get(index))) {
			player.setStrike(player.getStrike() + 1);
		} else if (randomNumArr.contains(playerNumArr[index])) {
			player.setBall(player.getBall() + 1);
		}
	}
}
