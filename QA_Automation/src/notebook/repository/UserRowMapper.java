package notebook.repository;


import com.task.Human;
 import org.apache.commons.dbutils.ResultSetHandler;


 import java.sql.ResultSet;
 import java.sql.SQLException;
 import java.util.ArrayList;
 import java.util.List;

/**
 * Created by 1512 on 10.03.2016.
 */
public class UserRowMapper{
    @Override
   public List<Human> handle(ResultSet rs) throws SQLException {
         List<Human> list = new ArrayList<>();
         while (rs.next()) {
             Human p = new Human();
             p.setName(rs.getString("name"));
             p.setAge(rs.getInt("age"));
             p.setEmail(rs.getString("email"));
             list.add(p);
         }
         return list;
     }

}
