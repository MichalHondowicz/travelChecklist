package com.michon.travelchecklist.v1.user;

import com.michon.travelchecklist.v1.exceptions.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    @ResponseBody
    public List<User> getUsers(){
        return userService.getTravellers();
    }

    @PostMapping
    @ResponseBody
    public User addUser(@RequestBody User user){
        return userService.saveTraveller(user);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public User getUserByID(@PathVariable Long id){
        return userService.getUserById(id).orElseThrow(ResourceNotFoundException::new);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteUserById(@PathVariable Long id){
        userService.deleteUserById(id);
    }
}
