package com.michon.travelchecklist.v1.user;

import com.michon.travelchecklist.v1.exceptions.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getTravellers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }

    public User saveTraveller(User user) {
        return userRepository.save(user);
    }

    public void deleteUserById(Long id) {userRepository.deleteById(id);
    }
}
