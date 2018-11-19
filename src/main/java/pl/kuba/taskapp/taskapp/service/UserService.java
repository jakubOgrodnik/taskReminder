package pl.kuba.taskapp.taskapp.service;

import pl.kuba.taskapp.taskapp.model.User;

public interface UserService {
    void save(User user);
    User findByUserName(String username);
}

