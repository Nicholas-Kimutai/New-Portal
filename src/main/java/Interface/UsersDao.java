package Interface;

import module.Users;

import java.util.List;

public interface UsersDao {
    //CRUD
    void add(Users users);
    //read
    List<Users> getAll();
    List<Users> getAllUsersForADepartment(int departmentId);

    //delete
    void deleteById(int id);
    void clearAll();

}
