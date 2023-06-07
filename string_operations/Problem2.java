// 問題: "Java Programming"という文字列を逆にして出力してください。

package string_operations;

public class Problem2 {
    public static void main(String[] args) {
        String str = "Java Programming";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}