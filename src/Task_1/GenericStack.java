package Task_1;
import java.util.ArrayList;
import java.util.List;

public class GenericStack<T> {
    private List<T> stack;

    public GenericStack() {
        this.stack = new ArrayList<>();
    }

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (!stack.isEmpty()) {
            int lastIndex = stack.size() - 1;
            T poppedItem = stack.get(lastIndex);
            stack.remove(lastIndex);
            return poppedItem;
        } else {
            return null;
        }
    }
}
