
public class Teacher {
    private ScienceCat scienceCat;
    private String name;
    private int age;

    public Teacher(ScienceCat scienceCat, String name, int age) {
        this.scienceCat = scienceCat;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public ScienceCat getScienceCat() {
        return scienceCat;
    }

    public int getAge() {
        return age;
    }
}
