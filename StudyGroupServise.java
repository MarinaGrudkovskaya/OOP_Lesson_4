package OOP.Lessen4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudyGroupServise {
    private StudyGroup studyGroup;

    public void removeStudentByFIO  (String firstName, String lastName, String middleName){
        Iterator<Student> iterator = studyGroup.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getFirstName().equals(firstName) &&
                    student.getLastName().equals(lastName) &&
                    student.getMiddleName().equals(middleName)){
                iterator.remove();
            }
        }
    }

    public List<Student> getSortedStudentList(){
        List<Student> studentList = new ArrayList<>(studyGroup.getStudentList());
        Collections.sort(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentByFIO() {
        List<Student> studentList = new ArrayList<>(studyGroup.getStudentList());
        studentList.sort(new UserComparator<Student>());
        return studentList;
    }

    public void createStudent(String firstName, String lastName, String middleName){
        studyGroup.createStudent(firstName, lastName, middleName);
    }
}
