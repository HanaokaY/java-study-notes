// 問題: "LearningJavaIsFun"という文字列を、大文字で区切って"Learning Java Is Fun"という形式に変換して出力してください。

package string_operations;

public class Problem3 {
    public static void main(String[] args) {
        String str = "LearningJavaIsFun";
        String[] parts = str.split("(?<=[A-Z])(?=[A-Z][a-z])|(?<=[a-z])(?=[A-Z])");
        String result = String.join(" ", parts);
        System.out.println(result);
    }
}