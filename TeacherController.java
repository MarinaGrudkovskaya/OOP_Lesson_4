package OOP.Lessen4;

import java.util.List;

/*
� Создать класс УчительКонтроллер и реализовать возможность создания, редактирования конкретного учителя
и отображения списка учителей имеющихся в системе
 */
public class TeacherController implements UserController<Teacher>{

    private Teacher teacher;
    public UserView<Teacher> teacherUserView = new TeacherView();
    public void sendOnConsole(List<Teacher> teacherList){
        teacherUserView.sendOnConsole(teacherList);
    }
    @Override
    public void creeate(String firstName, String LastName, String middleName) {
        new Teacher(teacher.getFirstName(), teacher.getLastName(), teacher.getMiddleName());
    }
}
