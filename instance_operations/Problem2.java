// 問題: Car クラスを作成し、privateフィールドとして String model と int year を持たせ、これらの値を設定・取得するための Getter と Setter を追加してください。また、新たな Car インスタンスを作成し、任意の値を設定して出力してください。

package instance_operations;

public class Problem2 {
    public static void main() {
        
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello, my name is " + name);
    }
}