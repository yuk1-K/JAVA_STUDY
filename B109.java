package study_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// N H W P Q 予約済 縦幅 横幅 最適座席(y,x) 
// p_1 q_1 予約済みの座標
// p_2 q_2
// ...
// p_N q_N

// ・1 ≦ H, W ≦ 100
// ・1 ≦ N < H × W
// ・0 ≦ P < H
// ・0 ≦ Q < W
// ・0 ≦ p_i < H (1 ≦ i ≦ N)
// ・0 ≦ q_i < W (1 ≦ i ≦ N)
// ・各 i, j (1 ≦ i, j ≦ N) について i ≠ j のとき (p_i, q_i) ≠ (p_j, q_j)

public class B109 {
    public static void main(String[] args) {

        // 入力取得 全て直接intで受け取る
        Scanner sc = new Scanner(System.in);
        final int RESERVED = sc.nextInt();
        final int HEIGHT = sc.nextInt();
        final int WIDTH = sc.nextInt();
        int[] bestSeat = new int[2];
        bestSeat[0] = sc.nextInt();
        bestSeat[1] = sc.nextInt();
        ArrayList<ArrayList<Integer>> reservedSeat = new ArrayList<ArrayList<Integer>>();
        // int[][] reservedSeat = new int[RESERVED][2];
        // temp.add(-1);
        // temp.add(-1);

        for (int i = 0; i < RESERVED; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.add(sc.nextInt());
            temp.add(sc.nextInt());
            reservedSeat.add(temp);
            // System.out.println("reservedSeat:" + reservedSeat);
        }
        // System.out.println("N:" + RESERVED);
        // System.out.println("H:" + HEIGHT);
        // System.out.println("W:" + WIDTH);
        // System.out.println("best:" + Arrays.toString(bestSeat));

        ArrayList<ArrayList<Integer>> isBest = new ArrayList<ArrayList<Integer>>();
        int min = 10000;
        int[][] seatStatus = new int[HEIGHT][WIDTH];
        for (int h = 0; h < HEIGHT; h++) {
            for (int w = 0; w < WIDTH; w++) {
                ArrayList<Integer> temp = new ArrayList<Integer>();
                temp.add(h);
                temp.add(w);
                if (reservedSeat.contains(temp)) {
                    seatStatus[h][w] = -1;
                } else {
                    seatStatus[h][w] = manhattan(bestSeat, h, w);
                    if (seatStatus[h][w] == min) {
                        isBest.add(temp);
                    } else if ((seatStatus[h][w] < min)) {
                        min = manhattan(bestSeat, h, w);
                        isBest.clear();
                        isBest.add(temp);
                    }
                }
            }
        }
        for (ArrayList seat : isBest) {
            System.out.println(seat.get(0) + " " + seat.get(1));
        }
        // System.out.println("best:" + isBest.get(0));

    }

    // マンハッタン距離をとりあえずだす。
    // 計算量が大きくなってランタイムする？
    private static int manhattan(int[] start, int endY, int endX) {
        int d = Math.abs(start[0] - endY) + Math.abs(start[1] - endX);
        return d;
    }

}
