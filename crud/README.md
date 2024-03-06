## CRUD Operation for user module.

**Port** : 
```plaintext 
http://localhost:8080
```

**Get all users**  ```(GET)```
```plaintext
http://localhost:8080/users 
```

**Get user with id**  ```(GET)```
```plaintext 
http://localhost:8080/users/2
 ```

**Create new user**  ``` (POST) ``` body json
```plaintext
http://localhost:8080/users
```
```plaintext
{
    "email": "himanshu.tiwari@example.com",
    "name": "Himanshu Tiwari",
    "dob": "2003-08-21",
    "role": "Admin"
}
```
it will be assigned internally

**Update user by id**  ```(PUT)``` body json
```plaintext
http://localhost:8080/users/7
```
```plaintext
{
    "email": "harshita.singh@example.com",
    "name": "Harshita Singh",
    "dob": "2003-04-21",
    "role": "Moderator"
}
```
id will remain the same. id can't be changed or updated

**Delete user by id**  ```(DELETE)```
```plaintext
http://localhost:8080/users/6
```
Thank You
