package web.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import web.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {

    List<User> getAllUsers();

    void addUser(User user);

    User getUser(Long id);

    void updateUser(User user);

    void deleteUser(Long id);

    void addInitUsers();

    @Override
    UserDetails loadUserByUsername(String s) throws UsernameNotFoundException;
}
