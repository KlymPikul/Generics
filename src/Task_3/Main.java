package Task_3;
/*
Определите обобщенный интерфейс Comparer, который имеет метод compare, сравнивающий два объекта.
Создайте класс, который имплементирует интерфейс Compare.
 */
public class Main {
    public static void main(String[] args) {
        MyComparer comparer = new MyComparer();
        System.out.println(comparer.compare(5, 10));
        System.out.println(comparer.compare(5, 5));
        System.out.println(comparer.compare(10, 5));
    }
}
