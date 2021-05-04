package service;

import entity.User;

public interface UserService {
    void add(User user) throws Exception;
    void delete(User user);
    void update(User user);
    void login(User user) throws Exception;
}
