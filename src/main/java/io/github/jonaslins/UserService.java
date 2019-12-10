package io.github.jonaslins;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.NotFoundException;
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

    public void deleteById(String id) {
        User user = getById(id);
        if(user != null){
            userRepository.delete(user);
        }else{
            throw new NotFoundException();
        }
    }
}