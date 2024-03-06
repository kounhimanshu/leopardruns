package com.leopardruns.crud;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static int cnt = 0; //count id
    static {
        users.add(new User(++cnt, "sneha.shah@example.com", "Sneha Shah", "1995-03-18", "User"));
        users.add(new User(++cnt, "akash.verma@example.com", "Akash Verma", "1989-09-25", "Admin"));
        users.add(new User(++cnt, "tanvi.joshi@example.com", "Tanvi Joshi", "1992-12-07", "User"));
        users.add(new User(++cnt, "rohit.malhotra@example.com", "Rohit Malhotra", "1983-06-10", "User"));
        users.add(new User(++cnt, "divya.singh@example.com", "Divya Singh", "1990-11-30", "User"));
        users.add(new User(++cnt, "vivek.patel@example.com", "Vivek Patel", "1987-04-15", "User"));
        users.add(new User(++cnt, "ananya.gupta@example.com", "Ananya Gupta", "1998-08-22", "User"));

    }

    public List<User> findAll(){
        return users;
    }

    public User getUserById(int targetId){
        for(User us: users){
            if(us.getId() == targetId) return us;
        }
        return null;
    }

    public void deleteUserById(int targetId){
        for(int i = 0; i<users.size(); i++){
            User us = users.get(i);
            if(us.getId() == targetId){
                users.remove(i);
                return;
            }
        }
    }

    public User saveUser(User user){
        user.setId(++cnt);
        users.add(user);
        return user;
    }

    public User updateUser(int id, User updateUser){
        for(User user: users){
            if(user.getId() == id){
                user.setEmail(updateUser.getEmail());
                user.setName(updateUser.getName());
                user.setDob(updateUser.getDob());
                user.setRole(updateUser.getRole());
                return user;
            }
        }
        return null;

    }
}
