package io.github.jonaslins;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class UserService {

    @Inject
    UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.listAll();
    }

    public User save(User user) {
        userRepository.persist(user);
        return user;
    }

    public User getById(String id) {
       return userRepository.findById(id);
    }

}