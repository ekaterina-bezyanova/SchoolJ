package Task1;

public class Main {
    public static void main(String[] args) {

        ArrayCollection<String> array = new ArrayCollection<>();
        ListCollection<String> list = new ListCollection<>();

        // array
        array.add("5");
        array.add("2");
        array.add("3");

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }

        System.out.println("Размер массива: " + array.size());
        array.remove(2);

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }

        array.remove("5");

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }

        array.clear();

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }

        // list
        list.add("5");
        list.add("2");
        list.add("3");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Размер массива: " + list.size());
        list.remove(2);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.remove("5");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.clear();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
