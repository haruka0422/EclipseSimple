package EclipseSimple;


public class basic_concepts {
    public static void main(String[] args) {

        // ===== 問題1 =====
        System.out.println("【問題1】変数について");
        System.out.println("int型の変数 num を宣言して、好きな数字を代入してください。");
        System.out.println("String型の変数 name を宣言し、自分の名前を代入してください。");
        System.out.println("double型の定数 PI を宣言し、3.14を代入してください。");
        System.out.println("上記を System.out.println() を使用して出力してください。\n");

        int num = 42;
        String name = "はゆと";
        final double PI = 3.14;

        System.out.println("num: " + num);
        System.out.println("name: " + name);
        System.out.println("PI: " + PI);
        System.out.println();

        // ===== 問題2 =====
        System.out.println("【問題2】型について");
        System.out.println("整数型の変数 myInt を宣言し、任意の整数で初期化してください。");
        System.out.println("浮動小数点型の変数 myDouble を宣言し、myInt の値を利用して初期化してください。");
        System.out.println("文字型の変数 myChar を宣言し、好きなアルファベット1文字で初期化してください。");
        System.out.println("真偽型の変数 myBoolean を宣言し、条件式を用いて初期化してください。");
        System.out.println("文字列型の変数 myString を宣言し、自分の名前で初期化してください。\n");

        int myInt = 10;
        double myDouble = myInt + 0.5;
        char myChar = 'A';
        boolean myBoolean = myInt > 5;
        String myString = "はゆと";

        System.out.println("myInt: " + myInt);
        System.out.println("myDouble: " + myDouble);
        System.out.println("myChar: " + myChar);
        System.out.println("myBoolean: " + myBoolean);
        System.out.println("myString: " + myString);
        System.out.println();

        // ===== 問題3 =====
        System.out.println("【問題3】演算子について");
        System.out.println("任意の整数型の変数 a と b を宣言し、それぞれの値を代入、出力してください。");
        System.out.println("a と b の和を表す変数 sumResult を宣言し、和を計算して出力してください。");
        System.out.println("a と b の差を表す変数 differenceResult を宣言し、差を計算して出力してください。");
        System.out.println("a と b の積を表す変数 productResult を宣言し、積を計算して出力してください。");
        System.out.println("a と b の商を表す変数 quotientResult を宣言し、商を計算して出力してください。");
        System.out.println("a と b の剰余を表す変数 remainderResult を宣言し、剰余を計算して出力してください。");
        System.out.println("a が b と等しいかどうかを表す変数 isEqual を宣言し、結果を出力してください。");
        System.out.println("a が b より大きいかどうかを表す変数 isGreater を宣言し、結果を出力してください。");
        System.out.println("a が b より小さいかどうかを表す変数 isLess を宣言し、結果を出力してください。\n");

        int a = 15;
        int b = 4;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        int sumResult = a + b;
        int differenceResult = a - b;
        int productResult = a * b;
        int quotientResult = a / b;
        int remainderResult = a % b;

        boolean isEqual = a == b;
        boolean isGreater = a > b;
        boolean isLess = a < b;

        System.out.println("sumResult: " + sumResult);
        System.out.println("differenceResult: " + differenceResult);
        System.out.println("productResult: " + productResult);
        System.out.println("quotientResult: " + quotientResult);
        System.out.println("remainderResult: " + remainderResult);
        System.out.println("isEqual: " + isEqual);
        System.out.println("isGreater: " + isGreater);
        System.out.println("isLess: " + isLess);
        System.out.println();

        // ===== 問題4 =====
        System.out.println("【問題4】");
        System.out.println("三角形の面積を求められるプログラム（小数以下は必要ありません）");
        System.out.println("円の面積を求められるプログラム（円周率は3.14でお願いします）\n");

        int base = 10;
        int height = 6;
        int triangleArea = (base * height) / 2;
        System.out.println("底辺 " + base + "、高さ " + height + " の三角形の面積: " + triangleArea);

        int radius = 5;
        int circleArea = (int)(PI * radius * radius);
        System.out.println("半径 " + radius + " の円の面積: " + circleArea);
    }
}
