package Dao;

import Interface.UsersDao;
import module.Users;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

public class Sql2oUsersDao implements UsersDao {
    private final Sql2o sql2o;

    public Sql2oUsersDao(Sql2o sql2o) {
        this.sql2o = sql2o;

    }


    @Override
    public void add(Users users) {

        String sql = "INSERT INTO users (name,position,role,departmentid) VALUES(:name,:position,:role,:departmentId)";
        try (Connection conn = sql2o.open()){
            int id = (int) conn.createQuery(sql,true)
                    .bind(users)
                    .executeUpdate()
                    .getKey();
            users.setId(id);

        }catch (Sql2oException ex){
            System.out.println(ex);
        }

    }
}
