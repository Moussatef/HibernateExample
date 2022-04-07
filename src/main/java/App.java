import DAO.StudentDAO;
import entity.Student;

import java.util.List;

public class App {
    public static void main(String[] args) {
        StudentDAO studentDao = new StudentDAO();
        Student student = new Student("OTHMAN", "MOUSSATEF", "moussatef@gmail.com");
        studentDao.saveStudent(student);

        List<Student> students = studentDao.getStudents();
        students.forEach(s -> System.out.println("First name : "
                +s.getFirstName()+"\n last name : "
                +s.getLastName()+"\n Email : "
                +s.getEmail() ));
    }
}
