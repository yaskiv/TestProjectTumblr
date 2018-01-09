
package home.antonyaskiv.testprojecttumblr.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response_of_API {

    @SerializedName("blog")
    @Expose
    private Blog blog;
    @SerializedName("posts")
    @Expose
    private List<Post> posts = null;
    @SerializedName("total_posts")
    @Expose
    private Integer totalPosts;

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public Integer getTotalPosts() {
        return totalPosts;
    }

    public void setTotalPosts(Integer totalPosts) {
        this.totalPosts = totalPosts;
    }

}
