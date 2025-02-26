package OOP.Lessen4;

import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student>{
    private List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void createStudent(String firstName, String lastName, String middleName){
        studentList.add(new Student(firstName,lastName,middleName));
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudyGroupIterator(this);
    }
}
