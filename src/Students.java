import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Students {

    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("jake todd");
        students.add("ane doe");
        students.add("leehee doe");
        students.add("deer doe");
        students.add("joe doe");

        System.out.println("students: " + students);
        students.add(2,"Eddie yadete");
        System.out.println("students: " + students);
        students.remove(3);

        System.out.println("students: " + students);
        Collections.sort(students);
        System.out.println("students: " + students);
    }


}
