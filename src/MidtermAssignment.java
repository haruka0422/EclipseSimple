
import java.util.Scanner;

public class MidtermAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // -------------------
        // 【問1】FizzBuzz
        // -------------------
        System.out.println("【問1】FizzBuzzプログラム");
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        // -------------------
        // 【問2】電卓
        // -------------------
        System.out.println("\n【問2】電卓プログラム");
        String cont;
        do {
            System.out.print("1つ目の数字を入力: ");
            double num1 = sc.nextDouble();

            System.out.print("演算子を入力 (+, -, *, /): ");
            String op = sc.next();

            System.out.print("2つ目の数字を入力: ");
            double num2 = sc.nextDouble();

            double result = 0;
            boolean valid = true;

            switch (op) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("エラー: 0で割ることはできません。");
                        valid = false;
                    }
                    break;
                default:
                    System.out.println("不正な演算子です。");
                    valid = false;
            }

            if (valid) {
                System.out.println("計算結果: " + result);
            }

            System.out.print("続行しますか？ (yes/no): ");
            cont = sc.next();
        } while (cont.equalsIgnoreCase("yes"));

        // -------------------
        // 【問3】ソートプログラム
        // -------------------
        System.out.println("\n【問3】ソートプログラム");

        System.out.print("配列のサイズを入力: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + "つ目の数字を入力: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("昇順（asc）または降順（desc）を入力: ");
        String order = sc.next();

        int[] sorted;
        if (order.equalsIgnoreCase("asc")) {
            sorted = sortAscending(arr);
        } else if (order.equalsIgnoreCase("desc")) {
            sorted = sortDescending(arr);
        } else {
            System.out.println("不正な入力です。昇順でソートします。");
            sorted = sortAscending(arr);
        }

        System.out.println("ソート結果:");
        for (int n : sorted) {
            System.out.print(n + " ");
        }
        System.out.println();

        sc.close();
    }

    // 昇順ソート（バブルソート）
    static int[] sortAscending(int[] array) {
        int[] arr = array.clone();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // 降順ソート（バブルソート）
    static int[] sortDescending(int[] array) {
        int[] arr = array.clone();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
