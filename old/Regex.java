package study_java.old;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    /*
     * ・最長一致数量子
?       1または0回
*       0回以上
+       1回以上
{n}     n回
{n,}    n回以上
{n,m}   n回以上、m回以下

・最短一致数量子
??      1または0回
*?      0回以上
+?      1回以上
{n}?    n回
{n,}?   n回以上
{n,m}?  n回以上、m回以下

・強欲な数量子(絶対最大指定子)
?+      1または0回
*+      0回以上
++      1回以上
{n}+    n回
{n,}+   n回以上
{n,m}+  n回以上、m回以下
     * 任意1文字：.
     * エスケープ：\\
     * 一桁数字：\d
     * 数字以外：\D
     * 空白文字：\s
     * 非空白文字：\S
     * 水平方向空白文字：\h
     * 水平方向以外の空白文字：\H
     * 垂直方向空白文字：\v
     * 垂直方向以外の空白文字：\V
     * 単語文字：\w
     * 非単語文字：\W
     * 指定1文字：[ABC] ※この場合はABCの内1文字
     * 指定1文字以外：[^ABC]
     * 0-9のいずれか1文字：[0-9]
     * a-zのいずれか1文字：[a-z]
     * A-Zのいずれか1文字：[A-Z]
     * ※b-f及びhのいずれか1文字も可能：[b-fh]
     * ※英数字全てのいずれか1文字：[0-9a-zA-Z]
     * 
     * 先頭：^, 文字列先頭：\A
     * 末尾：$, 文字列末尾：\z,\Z(行末文字(\nなど)は無視してくれる)
     * Matcher：useAnchoringBounds(false)を
     * Matcherインスタンスに使うと
     * 検索範囲制限によって生じる先頭や末尾を
     * 無視して本来の文字列における先頭,末尾にて
     * パターン検索をしてくれる。
     * Pattern：pattern.compile(正規表現,Pattern.MULTILINE)
     * とすると各行での先頭,末尾でマッチする
     * 
     * 単語先頭及び末尾：\b \bab\b -> ab
     * 単語先頭及び末尾以外：\B \Bbc\B -> abcd
     * Matcher：useTransparentBounds(false)を
     * Matcherインスタンスに使うと
     * 検索範囲制限によって生じる先頭や末尾を
     * 無視して本来の文字列における先頭,末尾にて
     * パターン検索をしてくれる。
     * 
     * \t  タブ文字(「\u0009」)
     * \n  改行文字(「\u000A」)
     * \r  キャリッジ・リターン文字(「\u000D」)
     * \u0085  次行文字
     * \u2028  行区切り文字
     * \u2029  段落区切り文字
     * \f  用紙送り文字(「\u000C」)
     * \a  警告(ベル)文字(「\u0007」)
     * \e  エスケープ文字(「\u001B」)
     * \cx     xに対応する制御文字
     * \0n     8進値0nを持つ文字(0 <= n <= 7)
     * \0nn    8進値0nnを持つ文字(0 <= n <= 7)
     * \0mnn   8進値0mnnを持つ文字(0 <= m <= 3, 0 <= n <= 7)
     * \xhh    16進値 0xhhを持つ文字 
     * \uhhhh 16 進値 0x hhhhを持つ文字*\x{h...h}16 進値0xh...hを持つ文字*\N{name}Unicode文字の名前が'name'の文字*/

    /*
     * Pattern：1.Pattern.quote(正規表現);
     * 自動全エスケープ
     * Matcher：3*.{Matcherインスタンス}.region(int start, int end);
     * 検索対象範囲を直接インデックスで制限する。
     * Matcher：3*.{Matcherインスタンス}.regionStart();
     * 検索対象範囲の先頭インデックス取得
     * Matcher：3*.{Matcherインスタンス}.regionEnd();
     * 検索対象範囲の末尾インデックス取得
     * Boolean：4.{Matcherインスタンス}.matches();
     * 一致性の真偽返還
     * Boolean：4.{Matcherインスタンス}.lookingAt();
     * 先頭文字からパターン一致性の真偽返還
     * Boolean：4.{Matcherインスタンス}.find();
     * 未検索範囲先頭から、一致性の真偽返還
     * 繰り返し使用にて、奥へ奥へと進む
     * 引数にインデックスを入れるとそこから検索する事も可能
     * ?：4.{Matcherインスタンス}.reset();
     * 検索範囲のリセット
     * int：4.{Matcherインスタンス}.start();
     * 先頭から最初に一致した、パターン先頭のインデックス返還
     * int：4.{Matcherインスタンス}.end();
     * 後方から最初に一致した、パターン末尾の一つ後ろのインデックス返還
     * String：4.{Matcherインスタンス}.group();
     * 前回パターン一致した部分の文字列変換
     */
    public static void main(String[] args) {
        // 1.正規表現regexを用意し比較対象の準備
        String regex = "AA|BB|CC";
        // 2.Patternクラスのインスタンスを用意し比較対象と合わせる準備
        // Pattern 変数名 = Pattern.compile(正規表現);
        Pattern p = Pattern.compile(regex);
        // 3.Matcherクラスのインスタンスを用意し、実際にPatternと合わせる
        // Matcher 変数名 = {patternインスタンス}.matcher(文字列);
        Matcher m = p.matcher("AA.BB.CC");
        // 3*.Matcherクラスのインスタンスに更新をかける
        m.region(1, 5);
        // 4.希望の出力形式に合わせて、Matcherインスタンスにメソッド利用
        System.out.println(m.reset());
        if (m.find()) {
            System.out.println(m.group());
        }
    }
}
