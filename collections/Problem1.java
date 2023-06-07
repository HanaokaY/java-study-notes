// 問題: StringのArrayListを作成し、"Java", "Python", "C++"を追加してください。その後、"Python"を削除し、全ての要素を出力してください。

package collections;

import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        int[] ary = {1, 2, 3}; // 配列の宣言と初期化

        // 新しい要素を追加するための新しい配列を作成
        int[] newArray = new int[ary.length + 1];

        // 元の配列の要素を新しい配列にコピー
        for (int i = 0; i < ary.length; i++) {
            newArray[i] = ary[i];
        }

        // 新しい要素を新しい配列の最後の位置に追加
        newArray[newArray.length - 1] = 4; // 例として4を追加

        // 新しい配列を元の変数に代入
        ary = newArray;

        System.out.println(Arrays.toString(ary));
        
    }
}