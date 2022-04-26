package com.example.ecommerceP.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {
    @Autowired
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/api/user")
    public User addUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PutMapping("/api/user")
    public User updateUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @DeleteMapping("/api/user/{id}")
    public ResponseEntity.BodyBuilder deleteUser(@PathVariable Integer id) {
        userService.deleteUserById(id);
        return ResponseEntity.ok();
    }
}
