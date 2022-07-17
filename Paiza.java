package study_java;

import java.util.Calendar;
import java.util.Arrays;
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

        // int[] point = { 75, 94, 68 };
        // String[] names = { "鈴木", "本田", "遠藤" };
        // int i = 0;

        // for (String name : names) {
        // // 拡張for文は一つのコレクションに対してのみ使える
        // // String name, int point : names, points
        // // とかは出来ない。
        // System.out.print(name + "さんは");
        // if (point[i] > 90) {
        // System.out.println("判定Aです");
        // } else if (point[i] > 70) {
        // System.out.println("判定Bです");
        // } else {
        // System.out.println("判定Cです");
        // }
        // i += 1;
        // }

        // int num = 2;

        // switch (num) {
        // case 1:
        // case 3:
        // case 5:
        // System.out.println("大当たり");
        // break;
        // case 2:
        // case 4:
        // System.out.println("残念賞");
        // break;
        // default:
        // System.out.println("error");
        // }

        // // 配列とその個数を初期設定で登録
        // int[] result = new int[3];

        // // 各配列に数値を挿入
        // result[0] = 75;
        // result[1] = 88;
        // result[2] = 82;

        // for (int date : result) {
        // System.out.println(date);
        // }

        // int[][] num = new int[2][3];

        // // num[0] = new int[3];
        // // num[1] = new int[3];

        // num[0][0] = 87;
        // num[0][1] = 58;
        // num[0][2] = 72;

        // num[1][0] = 74;
        // num[1][1] = 92;
        // num[1][2] = 81;
        // System.out.println(num[1][2]);
        // Arrays.fill(num[1], 10);
        // Arrays.fill(num, new int[4]);

        // System.out.println(num[1][3]);

        // int[] src = { 12, 24, 18 };
        // int[] dst = Arrays.copyOf(src, 4);

        // for (int d : dst) {
        // System.out.println("dst:" + d);
        // }

        // int[][][] a = new int[2][2][2];
        // int[][][] b = new int[2][2][2];
        // a[0][0][0] = 000;
        // a[0][0][1] = 001;
        // a[0][1][0] = 010;
        // a[0][1][1] = 011;
        // a[1][0][0] = 100;
        // a[1][0][1] = 101;
        // a[1][1][0] = 110;
        // a[1][1][1] = 111;

        // b[0][0][0] = 000;
        // b[0][0][1] = 001;
        // b[0][1][0] = 010;
        // b[0][1][1] = 011;
        // b[1][0][0] = 100;
        // b[1][0][1] = 101;
        // b[1][1][0] = 110;
        // b[1][1][1] = 111;

        // System.out.println(Arrays.deepToString(b));

        // System.out.println(Arrays.deepEquals(a, b));

        // String str = "24";
        // Integer i = Integer.valueOf(str);
        // System.out.print(i * 2);

        // String msg = "ABCDE";
        // System.out.print(msg.charAt(1) - msg.charAt(2));
        // System.out.print('A' - 'C');
        // // charAtはcharを持って来ていて、charは算術演算可能

        // String msg = " ";
        // System.out.println("[" + msg + "]");
        // System.out.println("[" + msg.strip() + "]");

        String[] msgs = { "One", "Two", "Three=" };
        String msg = String.join("-", msgs);
        System.out.println(msg);
        System.out.println(msg.indexOf("e", 3));
        String regex = "-|=";
        System.out.println(msg.replaceAll(regex, ""));

    }
}