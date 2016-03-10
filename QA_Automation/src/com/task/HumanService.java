package com.task;

import com.task.Human;
import  notebook.repository.UserDao;
import java.util.List;
import static com.task.Validation.
import static hw5.Validator.isValidPerson;

/**
 * Created by 1512 on 10.03.2016.
 */
public class HumanService {
    UserDao userDao = new UserDao();


                 public void save(Human person) {
               if (isValidPerson(person)) {
                   userDao.save(person);
                   }
           }

                 public List<Human> findByName(String name) {
                return userDao.findByName(name);
                 }


                 public List<Human> getAllPersons() {
               return userDao.getAll();
             }




}
