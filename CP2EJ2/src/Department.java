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

    int binarySearch(int[] arr, int lower, int upper, int element)
    {
        if (upper>=lower)
        {
            int mid = lower + (upper - lower)/2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == element)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > element)
                return binarySearch(arr, lower, mid-1, element);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid+1, upper, element);
        }

        // We reach here when element is not present
        //  in array
        return -1;
    }
}
