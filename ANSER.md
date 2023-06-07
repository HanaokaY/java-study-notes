# 解答

## 文字列操作

1. `Problem1.java`
```java
String str = "Hello, World!";
String upperStr = str.toUpperCase();
System.out.println(upperStr);  // Output: HELLO, WORLD!
```

2. `Problem2.java`
```java
String str = "   Hello, World!  ";
String trimmedStr = str.trim();
System.out.println(trimmedStr);  // Output: Hello, World!
```

3. `Problem3.java`
```java
String str = "Hello, World!";
String replacedStr = str.replace("World", "Java");
System.out.println(replacedStr);  // Output: Hello, Java!
```

## 日付と時間の取扱い

1. `Problem1.java`
```java
LocalDate date = LocalDate.now();
System.out.println(date);
```

2. `Problem2.java`
```java
LocalDateTime dateTime = LocalDateTime.of(2023, 6, 15, 10, 30);
System.out.println(dateTime);
```

3. `Problem3.java`
```java
LocalDateTime now = LocalDateTime.now();
LocalDateTime future = now.plusDays(10);
System.out.println(future);
```

## コレクション

1. `Problem1.java`
```java
List<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
list.add("Cherry");
System.out.println(list);  // Output: [Apple, Banana, Cherry]
```

2. `Problem2.java`
```java
Map<String, Integer> map = new HashMap<>();
map.put("Apple", 100);
map.put("Banana", 200);
map.put("Cherry", 300);
System.out.println(map);  // Output: {Apple=100, Banana=200, Cherry=300}
```

3. `Problem3.java`
```java
Set<String> set = new HashSet<>();
set.add("Apple");
set.add("Banana");
set.add("Cherry");
set.add("Apple");
System.out.println(set);  // Output: [Apple, Banana, Cherry]
```

## インスタンスの基本操作

1. `Problem1.java`
```java
MyClass myClass = new MyClass();
myClass.myMethod();
```

2. `Problem2.java`
```java
MyClass myClass = new MyClass();
myClass.setMyField("Hello");
System.out.println(myClass.getMyField());  // Output: Hello
```

3. `Problem3.java`
```java
MyClass myClass1 = new MyClass();
MyClass myClass2 = new MyClass();
myClass1.setMyField("Hello");
myClass2.setMyField("World");
System.out.println(myClass1.getMyField());  // Output: Hello
System.out.println(myClass2.getMyField());  // Output: World
```

## さまざまな種類のクラス

1. `Problem1.java`
```java
public class MyClass {
    private String myField;
    // getter and setter for myField
}
```

2. `Problem2.java`
```java
public class MyChildClass extends MyClass {
    private String myChildField;
    // getter and setter for myChildField
}
```

3. `Problem3.java`
```java
public class MyAbstractClass {
    public abstract void myAbstractMethod();
}

public class MyConcreteClass extends MyAbstractClass {
    @Override
    public void myAbstractMethod() {
        // Implementation
    }
}
```

## ラムダ式と関数オブジェクト

1. `Problem1.java`
```java
new Thread(() -> System.out.println("Hello, World!")).start();
```

