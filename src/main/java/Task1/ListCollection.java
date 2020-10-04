package Task1;

import java.util.LinkedList;

public class ListCollection<E> implements MyCollection<E> {

    private LinkedList<E> listCollection;

    public ListCollection() {
        listCollection = new LinkedList<E>();
    }

    @Override
    public int size() {
        return listCollection.size();
    }

    @Override
    public void add(E item) {
        listCollection.add(item);
    }

    @Override
    public void remove(int index) {
        listCollection.remove(index);
    }

    @Override
    public void remove(E item) {
        listCollection.remove(item);
    }

    @Override
    public E get(int index) {
        return listCollection.get(index);
    }

    @Override
    public void clear() {
        listCollection.clear();
    }
}
