
//学べる事（乱数生成（Randomクラス）
//ユーザー入力（Scannerクラス）
//ループ処理（while文）
//条件分岐（if / else if / else）
//変数の使い方（int型、初期化、更新）
//カウンター処理（attempts++）
//出力（System.out.println）
//クラスとmainメソッドの構造

package game;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
    	// キーボードからの入力を受け取る準備
        Scanner scanner = new Scanner(System.in);
        // 乱数を生成するための準備
        Random random = new Random();
        // 正解の数字をランダムに決定
        int answer = random.nextInt(100) + 1; // 1〜100のランダムな数字
        // ユーザーの予想を入れる変数
        int guess = 0;
        // 試行回数を記録する変数
        int attempts = 0;

        System.out.println("数当てゲームへようこそ！1〜100の数字を当ててください。");
        // 正解するまでループを続ける
        while (guess != answer) {
            System.out.print("あなたの予想: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < answer) {
                System.out.println("もっと大きい数字です！");
            } else if (guess > answer) {
                System.out.println("もっと小さい数字です！");
            } else {
                System.out.println("正解！" + attempts + "回で当てました！");
            }
        }

        scanner.close();
    }
}
