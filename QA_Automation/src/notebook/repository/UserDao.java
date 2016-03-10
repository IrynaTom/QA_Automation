package notebook.repository;

import com.task.Human;
import org.apache.commons.dbutils.QueryRunner;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by 1512 on 10.03.2016.
 */
public class UserDao {

    Connection connection = ConnectionDB.getConnection();
     QueryRunner run = new QueryRunner();


     @Override
   public void save(Human person) {
        try {
             run.update(connection, "INSERT INTO `apps`.`user` (`name`, `age`, `email`) VALUES (?, ?, ?)", person.getName(), person.getAge(), person.getEmail());
    } catch (SQLException e) {
         throw new RuntimeException(e);
        }
       System.out.println("----------\n" + person + "saved\n----------");
    }


    public List<Human> getAll() {
       try {
           return run.query(connection, "select * from user", new UserRowMapper());
        } catch (SQLException e) {
            throw new RuntimeException(e);
      }
   }


    public List<Human> findByName(String name) {
      try {
            return run.query(connection, "select * from user where name = ?", new UserRowMapper(), name);
        } catch (SQLException e) {
            throw new RuntimeException(e);
          }
     }

}
