//package Dao;
//
//import module.Department;
//import module.Users;
//import org.sql2o.Connection;
//import static org.junit.Assert.*;
//
//import org.junit.*;
//
//
//public class Sql2oUsersDaoTest {
//    private static Connection conn;
//    private static Sql2oUsersDao usersDao;
//    private static Sql2oDepartmentDaoTest departmentDao;
//
//
//    @Before
//    public void setUp() throws Exception{
//
//        departmentDao = new Sql2oDepartmentDaoTest(DatabaseRule.sql2o);
//        usersDao = new Sql2oUsersDao(DatabaseRule.sql2o);
//        conn = DatabaseRule.sql2o.open();
//
//    }
//    @After
//    public void tearDown() throws Exception {
//        System.out.println("clearing database");
//        //departmentDao.clearAll();
//        usersDao.clearAll();
//    }
//
//    @AfterClass
//    public static void shutDown() throws Exception{
//        conn.close();
//        System.out.println("connection closed");
//    }
//
//    //helpers
//    public Users setupUser(){
//        Users user = new Users("larry","manager","news anchor",1);
//        usersDao.add(user);
//        return  user;
//    }
//
//    public Users  setupUserForADepartment(Department department){
//        Users user = new Users("larry","manager","news anchor",department.getId());
//        usersDao.add(user);
//        return user;
//    }
//
//    public Department setupDepartment(){
//        Department department =  new Department("technology","build tech",20);
//        departmentDao.add(department);
//        return department;
//    }
//
//    Tests
//    @Test
//    public void getAll() throws Exception {
//        Users user1 = setupUsers();
//        Users user2 = setupUsers();
//        assertEquals(2, usersDao.getAll().size());
//    }
//    @Test
//    public void getAllUsersForADepartment() throws Exception {
//        Department department1 = setupDepartment();
//        Department department2 = setupDepartment();
//        Users user1 = setupUserForADepartment(department1);
//        Users user2 = setupUserForADepartment(department1);
//        Users otherUser = setupUserForADepartment(department2);
//
//        assertEquals(2, usersDao.getAllUsersForADepartment(department1.getId()).size());
//    }
//
////    @Test
////    public void deleteById() throws Exception {
////        Users testUser = setupUser();
////        Users otherUser = setupUser();
////        assertEquals(2, usersDao.getAll().size());
////        usersDao.deleteById(testUser.getId());
////        assertEquals(1, usersDao.getAll().size());
////    }
//
////    @Test
////    public void clearAll() throws Exception {
////        Users testUser = setupUser();
////        Users otherUser = setupUser();
////        usersDao.clearAll();
////        assertEquals(0, usersDao.getAll().size());
////    }
//
//
//
//}
