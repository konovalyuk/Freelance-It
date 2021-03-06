
package com.bionic.freelanceit.idao;

import com.bionic.freelanceit.entity.User;
import java.sql.Date;
import java.util.ArrayList;

public interface IUserDAO {
    public void add(User user);
    public ArrayList<User> findAll();
    public User findById(int id);
    public ArrayList<User> findByName(String Name);
    public User findByEmail(String email);
    public User findByLogin(String login);
    public void update(User user);
    public ArrayList<User> findAllActive(Boolean active);
    public ArrayList<User> findByBirthday(Date date);
    public Boolean find(String login, String password);
}
