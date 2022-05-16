package module;

import org.junit.Test;

import static org.junit.Assert.*;
public class NewsTest {
    @Test
    public void getPostReturnsCorrectPost() {
        News news = setupNews();
        assertEquals("General elections", news.getPost());
    }

    @Test
    public void setPostSetsCorrectPost() throws Exception {
        News news =setupNews();
        news.setPost("Politics");
        assertNotEquals("General elections",news.getPost());
    }

    public News setupNews(){
        return new News("General elections");
    }
}
