package waa.waa_lab1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import waa.waa_lab1.domain.User;
import waa.waa_lab1.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

        @Autowired
        private UserService userService;

        @GetMapping

        public List<User> getAllUsers(){
            return userService.findAllUser();
        }

        @PostMapping
        public void save(@RequestBody User users){
            userService.save(users);
        }

        @GetMapping("/{id}")
        public User getUserById(@PathVariable long id){
            return userService.getById(id);
        }

        @DeleteMapping("/{id}")
        public void delete(@PathVariable long id){
            userService.delete(id);
        }

        @GetMapping("/filter")

        public List<User> getUsersHavingGreaterOnePost(@RequestParam(value = "n") Integer n ){
            return userService.findAllByPostsGreaterThan(n);
        }

    }





