package OOP.Lessen4;

public class TeacherServise {
    public Teacher createTeacher(String firstName, String lastName, String middleName){
        return new Teacher(firstName, lastName, middleName);
    }

}
