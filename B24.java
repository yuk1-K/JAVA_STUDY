package study_java;

// ・1 ≦ r ≦ 1000
// r は0.00001 刻みで与えられる

// 直線状及び第一象限(境界両含)の条件を満たす格子数を計算？
// 4*(第一象限-直線)

// x正方向の格子点含有数をカウント
// これをyを一つ増加させながら合算
// 4倍して終わり？

import java.util.*;

public class B24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        double r = Double.valueOf(line);

        int count = 0;

        for (int y = 0; y <= r; y++) {
            double x = Math.sqrt(r * r - y * y);
            System.out.println("y=" + y + " の時の x=" + x);
            System.out.println(Math.ceil(x));
            count += Math.ceil(x);
        }
        System.out.println(count * 4);
    }
}
