package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String[] itemNames = new String[5];
		for (int i = 0; i < itemNames.length; i++) {
			System.out.println("商品" + (i + 1) + "入力してくいださい。");
			itemNames[i] = reader.readLine();
		}

		int[] itemPrice = new int[5];
		for (int i = 0; i < itemPrice.length; i++) {
			System.out.println(itemNames[i] + "の単価を入力してください。");
			String strPrice = reader.readLine();
			itemPrice[i] = Integer.parseInt(strPrice);
		}

		System.out.println("\n登録商品一覧");
		for (int i = 0; i < itemNames.length; i++) {
			System.out.println(itemNames[i] + ":" + itemPrice[i]);
		}
	}

}
