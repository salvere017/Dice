package Salvere017.Dice;

import java.util.Random;

public class DiceLogic {

	public static int GetRandomNumber(String second, String range) {
		// サイコロロジック追加
		int result = 0;
		Random randomNum = new Random();
		for (int i = 0; i < Integer.parseInt(second); i++) {
			result = result + randomNum.nextInt(Integer.parseInt(range)) + 1;
		}

		return result;
	}
}