2. `Problem2.java`
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
System.out.println(evenNumbers); // Output: [2, 4, 6]
```

3. `Problem3.java`
```java
List<Integer> numbers = Arrays.asList(1, 10, 20);
numbers.forEach(n -> System.out.println(n >= 10 ? "OK" : "NG")); // Output: NG OK OK
```

## JVM制御とリフレクション

1. `Problem1.java`
```java
System.out.println(System.getProperty("java.version"));
```

2. `Problem2.java`
```java
try {
    Class<?> personClass = Class.forName("Person");
    Object person = personClass.newInstance();
    Field nameField = personClass.getDeclaredField("name");
    nameField.setAccessible(true);
    nameField.set(person, "John");
    Method greetMethod = personClass.getDeclaredMethod("greet");
    greetMethod.setAccessible(true);
    greetMethod.invoke(person);
} catch (Exception e) {
    e.printStackTrace();
}
```

3. `Problem3.java`
```java
Runtime runtime = Runtime.getRuntime();
long maxMemory = runtime.maxMemory();
long totalMemory = runtime.totalMemory();
long freeMemory = runtime.freeMemory();
System.out.println("Max Memory: " + maxMemory);
System.out.println("Total Memory: " + totalMemory);
System.out.println("Free Memory: " + freeMemory);
```

## 非標準ライブラリの活用

1. `Problem1.java`
```java
// Apache Commons Lang
String str = "Hello, World!";
String reversedStr = StringUtils.reverse(str);
System.out.println(reversedStr);
```

2. `Problem2.java`
```java
// Google Guava
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
List<Integer> oddNumbers = numbers.stream().filter(Predicates.not(new Predicate<Integer>() {
    public boolean apply(Integer number) {
        return number % 2 == 0;
    }
})).collect(Collectors.toList());
System.out.println(oddNumbers); // Output: [1, 3, 5]
```

3. `Problem3.java`
```java
// Jackson
String json = "{\"name\":\"John\", \"age\":30}";
ObjectMapper mapper = new ObjectMapper();
JsonNode node = mapper.readTree(json);
System.out.println(node.get("name").asText()); // Output: John
```

それでは、続きの解答を提供します。

## さまざまなファイル形式

### CSVファイル

以下はApache Commons CSVを利用した場合の一例です。

1. `Problem1.java`
```java
// CSVファイルの作成
try (CSVPrinter printer = new CSVPrinter(new FileWriter("output.csv"), CSVFormat.DEFAULT.withHeader("Name", "Email"))) {
    printer.printRecord("John", "john@example.com");
} catch (IOException e) {
    e.printStackTrace();
}
```

2. `Problem2.java`
```java
// CSVファイルの読み込み
try (CSVParser parser = CSVParser.parse(new FileReader("input.csv"), CSVFormat.DEFAULT.withFirstRecordAsHeader())) {
    for (CSVRecord record : parser) {
        System.out.println("Name: " + record.get("Name") + ", Email: " + record.get("Email"));
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

### JSONファイル

以下はJacksonを利用した場合の一例です。

3. `Problem3.java`
```java
// JSONファイルの作成
ObjectMapper mapper = new ObjectMapper();
Person person = new Person("John", "john@example.com");
mapper.writeValue(new File("person.json"), person);

// JSONファイルの読み込み
Person personFromJson = mapper.readValue(new File("person.json"), Person.class);
System.out.println(personFromJson);
```

### XMLファイル

以下はJAXBを利用した場合の一例です。

4. `Problem4.java`
```java
// XMLファイルの作成
JAXBContext context = JAXBContext.newInstance(Person.class);
Marshaller marshaller = context.createMarshaller();
Person person = new Person("John", "john@example.com");
marshaller.marshal(person, new File("person.xml"));

// XMLファイルの読み込み
Unmarshaller unmarshaller = context.createUnmarshaller();
Person personFromXml = (Person) unmarshaller.unmarshal(new File("person.xml"));
System.out.println(personFromXml);
```


## ネットワーク通信

1. `Problem1.java`
```java
URL url = new URL("http://example.com");
HttpURLConnection connection = (HttpURLConnection) url.openConnection();
connection.setRequestMethod("GET");
BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
String inputLine;
StringBuilder content = new StringBuilder();
while ((inputLine = in.readLine()) != null) {
    content.append(inputLine);
}
in.close();
System.out.println(content.toString());
```

2. `Problem2.java`
```java
try (Socket socket = new Socket("localhost", 8080);
     PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
    out.println("Hello, World!");
} catch (IOException e) {
    e.printStackTrace();
}
```

3. `Problem3.java`
```java
URL url = new URL("http://example.com");
HttpURLConnection connection = (HttpURLConnection) url.openConnection();
connection.setRequestMethod("POST");
connection.setDoOutput(true);
DataOutputStream out = new DataOutputStream(connection.getOutputStream());
out.writeBytes("param1=value1&param2=value2");
out.flush();
out.close();
BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
String inputLine;
StringBuilder content = new StringBuilder();
while ((inputLine = in.readLine()) != null) {
    content.append(inputLine);
}
in.close();
System.out.println(content.toString());
```

## データベースアクセス

1. `Problem1.java`
```java
try (Connection connection = DriverManager.getConnection("jdbc:sqlite:test.db");
     Statement statement = connection.createStatement()) {
    statement.executeUpdate("CREATE TABLE users (name TEXT, email TEXT)");
} catch (SQLException e) {
    e.printStackTrace();
}
```

2. `Problem2.java`
```java
try (Connection connection = DriverManager.getConnection("jdbc:sqlite:test.db");
     PreparedStatement statement = connection.prepareStatement("INSERT INTO users (name, email) VALUES (?, ?)")) {
    statement.setString(1, "John Doe");
    statement.setString(2, "john@example.com");
    statement.executeUpdate();
} catch (SQLException e) {
    e.printStackTrace();
}
```

3. `Problem3.java`
```java
try (Connection connection = DriverManager.getConnection("jdbc:sqlite:test.db");
     Statement statement = connection.createStatement();
     ResultSet resultSet = statement.executeQuery("SELECT * FROM users")) {
    while (resultSet.next()) {
        System.out.println("Name: " + resultSet.getString("name") + ", Email: " + resultSet.getString("email"));
    }
} catch (SQLException e) {
    e.printStackTrace();
}
```

## 単体テスト (JUnit)

1. `CalculatorTest.java`
```java
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(1, 2));
    }
}
```

2. `MyUtilsTest.java`
```java
import org.junit.Test;
import static org.junit.Assert.*;

public class MyUtilsTest {
    @Test
    public void testReverse() {
        MyUtils utils = new MyUtils();
        assertEquals("cba", utils.reverse("abc"));
    }
}
```

3. `MyUtilsTest.java`
```java
import org.junit.Test;
import static org.junit.Assert.*;

public class MyUtilsTest {
    @Test
    public void testContains() {
        MyUtils utils = new MyUtils();
        assertTrue(utils.contains(Arrays.asList("a", "b", "c"), "b"));
        assertFalse(utils.contains(Arrays.asList("a", "b", "c"), "d"));
    }
}


```

## スレッドによる並列処理

1. `Problem1.java`
```java
for (int i = 0; i < 10; i++) {
    new Thread(() -> System.out.println("Hello, World!")).start();
}
```

2. `Problem2.java`
```java
ExecutorService executor = Executors.newFixedThreadPool(10);
List<Callable<Integer>> tasks = new ArrayList<>();
for (int i = 0; i < 10; i++) {
    tasks.add(() -> IntStream.rangeClosed(1, 10).sum());
}
try {
    List<Future<Integer>> results = executor.invokeAll(tasks);
    for (Future<Integer> result : results) {
        System.out.println(result.get());
    }
} catch (InterruptedException | ExecutionException e) {
    e.printStackTrace();
} finally {
    executor.shutdown();
}
```

3. `Problem3.java`
```java
public class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
```
