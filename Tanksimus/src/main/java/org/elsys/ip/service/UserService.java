package org.elsys.ip.service;

import org.elsys.ip.models.Notification;
import org.elsys.ip.models.User;
import org.elsys.ip.repository.UserRepository;

import java.util.List;

public class UserService {
    private UserRepository userRepository = new UserRepository();
    public List<User> getUsers() { return userRepository.getUsers(); }
    public User getUserById(Integer id) { return userRepository.getUserById(id); }
    public void saveUser(User user) { userRepository.saveUser(user); }
    public User updateUser(Integer id, User user) { return userRepository.updateUser(id, user); }
    public void deleteUser(Integer id) { userRepository.deleteUser(id); }
    public List<Notification> getNotificationsByUserId(Integer id) { return userRepository.getNotificationsByUserId(id); }
}
