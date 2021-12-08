package web.dao;

import org.springframework.security.core.userdetails.UserDetails;
import web.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void addUser(User user);

    User getUser(Long id);

    void deleteUser(Long id);

    void updateUser(User user);

    UserDetails loadUserByUsername(String s);
}
