package Dao;

import module.Department;
import module.News;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sql2o.Connection;
import static org.junit.Assert.*;

import org.sql2o.Sql2o;

public class Sql2oDepartmentDaoTest {
    private static Sql2oDepartmentDao departmentDao;
    private static Sql2oNewsDao newsDao;
    private static Connection conn;

    @BeforeClass
    public static void setUp() throws Exception {
        departmentDao = new Sql2oDepartmentDao(DatabaseRule.sql2o);
        newsDao = new Sql2oNewsDao(DatabaseRule.sql2o);
        conn = DatabaseRule.sql2o.open();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("clearing database");
        departmentDao.clearAll();
        newsDao.clearAll();
    }

    @AfterClass
    public static void shutDown() throws Exception{
        conn.close();
        System.out.println("connection closed");
    }

    // helpers

    public Department setupDepartment(){
        Department department =  new Department("technology","build tech",20);
        departmentDao.add(department);
        return department;
    }

    public News setupNews(){
        News news =  new News("BBI demolition");
        newsDao.add(news);
        return news;
    }

    // Tests

    @Test
    public void getAll() throws Exception {
        Department department = setupDepartment();
        Department department1 = setupDepartment();
        assertEquals(2, departmentDao.getAll().size());
    }



}
