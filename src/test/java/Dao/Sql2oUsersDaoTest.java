package Dao;

import module.Users;
import org.sql2o.Connection;
import static org.junit.Assert.*;

import org.junit.*;


public class Sql2oUsersDaoTest {
    private static Connection conn;
    private static Sql2oUsersDao usersDao;
    private static Sql2oDepartmentDao departmentDao;


    @Before
    public void setUp() throws Exception{

        departmentDao = new Sql2oDepartmentDao(DatabaseRule.sql2o);
        usersDao = new Sql2oUsersDao(DatabaseRule.sql2o);
        conn = DatabaseRule.sql2o.open();

    }
    @After
    public void tearDown() throws Exception {
        System.out.println("clearing database");
        //departmentDao.clearAll();
        usersDao.clearAll();
    }

    @AfterClass
    public static void shutDown() throws Exception{
        conn.close();
        System.out.println("connection closed");
    }

    @Test
    public void getAll() throws Exception {
        Users user1 = setupUsers();
        Users user2 = setupUsers();
        assertEquals(2, usersDao.getAll().size());
    }

    public Users setupUsers() {
        Users user = new Users("Nick","manager","Editor",department.getId());
        usersDao.add(user);
        return user;
    }

}
