package Task2;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Box {

    private ArrayList<Fruit> box;

    public Box() {
        box = new ArrayList<Fruit>();
    }

    public int size() {
        return box.size();
    }

    public void add(Fruit item) {
        if (!box.isEmpty()) {
            if (item.getClass() == box.get(0).getClass()) {
                box.add(item);
            } else {
                System.out.println("Некорректный тип фрукта");
            }
        } else {
            box.add(item);
        }
    }

    public Fruit get(int index) {
        return box.get(index);
    }

    float getWeight() {
        return box.size() * box.get(0).getWeight();
    }

    boolean compare(Box otherBox) {
        return this.getWeight() == otherBox.getWeight();
    }

    void relocate(Box otherBox) {
        if (box.get(0).getClass() == otherBox.box.get(0).getClass()) {
            for (int i = 0; i < box.size(); i++) {
                otherBox.add(box.get(i));
            }
            System.out.println("Фрукты пересыпаны");
            box.clear();
        } else {
            System.out.println("Не могу пересыпать фрукты!");
        }
    }
}
