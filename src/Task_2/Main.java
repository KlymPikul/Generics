package Task_2;
/*
Напишите обобщенный класс Pair, который представляет собой пару элементов любого типа.
У данного класса должны быть методы getFirst и getSecond.
 */
public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Klym", 34);
        System.out.println(pair.getFirst() + " " + pair.getSecond());
    }
}
