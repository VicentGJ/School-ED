import java.util.Iterator;
import java.util.LinkedList;

public class Department {
    private LinkedList<Teacher> linkedList;

    public Department(LinkedList<Teacher> linkedList) {
        this.linkedList = new LinkedList<>();
        this.linkedList.addAll(linkedList);
    }

    public String getTeacher(ScienceCat scienceCat, int age) {
        Iterator<Teacher> iterator = this.linkedList.iterator();
        String result = "";
        while (result.isBlank() && iterator.hasNext()) {
            Teacher current = iterator.next();
            if (current.getAge()>=age && current.getScienceCat() == scienceCat) {
                result = current.getName();
            }
        }
        return result;
    }
}
