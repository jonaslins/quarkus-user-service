package io.github.jonaslins;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class UserService {

    @Inject
    private UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.listAll();
    }

    public User save(User user) {
        userRepository.persist(user);
        return user;
    }
}