package ra.service;

import ra.model.User;
import ra.model.UserUpdate;

import java.util.List;

public interface UserServiceI {
    List<User> sortBy( String keyword);
    List<User> getUserByCountry( String keyword);
    User getUserById(Integer id);
    public void addUser(User user);
    List<User> getAllUser();
    public void deleteUser(Integer id);
}
