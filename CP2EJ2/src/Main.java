import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(ScienceCat.none, "Richard", 22);
        Teacher t2 = new Teacher(ScienceCat.none, "Lola", 23);
        Teacher t3 = new Teacher(ScienceCat.doctor, "Alain", 31);

        LinkedList<Teacher> teachers = new LinkedList<>();
        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);

        Department d = new Department(teachers);
        System.out.println(d.getTeacher(ScienceCat.doctor, 30));
    }
}