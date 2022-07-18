package study_java;

// ボーリングのスコアの出力
// フレーム数aとピンの数bと投げた回数nが変わる
// 1≦a≦100
// 1≦b≦100
// a+1≦n≦2a+1
// 各フレームで倒した数はp_i
// 1≦p_i≦b を満たす整数
// 10 10 18
// 3 4 G 1 8 2 6 2 10 2 7 G 10 10 10 9 1 3
// →145

import java.util.*;

public class A5 {
    public static void main(String[] args) {
        // 情報取得及び初期設定
        Scanner sc = new Scanner(System.in);
        // フレーム数
        int a = sc.nextInt();
        // System.out.println(a);
        // ピンの数
        int b = sc.nextInt();
        // System.out.println(b);
        // 投げた回数
        int n = sc.nextInt();
        // System.out.println(n);
        // スコア
        int score = 0;
        // 各フレームでの倒した数
        int[] flamePoint;

        // 配列p Gが入るので一旦文字列で取得
        int[] p = new int[n];
        String temp;
        for (int i = 0; i < n; i++) {
            temp = sc.next();
            if (temp.equals("G")) {
                temp = "0";
            }
            p[i] = Integer.valueOf(temp);
        }
        // System.out.println("p:" + Arrays.toString(p));

        // ここから計算
        // フレーム内のピンを確認
        // 残り投数が2以上の時はストライクかスペアの可能性があるので、
        // 同一の処理を進める
        for (int i = 0; p.length > 1; i++) {
            flamePoint = Arrays.copyOf(p, 2);
            // System.out.println("flamePoint:" + Arrays.toString(flamePoint));
            String flag = checkClear(flamePoint, b);
            // System.out.println(flag);
            switch (flag) {
                case "strike":
                    // 次とその次の特典が追加されるので、その点数を確認し、
                    // 本フレームのピン数を除いた配列を用意
                    // この時ストライクなので、除くのは1投分

                    // ラストフレーム2投目でのストライクに、次の次は無い
                    // その為3投目の得点のみを足す。
                    // ラストフレーム3投目は本処理が残り2投以上出ないと実行されない
                    // その為、考慮しなくてよい
                    if (p.length == 2) {
                        int strikePoint = p[1];
                        score += flamePoint[0] + strikePoint;
                    } else {
                        int strikePoint = p[1] + p[2];
                        score += flamePoint[0] + strikePoint;
                    }
                    // System.out.println("score:" + score);
                    p = Arrays.copyOfRange(p, 1, p.length);
                    // System.out.println("lest p:" + Arrays.toString(p));
                    break;
                case "spare":
                    // 次の得点が追加されるので、次の点数を確認し、
                    // 本フレームのピン数を除いた配列を用意

                    // ラストフレーム3投目でのスペアに、次は無い
                    // その為追加得点処理をしない処理を分岐させる。
                    if (p.length == 2) {
                        int sparePoint = 0;
                        score += flamePoint[0] + flamePoint[1] + sparePoint;
                    } else {
                        int sparePoint = p[2];
                        score += flamePoint[0] + flamePoint[1] + sparePoint;
                    }

                    // System.out.println("score:" + score);
                    p = Arrays.copyOfRange(p, 2, p.length);
                    // System.out.println("lest p:" + Arrays.toString(p));
                    break;
                case "normal":
                    // ここは純粋に足して、本フレームのピン数を除いた配列を用意
                    score += flamePoint[0] + flamePoint[1];
                    // System.out.println("score:" + score);
                    p = Arrays.copyOfRange(p, 2, p.length);
                    // System.out.println("lest p:" + Arrays.toString(p));
                    break;
            }
        }
        if (p.length != 0) {
            score += p[0];
            // System.out.println("score:" + score);
            p = Arrays.copyOfRange(p, 1, p.length);
            // System.out.println("lest p:" + Arrays.toString(p));
        }

        System.out.println(score);

    }

    private static String checkClear(int[] arr, int pin) {
        int first = Integer.valueOf(arr[0]);
        // spare strike = 10じゃない事に注意
        if (first == pin) {
            return "strike";
        }

        int second = Integer.valueOf(arr[1]);
        int sum = first + second;
        if (sum == pin) {
            return "spare";
        }
        return "normal";
    }
}
