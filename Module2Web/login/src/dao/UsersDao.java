package dao;

import model.Login;
import model.Users;

import java.util.ArrayList;
import java.util.List;

public class UsersDao {
    private static List<Users> users;
    static {
        users = new ArrayList<>();
        Users users1 = new Users();
        users1.setAge(10);
        users1.setName("John");
        users1.setAccount("john");
        users1.setEmail("john@codegym.com");
        users1.setPassword("123456");
        users.add(users1);



        Users  users2 = new Users();
        users2.setAge(20);
        users2.setName("Peter");
        users2.setAccount("peter");
        users2.setEmail("peter@codegym.com");
        users2.setPassword("123456");
        users.add(users2);


        Users users3 = new Users();
        users3.setAge(30);
        users3.setName("Mike");
        users3.setAccount("mike");
        users3.setEmail("mike@codegym.com");
        users3.setPassword("123456");
        users.add(users3);
    }


    public static Users checkLogin(Login login){
        for(Users u: users){
            if(u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
