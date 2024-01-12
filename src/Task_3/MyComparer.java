package Task_3;

public class MyComparer implements Comparer<Integer> {
    @Override
    public int compare(Integer obj1, Integer obj2) {
        return obj1.compareTo(obj2);
    }
}
