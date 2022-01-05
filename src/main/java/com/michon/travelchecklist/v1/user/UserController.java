package com.michon.travelchecklist.v1.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "v1/users")
public class UserController {

    private final UserService userService;

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
        return userService.getUserById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteUserById(@PathVariable Long id){
        userService.deleteUserById(id);
    }
}
