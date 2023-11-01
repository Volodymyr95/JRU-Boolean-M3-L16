import oop.adapter.Student;
import oop.adapter.StudentAdapter;
import oop.adapter.UserService;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        StudentAdapter studentAdapter = new StudentAdapter();
        new UserService().create(studentAdapter.map(student));


    }
}