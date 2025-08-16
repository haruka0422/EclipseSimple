package EclipseSimple;

public class loop {
    public static void main(String[] args) {
        // 【問1】基本問題: 1から10までの合計を計算して表示（forループ使用）
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("【問1】1から10までの合計: " + sum);

        // 【問2】九九を表示
        System.out.println("【問2】九九の表");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + "×" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }

        // 【問3】階段を出力
        System.out.println("【問3】階段");
        int steps = 5;  // 階段の段数（例として5段）
        for (int i = 1; i <= steps; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 【問4】ピラミッドを出力
        System.out.println("【問4】ピラミッド");
        int height = 5;  // ピラミッドの高さ（段数）
        for (int i = 1; i <= height; i++) {
            // 空白を出力
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }
            // 星を出力
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

