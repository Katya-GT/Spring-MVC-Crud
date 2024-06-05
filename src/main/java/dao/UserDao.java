package dao;

import model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    void deleteUser(Long userId);
    void updateUser(User user);
    User getUserById(Long userId);
    List<User> getAllUsers();

}
