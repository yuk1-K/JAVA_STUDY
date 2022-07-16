package study_java;

import java.util.Calendar;
import java.util.*; //これは上記包括している。　

public class Paiza {
    public static void main(String[] args) {
        /*
         * double rand = Math.random() * 100 + 1;
         * System.out.println(rand);
         * int number = (int) rand;
         * System.out.println(number);
         */

        /*
         * int number = 100 % 30;
         * System.out.println(number);
         */

        /*
         * int apple_price = (int) (Math.random() * 3 + 1) * 100;// 350;
         * int apple_num = (int) (Math.random() * 10 + 1);// 5;
         * System.out.println("リンゴの単価：" + apple_price + "円");
         * System.out.println("リンゴを買う数" + apple_num + "個");
         * 
         * int total = apple_price * apple_num;
         * System.out.println("合計金額：" + total + "円");
         */

        /*
         * // データの種類
         * int number = 100 + 30;
         * String text = "ハロー" + "paiza";
         * System.out.println(number);
         * System.out.println(text);
         * System.out.println(number + 30);
         * System.out.println(number + text);
         */

        // int number = 2;
        // if (number == 1) {
        // System.out.println("スキ！");
        // } else {
        // System.out.println("キライ");
        // }

        // Calendar calendar = Calendar.getInstance();
        // int seireki = calendar.get(Calendar.YEAR);
        // System.out.print(seireki);

        // String text = "123";
        // System.out.println(text);
        // System.out.println(Integer.parseInt(text) * 10);
        // System.out.println(Double.parseDouble(text) * 10);

        // System.out.println(30 / 11);

        // System.out.println("<select name='age'>");
        // for (int i = 1; i <= 10; i++) {
        // System.out.println("<option>" + i + "歳</option>");
        // }
        // System.out.println("</select>");

        // // 標準入力
        // Scanner sc = new Scanner(System.in);
        // // String data = sc.next();
        // int data = sc.nextInt();
        // System.out.println(data * 2);

        // Scanner sc = new Scanner(System.in); //ここで読み込みは発生しない
        // String data = sc.next(); //次の1行読み込む
        // System.out.println("hello" + data);
        // data = sc.next(); //型は再利用なので不要
        // System.out.println("hello" + data);

        // Scanner sc = new Scanner(System.in);
        // int count = sc.nextInt();
        // System.out.println("データ個数 " + count);

        // String data;
        // for (int i = 0; i < count; i++) {
        // data = sc.next();
        // System.out.println(data + "は、スライムを攻撃した");
        // }

        // System.out.println(System.getProperty("file.encoding"));

        // System.out.println('a');
        // System.out.println(0x3042);
        // System.out.println('\u3042');

        // エスケープシーケンス
        // \b バックスペース
        // \t 水平タブ
        // \n 改行
        // \r 復帰
        // \f 改ページ
        // \' シングルクオーテーション
        // \" ダブルクオーテーション
        // \\ \文字
        // \123 8進数の文字コードが表す文字
        // \u1234 16進数の文字コードが表す文字

        // System.out.println(18.225);
        // System.out.println(5.23e3);
        // System.out.println(1.816e10);
        // System.out.println(7.5e-2);
        // System.out.println(2.712e-6);
        // System.out.println(3.52 + 17.4);

        // double pNum = 1.2;
        // double mNum = 4.5;
        // for (int i = 1; i < 10; i++) {
        // pNum *= 10;
        // mNum /= 10;
        // System.out.println(i + "乗:\b" + pNum);
        // System.out.println("-" + i + "乗:\b" + mNum);
        // }

        // int height, width, depth;
        // height = width = depth = 0;
        // System.out.print(height + width + depth);

        // ↓error
        // var date;
        // date = 100;

        // var date = 100;
        // date = "1"; //error
        // System.out.println(date);

        // final int SPECIAL_POINT = 100;
        // // SPECIAL_POINT = 10; //error
        // System.out.println(SPECIAL_POINT);

        // int i = 123456789;
        // System.out.println(i);
        // float d = i;
        // System.out.println(d);//誤差発生

        // int normal = 10;
        // Integer i = Integer.valueOf(10);
        // System.out.println("normal:" + normal);
        // System.out.println("Integer:" + i.intValue());
        // normal *= 2;
        // System.out.println("normal:" + normal);
        // System.out.println("Integer:" + i);

        // int i;
        // i = 85 & 15;
        // System.out.println(i);

        // int i = -92;
        // i = i << 25; //先頭が1から0に切り替わり正負が変わる
        // System.out.println(i);
        // int[] a = { 1, 2, 3 };
        // int[] b = { 1, 2, 3 };
        // System.out.println(a == b);//false

        // 条件演算子
        // 条件文 ? 式1 : 式2
        // int score = 80;
        // String result = score > 70 ? "ok" : "ng";
        // System.out.println(result);

        // 優先順位
        // int a = 12;
        // int b = 34;
        // System.out.println("test" + a + b);//test1234
        // System.out.println(a + b + "test");//46test

        // // 文字結合StringBuilder
        // StringBuilder sb = new StringBuilder();
        // sb.append("XT");
        // sb.append(3140);
        // sb.append(123);

        // System.out.println(sb);

        // int j = 2;

        // for (double i = 0; j > 1; i++) {
        // System.out.println(i);
        // }

        // System.out.println(j);

        // 最低一回実行
        // int num = 1;
        // do {
        // num *= 100;
        // System.out.println(num);
        // ;
        // } while (num < 100);

        // // 要素数実行
        // String names[] = { "Suzuki", "Katou", "Yamada" };
        // for (String name : names) {
        // System.out.println(name);
        // }

        // Outer: for (int i = 1; i < 5; i++) {

        // Inner: for (int j = 1; j < 5; j++) {
        // System.out.println("i * j = " + i * j);

        // if (i * j > 10) {
        // break Outer;// Outer に飛ぶ continue でも同様の事が可能
        // }
        // }

        // System.out.println("Next");
        // }

        // System.out.println("End");

        int[] point = { 75, 94, 68 };
        String[] names = { "鈴木", "本田", "遠藤" };
        int i = 0;

        for (String name : names) {
            System.out.print(name + "さんは");
            if (point[i] > 90) {
                System.out.println("判定Aです");
            } else if (point[i] > 70) {
                System.out.println("判定Bです");
            } else {
                System.out.println("判定Cです");
            }
            i += 1;
        }
    }
}