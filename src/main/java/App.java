import Dao.DB;
import Dao.Sql2oDepartmentDao;
import Dao.Sql2oNewsDao;
import Dao.Sql2oUsersDao;
import com.google.gson.Gson;
import org.sql2o.Connection;

public class App {
    public static void main(String[] args) {
        Sql2oDepartmentDao departmentDao;
        Sql2oNewsDao newsDao;
        Sql2oUsersDao userDao;
        Connection conn;
        Gson gson = new Gson();

        departmentDao = new Sql2oDepartmentDao(DB.sql2o);
        newsDao = new Sql2oNewsDao(DB.sql2o);
        userDao = new Sql2oUsersDao(DB.sql2o);
        conn = DB.sql2o.open();

    }
}
