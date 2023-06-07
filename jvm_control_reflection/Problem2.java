// 問題: Personクラスを作成し、そのクラスのnameフィールドとgreetメソッドを持たせてください。その後、リフレクションを使ってPersonクラスのインスタンスを生成し、nameフィールドに値をセットし、greetメソッドを呼び出してください。

package jvm_control_reflection;

public class Problem2 {

    public void name() {
        
    }
}

class Person {
    private String name;

    public void greet() {
        System.out.println("Hello, " + name);
    }
}