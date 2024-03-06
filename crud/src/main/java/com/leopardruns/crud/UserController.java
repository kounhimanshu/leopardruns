package com.leopardruns.crud;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private UserDaoService service;

    public UserController(UserDaoService service){
        this.service = service;
    }

    @GetMapping("/users") // get all users
    public List<User> getallUsers(){
        return service.findAll();
    }

    @GetMapping("/users/{id}") // get users by id
    public User getUserID(@PathVariable int id){
        return service.getUserById(id);
    }

    @DeleteMapping("/users/{id}") // delete user by id
    public void deleteUserID(@PathVariable int id){
        service.deleteUserById(id);
    }

    @PostMapping("/users") //create new user (don't give id as it'll be automatically assigned
    public ResponseEntity<User> createUser(@RequestBody User user){
        service.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/users/{id}") // update user by id (id can't be updated as it will be fixed to avoid error
    public ResponseEntity<User> updateUser (@PathVariable int id, @RequestBody User updateUser){
        User user = service.updateUser(id, updateUser);
        return ResponseEntity.ok(user);
    }

}
