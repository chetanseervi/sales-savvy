package sales.savvy.service;

import java.util.Optional;

import sales.savvy.dto.LoginData;
import sales.savvy.entity.User;

public interface UserService {
    String addUser(User user);
    //User getUser(String username);
    Optional<User> getUser(String username);
    String validateUser(LoginData data);
    
}