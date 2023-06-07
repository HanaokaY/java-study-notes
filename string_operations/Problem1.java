// 問題: "Hello, World!"という文字列から", World!"を取り除いて、"Hello"だけを出力してください。

package string_operations;

public class Problem1 {
    static String str = "Hello, World!";
    public static void main(String[] args) {
        System.out.println(str.replace(", World!", ""));
    }
}