package study_java;

import java.util.ArrayList;
import java.util.Scanner;

public class A66 {
    // ・1 ≦ N ≦ 10,000
    // ・1 ≦ A_i ≦ B_i ≦ 100,000 (1 ≦ i ≦ N)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int worksNum = sc.nextInt();
        // ArrayList<ArrayList<Integer>> works = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> attendanceDays = new ArrayList<Integer>();
        int temp = 1;
        int max = 1;

        // 出勤日のリストを作成
        for (int i = 0; i < worksNum; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            for (int j = start; j <= end; j++) {
                if (!attendanceDays.contains(j)) {
                    attendanceDays.add(j);
                }
            }
        }

        // 連続出勤日数計算
        for (int i = 0; i < attendanceDays.size() - 1; i++) {
            if (attendanceDays.get(i + 1) - attendanceDays.get(i) == 1) {
                temp += 1;
            } else {
                if (temp > max) {
                    max = temp;
                    temp = 1;
                }
            }
        }
        if (temp > max) {
            max = temp;
        }
        System.out.println(max);
    }
}
