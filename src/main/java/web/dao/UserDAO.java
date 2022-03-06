package web.dao;

import web.model.User;
import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    User getUserById(long id);

    void add(User user);

    void update(Long id, User newUser);

    void delete(long id);
}
