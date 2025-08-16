
import java.util.Random;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // -------------------
        // 【課題1】Scannerクラス
        // -------------------

        // ① 2つの整数の和
        System.out.println("【課題1-1】2つの整数の和を計算");
        System.out.print("1つ目の整数を入力: ");
        int num1 = sc.nextInt();
        System.out.print("2つ目の整数を入力: ");
        int num2 = sc.nextInt();
        System.out.println("合計: " + (num1 + num2));

        // ② 円の半径から面積を計算
        System.out.println("\n【課題1-2】円の面積を計算");
        System.out.print("半径を入力: ");
        double radius = sc.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("円の面積: " + area);

        // -------------------
        // 【課題2】Mathクラス
        // -------------------

        // ① 最大公約数（GCD）
        System.out.println("\n【課題2-1】最大公約数（GCD）を計算");
        System.out.print("1つ目の整数を入力: ");
        int a = sc.nextInt();
        System.out.print("2つ目の整数を入力: ");
        int b = sc.nextInt();
        int gcd = gcd(a, b);
        System.out.println("最大公約数: " + gcd);

        // ② 浮動小数点数の平方根
        System.out.println("\n【課題2-2】平方根を計算");
        System.out.print("数値を入力: ");
        double val = sc.nextDouble();
        System.out.println("平方根: " + Math.sqrt(val));

        // -------------------
        // 【課題3】Randomクラス
        // -------------------
        System.out.println("\n【課題3】サイコロ予想ゲーム");
        Random rand = new Random();
        int dice = rand.nextInt(6) + 1; // 1～6
        System.out.print("サイコロの目を予想してください（1～6）: ");
        int guess = sc.nextInt();
        System.out.println("出た目: " + dice);
        if (guess == dice) {
            System.out.println("正解！");
        } else {
            System.out.println("残念！");
        }

        // -------------------
        // 【課題4】メソッド作成
        // -------------------

        // ① 文字列を逆順に表示
        System.out.println("\n【課題4-1】文字列の逆順");
        reverseString("ABCDEFG");

        // ② 3つの整数の平均
        System.out.println("\n【課題4-2】3つの整数の平均");
        double avg = averageOfThree(2, 7, 1);
        System.out.println("平均値: " + avg);

        sc.close();
    }

    // 最大公約数（ユークリッドの互除法）
    static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    // 文字列を逆順にして表示するメソッド
    static void reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("逆順: " + reversed);
    }

    // 3つの整数の平均を返すメソッド
    static double averageOfThree(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
}

