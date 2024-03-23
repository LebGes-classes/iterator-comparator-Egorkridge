import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {
    private T[] elems;
    private int index = 0;

    public MyIterator(T[] elems) {
        this.elems = elems;
    }

    @Override
    public boolean hasNext() {
        return index < elems.length;
    }

    @Override
    public T next() {
        if (hasNext()) {
            return elems[index++];
        }
        throw new IndexOutOfBoundsException();
    }

    public static void main(String[] args) {
        Object[] wordsAndNumbers = {3, "four", 45, "idk", 356, 52, "SPB", "писятдва"};
        MyIterator<Object> iterator = new MyIterator<>(wordsAndNumbers);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
