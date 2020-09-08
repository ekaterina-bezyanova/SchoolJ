package Homework3.StudentAspirant;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Aspirant("Alice", "Wonderland", "123", 4.3D);
        Student student2 = new Student("Bob", "Quiet", "124", 5.0D);
        Aspirant student3 = new Aspirant("Clara", "Corals", "123", 4.9D);
        Student[] students = new Student[]{student1, student2, student3};

        for (int i = 0; i < students.length; ++i) {
            System.out.println(students[i].getScholarship());
        }

    }
}
