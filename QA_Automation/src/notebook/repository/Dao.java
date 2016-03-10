package notebook.repository;

import com.task.Human;

 import java.util.List;

/**
 * Created by 1512 on 10.03.2016.
 */
public class Dao {
    void save(Human person);
     List<Human> getAll();
    List<Human> findByName(String name);

}
