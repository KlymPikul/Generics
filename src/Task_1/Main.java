package Task_1;
/*
Создайте класс GenericStack, который реализует стек с использованием generics.
Стек должен поддерживать операции push (добавление элемента) и pop (удаление и возврат верхнего элемента).
 */

public class Main {
    public static void main(String[] args) {


        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
    }
}

