package OOP.Lessen4;

public interface UserController<T extends User> {
    void creeate(String firstName, String LastName, String middleName);
}
