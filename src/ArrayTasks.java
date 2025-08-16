
public class ArrayTasks {
    public static void main(String[] args) {
        // 【課題1-1】10個の整数配列を宣言して表示
        int[] arr1 = {10, 12, 14, 16, 18, 20, 22, 24, 26, 28};
        System.out.println("【課題1-1】10個の整数を表示");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }
        System.out.println();

        // 【課題1-2】11〜15の配列を表示
        int[] arr2 = {11, 12, 13, 14, 15};
        System.out.println("【課題1-2】11〜15の整数を表示");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }
        System.out.println();

        // 【課題1-3】配列の合計を計算して表示（55, 60, 70, 82）
        int[] arr3 = {55, 60, 70, 82};
        int sum3 = 0;
        for (int i = 0; i < arr3.length; i++) {
            sum3 += arr3[i];
        }
        System.out.println("【課題1-3】配列の合計: " + sum3);
        System.out.println();

        // 【課題1-4】偶数・奇数判定（5, 8, -1, 2）
        int[] arr4 = {5, 8, -1, 2};
        System.out.println("【課題1-4】偶数・奇数判定");
        for (int i = 0; i < arr4.length; i++) {
            System.out.print("arr4[" + i + "] = " + arr4[i] + " は ");
            if (arr4[i] % 2 == 0) {
                System.out.println("偶数");
            } else {
                System.out.println("奇数");
            }
        }
        System.out.println();

        // 【課題1-5】合計が閾値100を超えるか判定
        int threshold = 100;
        int sum4 = 0;
        for (int i = 0; i < arr4.length; i++) {
            sum4 += arr4[i];
        }
        System.out.println("【課題1-5】合計: " + sum4);
        if (sum4 > threshold) {
            System.out.println("閾値を超えました");
        } else {
            System.out.println("閾値内です");
        }
        System.out.println();

        // 【課題2】9×9の九九の表を2次元配列に代入して表示
        int[][] multiplicationTable = new int[9][9];
        for (int i = 0; i < 9; i++) {         // 行
            for (int j = 0; j < 9; j++) {     // 列
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }
        System.out.println("【課題2】九九の表");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(multiplicationTable[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

