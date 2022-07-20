package study_java;

import java.util.*;

import javax.swing.text.Position;

// 縦：H
// 横：W
// S：スタート地点
// #：柱
// .：空間

// 脱出可能かどうかのみの出力

/*
7 6
######
#....#
#.#..#
#.#S.#
#.####
#.....
######

7 6
......
......
.####.
#..S.#
#....#
.####.
......

7 6
######
.....#
####.#
#.S#.#
#.##.#
#....#
######
*/
public class A55 {
    public static void main(String[] args) {

        // 入力受付
        Scanner sc = new Scanner(System.in);
        final int HEIGHT = sc.nextInt();
        final int WIDTH = sc.nextInt();

        // マップの初期設定及び初期位置の検索キー作成
        String[][] maps = new String[HEIGHT][WIDTH];
        boolean flag = true;
        String start = "S";
        ArrayList<ArrayList<Integer>> positions = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> position = new ArrayList<Integer>();

        // マップ及び開始位置の取得
        for (int h = 0; h < HEIGHT; h++) {
            maps[h] = sc.next().split("");
            if (flag) {
                for (int w = 0; w < WIDTH; w++) {
                    // // System.out.print("check");
                    if (flag && start.equals(maps[h][w])) {
                        position.add(h);
                        position.add(w);
                        positions.add(position);
                        flag = false; // もう入らない様にする
                        maps[h][w] = "#";
                        // System.out.println(positions);
                        break;
                    }
                }
            }
            // System.out.println("maps[" + h + "]:" + Arrays.toString(maps[h]));
        }

        // 移動処理
        while (true) {
            if (isMovable("U", position, maps)) {
                positions.add(0, position);
                // System.out.println("U in");
                if (isClear(HEIGHT, WIDTH, position)) {
                    System.out.println("YES");
                    break;
                }
                continue;
            }
            if (isMovable("R", position, maps)) {
                positions.add(0, position);
                // System.out.println("U in");
                if (isClear(HEIGHT, WIDTH, position)) {
                    System.out.println("YES");
                    break;
                }
                continue;
            }
            if (isMovable("D", position, maps)) {
                positions.add(0, position);
                // System.out.println("U in");
                if (isClear(HEIGHT, WIDTH, position)) {
                    System.out.println("YES");
                    break;
                }
                continue;
            }
            if (isMovable("L", position, maps)) {
                positions.add(0, position);
                // System.out.println("U in");
                if (isClear(HEIGHT, WIDTH, position)) {
                    System.out.println("YES");
                    break;
                }
                continue;
            }
            System.out.println("NO");
            break;
        }

    }

    // 現在地 position[]={h,w}
    // 現在地から全方向に対する移動先の検証
    // 全方向検索しソートをかけていく
    // 移動方向と現在地及びマップ情報から、
    // 指定した移動方向への移動可否を判定
    // 引数に配列として渡すことで、Bool型を戻り値としつつ
    // 位置情報の更新を同時にする
    // 元の位置に戻ると無限検索になる為、移動した地点は#とし
    // 分岐検索をかける

    // 移動した結果外に出れたのかどうかも判定する必要がある。
    // 下記地点に現在地が移れば完了
    // maps[0][all]
    // maps[all][0]
    // maps[HEIGHT][all]
    // maps[all][WIDTH]

    // 単一移動判定
    private static boolean isMovable(String direction, ArrayList<Integer> position, String[][] maps) {
        String next;
        int temp;
        switch (direction) {

            // 上方向
            case "U":
                next = maps[position.get(0) - 1][position.get(1)];
                if (next.equals("#")) {
                    return false;
                } else {
                    // System.out.print(position + "から");
                    maps[position.get(0)][position.get(1)] = "#";
                    temp = position.get(0) - 1;
                    position.set(0, temp);
                    // System.out.println("上方向に移動しました" + position);
                    return true;
                }

                // 右方向
            case "R":
                next = maps[position.get(0)][position.get(1) + 1];
                if (next.equals("#")) {
                    return false;
                } else {
                    // System.out.print(position + "から");
                    maps[position.get(0)][position.get(1)] = "#";
                    temp = position.get(1) + 1;
                    position.set(1, temp);
                    // System.out.println("右方向に移動しました" + position);
                    return true;
                }

                // 下方向
            case "D":
                next = maps[position.get(0) + 1][position.get(1)];
                if (next.equals("#")) {
                    return false;
                } else {
                    // System.out.print(position + "から");
                    maps[position.get(0)][position.get(1)] = "#";
                    temp = position.get(0) + 1;
                    position.set(0, temp);
                    // System.out.println("下方向に移動しました" + position);
                    return true;
                }

                // 左方向
            case "L":
                next = maps[position.get(0)][position.get(1) - 1];
                if (next.equals("#")) {
                    return false;
                } else {
                    // System.out.print(position + "から");
                    maps[position.get(0)][position.get(1)] = "#";
                    temp = position.get(1) - 1;
                    position.set(1, temp);
                    // System.out.println("左方向に移動しました" + position);
                    return true;
                }

            default:
                return false;
        }
    }

    // 脱出判定
    private static boolean isClear(int HEIGHT, int WIDTH, ArrayList<Integer> position) {
        if (position.get(0) == 0 || position.get(0) == HEIGHT - 1 || position.get(1) == 0
                || position.get(1) == WIDTH - 1) {
            return true;
        }
        return false;
    }

}