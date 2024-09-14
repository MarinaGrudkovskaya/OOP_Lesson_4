package OOP.Lessen4;

import java.util.List;

public class StudentControllerController implements UserController<Student> {
    private final StudyGroupServise studyGroupServise = new StudyGroupServise();
    private StreamServise streamServise = new StreamServise();

    private final StudentView studentView = new StudentView();

    public void removeStudentByFIO  (String firstName, String lastName, String middleName) {
        studyGroupServise.removeStudentByFIO(firstName, lastName, middleName);
    }
    public List<Student> getSortedStudentList(){
        List<Student> studentList = studyGroupServise.getSortedStudentList();
        studentView.sendOnConsole(studentList);
        return studentList;
    }
    public List<Student> getSortedStudentByFIO() {
        List<Student> studentList = studyGroupServise.getSortedStudentByFIO();
        studentView.sendOnConsole(studentList);
        return studentList;
    }
    
    public StudentControllerController() {
        this.streamServise = streamServise;
    }
    public void sortStream(List<Stream> streamList){
        streamServise.sortStreamBySize();
    }

    @Override
    public void creeate(String firstName, String LastName, String middleName) {
        studyGroupServise.createStudent(firstName, LastName, middleName);
    }
}
