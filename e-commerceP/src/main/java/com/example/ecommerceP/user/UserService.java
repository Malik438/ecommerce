package com.example.ecommerceP.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService   {

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user)
    {
        return userRepository.save(user);
    }

    public void deleteUserById(Integer id)
    {
        userRepository.deleteById(id);
    }

    public User getUserById(Integer id)
    {
        return userRepository.findById(id).orElse(null);
    }
}
