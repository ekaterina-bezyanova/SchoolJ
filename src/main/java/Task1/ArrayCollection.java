package Task1;

import java.util.ArrayList;

public class ArrayCollection<E> implements MyCollection<E> {

    private ArrayList<E> arrayCollection;

    public ArrayCollection() {
        arrayCollection = new ArrayList<E>();
    }

    @Override
    public int size() {
        return arrayCollection.size();
    }

    @Override
    public void add(E item) {
        arrayCollection.add(item);
    }

    @Override
    public void remove(int index) {
        arrayCollection.remove(index);
    }

    @Override
    public void remove(E item) {
        arrayCollection.remove(item);
    }

    @Override
    public E get(int index) {
        return arrayCollection.get(index);
    }

    @Override
    public void clear() {
        arrayCollection.clear();
    }
}
