package ra.service;

import ra.Dao.ConnectionDaoI;
import ra.Dao.ConnectionDaoImpl;
import ra.model.User;
import java.util.List;

public class UserService implements UserServiceI {
    private ConnectionDaoI connect = new ConnectionDaoImpl();
    private static final String INSERT_USER = "INSERT INTO user (name, password,country) VALUES (?, ?, ?)";



    @Override
    public void addUser(User user) {
        connect.addUser(user);
    }

    @Override
    public List<User> getAllUser() {
        return connect.getAllUser();
    }

    @Override
    public User getUserById(Integer id) {
        return connect.getUserById(id);
    }

    @Override
    public void deleteUser(Integer id) {
        connect.deleteUser(id);
    }

    @Override
    public List<User> getUserByCountry(String keyword) {
        return connect.getUserByCountry(keyword);
    }

    @Override
    public List<User> sortBy(String keyword) {
          return connect.sortBy(keyword);
    }


}