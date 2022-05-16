package module;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UsersTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getNameReturnsCorrectName() {
        Users user = setupUser();
        assertEquals("Nick", user.getName());
    }

    @Test
    public void getPositionReturnsCorrectPosition() {
        Users user = setupUser();
        assertEquals("manager", user.getPosition());
    }

    @Test
    public void getRoleReturnsCorrectRole() {
        Users user = setupUser();
        assertEquals("Editor", user.getRole());
    }

    @Test
    public void getDepartmentReturnsCorrectDepartment() {
        Users user = setupUser();
        assertEquals(1, user.getDepartmentId());
    }

    @Test
    public void setNameSetsCorrectName() throws Exception {
        Users user = setupUser();
        user.setName("Nick");
        assertNotEquals("Peter",user.getName());
    }


    @Test
    public void setPositionSetsCorrectPosition() throws Exception {
        Users user = setupUser();
        user.setPosition("junior");
        assertNotEquals("manager",user.getPosition());
    }

    @Test
    public void setRoleSetsCorrectRole() throws Exception {
        Users user = setupUser();
        user.setRole("developer");
        assertNotEquals("Editor",user.getRole());
    }

    //helper
    public Users setupUser(){
        return  new Users("Nick","manager","Editor",1);
    }
}
