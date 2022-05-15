package module;

import java.util.Objects;

public class News {
    private int id;
    private String post;

    public News(String post) {
        this.post = post;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return id == news.id &&
                post.equals(news.post);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, post);
    }
}
