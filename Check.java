package study_java;

import java.util.*;

public class Check {
    public static void main(String[] args) {
        // 参加人数と試行回数
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        int[] num = new int[2];
        int l = 0;
        for (String word : words) {
            num[l] = Integer.parseInt(word);
            l++;
        }
        int players = num[0];
        int times = num[1];
        // System.out.println("players" + players);
        // System.out.println("times" + times);

        // 配列初期設定及び降順並び替え
        int[][] playersInfo = new int[players][times];
        for (int j = 0; j < players; j++) {
            String[] scores = sc.nextLine().split(" ");
            int k = 0;
            for (String score : scores) {
                playersInfo[j][k] = Integer.parseInt(score);
                k++;
            }
            downSort(playersInfo[j]);
            // System.out.println("player\'" + (j + 1) + "\'s'score:" +
            // Arrays.toString(playersInfo[j]));
        }

        // 各プレイヤーのベストスコア順比較
        int[] index = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // System.out.println("index:" + Arrays.toString(index));
        for (int i = 0; i < times; i++) {

            int[] tempScoreArrays = new int[players];
            for (int j = 0; j < players; j++) {
                if (contains(index, j)) {
                    // System.out.println("i:j=" + i + ":" + j);
                    tempScoreArrays[j] = playersInfo[j][i];
                }
            }
            // System.out.println("Scores:" + Arrays.toString(tempScoreArrays));
            int max = max(tempScoreArrays);
            // System.out.println("max:" + max);

            index = maxIndex(tempScoreArrays, max, players);
            // System.out.println("index:" + Arrays.toString(index));
            if (contains(index, -1)) {
                for (int j : index) {
                    if (j == -1) {
                        break;
                    }
                    // System.out.println("winner:" + (j + 1));
                    System.out.println(j + 1);
                }
                break;
            }

            if (i == times - 1) {
                for (int j = 0; j < players; j++) {
                    // System.out.println("winner:" + (j + 1));
                    System.out.println(j + 1);
                }
            }
        }
    }

    private static void downSort(int[] array) {
        Arrays.sort(array);

        for (int f = 0, l = array.length - 1; f < l; f++, l--) {
            int temp = array[f];
            array[f] = array[l];
            array[l] = temp;
        }
    }

    private static int max(int[] array) {
        int max = 0;
        // 最大値を求める
        for (int data : array) {
            max = Math.max(max, data);
        }
        return max;
    }

    private static int[] maxIndex(int[] array, int max, int dataNum) {
        int[] index = new int[dataNum];
        Arrays.fill(index, -1);
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                index[j] = i;
                j++;
            }
        }
        // System.out.println("index in:" + Arrays.toString(index));
        return index;
    }

    private static boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }
}
